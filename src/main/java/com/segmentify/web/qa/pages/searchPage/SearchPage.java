package com.segmentify.web.qa.pages.searchPage;

import com.segmentify.web.qa.pages.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Getter
public class SearchPage extends BasePage {

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchArea;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchBtn;

    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[6]/div/div/div/div/div[3]")
    private List<WebElement> searchResult;

    public SearchPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

}