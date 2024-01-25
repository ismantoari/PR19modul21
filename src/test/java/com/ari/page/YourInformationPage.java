package com.ari.page;

import static com.ari.BestUtil.driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class YourInformationPage {

    public void userIsOnYourInformationPage(){
     String urlYourInformationPage = driver.getCurrentUrl();
     assertEquals("https://www.saucedemo.com/checkout-step-one.html", urlYourInformationPage);
    }


}
