package com.ari.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static com.ari.BestUtil.driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginPage{
    By usernameInputText = By.cssSelector("#user-name");
    By passwordInputText = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.id("login-button");
    By productNameBackpackCss = By.cssSelector("#item_4_title_link");

    public void loginPageFirst(){
        driver.get("https://www.saucedemo.com/");
    }
    public void inputUsername(String username){
        driver.findElement(usernameInputText).sendKeys(username);
    }
    public void inputPassword(String password){
        driver.findElement(passwordInputText).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public void validateUserIsOnHomePage(){

        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait .until(ExpectedConditions.presenceOfElementLocated(productNameBackpackCss));

        WebElement productElementBackpack = driver.findElement(productNameBackpackCss);
        assertTrue(productElementBackpack.isDisplayed());
        assertEquals("Sauce Labs Backpack",productElementBackpack.getText());
        System.out.println(" Judul product expected : Sauce Labs Backpack");
        System.out.println(" Aktual : " + productElementBackpack.getText());
    }
}


