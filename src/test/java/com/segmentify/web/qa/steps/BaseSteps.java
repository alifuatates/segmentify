package com.segmentify.web.qa.steps;

import com.segmentify.web.qa.pages.homePage.HomePage;
import com.segmentify.web.qa.pages.loginPage.LoginPage;
import com.segmentify.web.qa.pages.searchPage.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Properties;

public class BaseSteps {

    private WebDriver webDriver;


    public BaseSteps() {
        webDriver = Hooks.webDriver;
    }

    @Given("I navigate to amazon.com.tr homepage")
    public void iNavigateToHepsiburadaHomepage() {
        System.out.println("I navigate to amazonc.com.tr homepage");
        String url = "https://www.amazon.com.tr/";
        webDriver.get(url);
    }

    @When("user login system")
    public void userLoginSystem() throws InterruptedException, IOException {

        Properties properties = new Properties();
        FileInputStream inputStream = new FileInputStream("src/main/resources/properties/testData.poperties");
        properties.load(inputStream);
        LoginPage loginPage = new LoginPage(webDriver);
        HomePage homePage = new HomePage(webDriver);
        homePage.getLoginBtn().click();
        loginPage.getEmailArea().sendKeys(properties.getProperty("Username"));
        loginPage.getContinueBtn().click();
        Thread.sleep(2000);
        loginPage.getPasswordArea().sendKeys(properties.getProperty("Password"));
        Thread.sleep(2000);
        loginPage.getSignInSubmitBtn().click();
        Thread.sleep(3000);
    }

    @Then("the page must have {string} content")
    public void thePageMustHaveContent(String content) {
        Assert.assertTrue(webDriver.getPageSource().contains(content));
    }

    @And("user logout system")
    public void userLogoutSystem() {
        HomePage homePage = new HomePage(webDriver);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(homePage.getUserMenu()).perform();
        homePage.getLogoutBtn().click();
    }

    @When("user search product {string}")
    public void userSearchProduct(String product) {
        SearchPage searchPage = new SearchPage(webDriver);
        searchPage.getSearchArea().click();
        searchPage.getSearchArea().sendKeys(product);
        searchPage.getSearchBtn().click();
    }

    @Then("confirm search result")
    public void ConfirmSearchResult() throws IOException {
        String directory = "searchResult";
        File file = new File(directory);
        String[] currentFiles;
        if (file.isDirectory()) {
            currentFiles = file.list();
            for (int i = 0; i < currentFiles.length; i++) {
                File myFile = new File(file, currentFiles[i]);
                myFile.delete();
            }
        }
        SearchPage searchPage = new SearchPage(webDriver);
        for (int i = 0; i < searchPage.getSearchResult().size(); i++) {
            String text = searchPage.getSearchResult().get(i).getText();
            System.out.println(text);
            File f = new File("searchResult/result.txt");
            try{
                FileUtils.writeStringToFile(f, text, Charset.defaultCharset());
            }catch(IOException exc){
                exc.printStackTrace();
            }
            webDriver.quit();
        }
    }
}