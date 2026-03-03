package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegisterPositiveTest() {
        //int i = (int) ((System.currentTimeMillis()/1000)%3600);

        app.clickOnLoginLink();
        app.fillLoginRegisterForm(new User()
                .setEmail("kristitomash33@gmail.com")
                .setPassword("Aa12345!"));
        app.clickOnRegistrationButton();
        Assert.assertTrue(app.isSignOutButtonPresent());
    }

    @Test
    public void existedUserRegisterNegativeTest() {
        app.clickOnLoginLink();
        app.fillLoginRegisterForm(new User()
                .setEmail("kristitomash33@gmail.com")
                .setPassword("Aa12345!"));
        app.clickOnRegistrationButton();
        Assert.assertTrue(app.isAlertPresent());
    }

}