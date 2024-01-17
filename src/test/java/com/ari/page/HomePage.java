package com.ari.page;

import com.ari.BestUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomePage extends BestUtil {

    By productNameBackpackCss = By.cssSelector("#item_4_title_link > div:nth-child(1)");


    public void validateUserIsOnHomePage(){
        WebElement productElementBackpack = driver.findElement(productNameBackpackCss);
        assertTrue(productElementBackpack.isDisplayed());
        assertEquals("Sauce Labs Backpack",productElementBackpack.getText());
        System.out.println(" Judul product expected : Sauce Labs Backpack");
        System.out.println(" Aktual : " + productElementBackpack.getText());
    }

}
