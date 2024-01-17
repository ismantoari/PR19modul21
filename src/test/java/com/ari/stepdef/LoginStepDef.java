package com.ari.stepdef;

import com.ari.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDef {
    LoginPage loginP = new LoginPage();

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginP.loginPageFirst();
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
        loginP.inputUsername(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        loginP.inputPassword(password);
    }

    @When("user click login button")
    public void userClickLoginButton() {
        loginP.clickLoginButton();
    }

//    @Then("user is on homepage")
//    public void userIsOnHomepage() {
//        loginPage.validateUserIsOnHomePage();
//    }

}
