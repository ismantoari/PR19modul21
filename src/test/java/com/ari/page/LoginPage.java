package com.ari.page;

import org.openqa.selenium.By;
import static com.ari.BestUtil.driver;


public class LoginPage{
    By usernameInputText = By.cssSelector("#user-name");
    By passwordInputText = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.id("login-button");


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



}


