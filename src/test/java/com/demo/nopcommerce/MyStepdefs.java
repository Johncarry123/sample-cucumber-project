package com.demo.nopcommerce;

import com.demo.nopcommerce.pageclasse.HomePage;
import com.demo.nopcommerce.pageclasse.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Jay
 */
public class MyStepdefs {

    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on Login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLogInLink();
    }

    @And("^I enter email address \"([^\"]*)\" into email field$")
    public void iEnterEmailAddressIntoEamilField(String email)  {
        new LoginPage().enterEmailAddress(email);
    }

    @And("^I enter password \"([^\"]*)\" into password field$")
    public void iEnterPasswordIntoPasswordField(String password)  {

        new LoginPage().enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should successfully login to my account$")
    public void iShouldSuccessfullyLoginToMyAccount() {
//        Assert.assertEquals("",new LoginPage().getWelcomeText());
    }
}
