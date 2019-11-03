package com.demo.nopcommerce.pageclasse;

import com.demo.nopcommerce.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jay
 */
public class LoginPage extends Util {

    private Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement _welcomeText;

    @FindBy(id = "Email")
    WebElement _emaiField;


    @FindBy(id = "Password")
    WebElement _passwordField;

    @FindBy(xpath = "//input[@value='Log in']")
    WebElement _loginBtn;

    public void enterEmailAddress(String email) {
        log.info("Enter email address to email field");
        sendTextToElement(_emaiField, email);
    }

    public void enterPassword(String password) {
        log.info("Enter password to password field");
        sendTextToElement(_passwordField, password);
    }

    public void clickOnLoginButton() {
        log.info("Click on login button");
        clickOnElement(_loginBtn);
    }

    public String getWelcomeText() {
        log.info("Getting Welcome text");
        return getTextFromElement(_welcomeText);
    }

    public void loginToApplication(String email, String password) {
        enterEmailAddress(email);
        enterPassword(password);
        clickOnLoginButton();
    }

}
