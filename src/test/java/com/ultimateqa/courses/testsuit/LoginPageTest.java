package com.ultimateqa.courses.testsuit;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){

        //locate ‘Sign In’ link and click on it
        homePage.signInLink();

        // Verify the text ‘Welcome Back!’
        String expectedMessage = "Welcome Back!";
        String actualMessage= loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage);


    }

    @Test
    public void verifyTheErrorMessage(){

        //locate ‘Sign In’ link and click on it
        homePage.signInLink();

        // Enter invalid username
        loginPage.enterUsername("rlobo@gmail.co.uk");

        // /Enter invalid password
        loginPage.enterPasswordField("rlobo123?");

        // Click on Login button
        loginPage.clickLoginButton();

        // Verify the error message ‘Invalid email or password.’
        String expectedMessage = "Invalid email or password.";
        String actualMessage= loginPage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage);

    }


}
