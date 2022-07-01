package com.segmentify.web.qa.pages.homePage;

import com.segmentify.web.qa.pages.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@Getter
public class HomePage extends BasePage {

    @FindBy(xpath = "//*[@id=\"nav-link-accountList-nav-line-1\"]")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]")
    private WebElement userMenu;

    @FindBy(xpath = "//*[@id=\"nav-item-signout\"]")
    private WebElement logoutBtn;


    public HomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

}