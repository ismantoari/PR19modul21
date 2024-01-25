package com.ari.stepdef;

import com.ari.page.YourInformationPage;
import io.cucumber.java.en.Then;

public class YourInformationStepdef {

    YourInformationPage yourInformationPage = new YourInformationPage();
    @Then("user is on your information page")
    public void userIsOnYourInformationPage() {
        yourInformationPage.userIsOnYourInformationPage();

    }
}
