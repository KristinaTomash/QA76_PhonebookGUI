package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegisterPositiveTest() {
        //int i = (int) ((System.currentTimeMillis()/1000)%3600);

        clickOnLoginLink();
        fillLoginRegisterForm("kristitomash33@gmail.com", "Aa12345!");
        clickOnRegistrationButton();
        Assert.assertTrue(isSignOutButtonPresent());
    }

    @Test
    public void existedUserRegisterNegativeTest() {
        clickOnLoginLink();
        fillLoginRegisterForm("kristitomash33@gmail.com", "Aa12345!");
        clickOnRegistrationButton();
        Assert.assertTrue(isAlertPresent());
    }

}