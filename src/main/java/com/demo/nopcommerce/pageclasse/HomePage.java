package com.demo.nopcommerce.pageclasse;

import com.demo.nopcommerce.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Jay
 */
public class HomePage extends Util {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//div[@class='header-logo']//a//img")
    WebElement _logo;

    @FindBy(linkText = "Log in")
    WebElement _loginLink;

    @FindBy(linkText = "Register")
    WebElement _registerLink;

    public boolean isLogoDisplayed(){
        if (_logo.isDisplayed()){
            log.info("Logo is displayed on home page");
            return true;
        }else {
            log.info("Logo is not displayed on home page");
            return false;
        }
    }

    public void clickOnLogInLink(){
        log.info("Click on Login Link");
        clickOnElement(_loginLink);
    }

    public void clickOnRegisterLink(){
        log.info("Click on Registration Link");
        clickOnElement(_registerLink);
    }


}
