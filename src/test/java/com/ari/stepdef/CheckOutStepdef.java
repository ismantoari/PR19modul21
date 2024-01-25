package com.ari.stepdef;

import io.cucumber.java.en.Given;



public class CheckOutStepdef {

    Helper helper = new Helper();


    @Given(": user already atc")
    public void userAlreadyAtc() {
        System.out.println("atc");
    }
}
