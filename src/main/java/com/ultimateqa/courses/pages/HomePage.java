package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By signIn = By.xpath("//header/div[1]/div[1]/section[1]/ul[1]/li[1]/a[1]");

    public void signInLink(){
        clickOnElement(signIn);
    }



}
