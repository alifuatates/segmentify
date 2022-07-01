package com.segmentify.web.qa.pages.loginPage;

import com.segmentify.web.qa.pages.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class LoginPage extends BasePage {

    @FindBy(id = "ap_email")
    private WebElement emailArea;

    @FindBy(id = "continue")
    private WebElement continueBtn;

    @FindBy(id = "ap_password")
    private WebElement passwordArea;

    @FindBy(id = "signInSubmit")
    private WebElement signInSubmitBtn;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

}