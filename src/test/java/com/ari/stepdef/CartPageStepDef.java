package com.ari.stepdef;

import com.ari.page.CartPage;
import io.cucumber.java.en.Then;

public class CartPageStepDef {

    CartPage cartPage = new CartPage();
    @Then("user is on shopping cart page")
    public void userIsOnShoppingCartPage() {
    }
}
