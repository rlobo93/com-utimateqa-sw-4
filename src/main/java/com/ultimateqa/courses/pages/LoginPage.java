package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {


    By verifyWelcomeBack = By.xpath("//h1[contains(text(),'Welcome Back!')]");
    By usernameField = By.id("user[email]");
    By passwordField = By.id("user[password]");


    // Click on Login button
    By clickOnLoginButton = By.xpath("//body/main[@id='main-content']/div[1]/div[1]/article[1]/form[1]/div[4]/input[1]");

    // Verify the error message ‘Invalid email or password.’
    By verifyErrorMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");


    public String getWelcomeText(){
        return getTextFromElement(verifyWelcomeBack);
    }

    public void enterUsername(String username){
        sendTextToElement(usernameField,username);
    }

    public void enterPasswordField(String password){
        sendTextToElement(passwordField,password);
    }

    public void clickLoginButton(){
        clickOnElement(clickOnLoginButton);
    }

    public String getErrorMessage (){
        return getTextFromElement(verifyErrorMessage);
    }

}
