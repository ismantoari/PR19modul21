package com.ari.stepdef;

import com.ari.page.HomePage;
import com.ari.page.LoginPage;
import io.cucumber.java.en.Then;

public class HomeStepDef {

    HomePage homePage;

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homePage = new HomePage();
        homePage.validateUserIsOnHomePage();
    }
}
