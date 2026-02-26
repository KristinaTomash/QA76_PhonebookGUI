package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{


    @Test
    public void loginPositiveTest(){

        clickOnLoginLink();
        fillLoginRegisterForm("kristitomash33@gmail.com", "Aa12345!");
        clickOnLoginButton();
        Assert.assertTrue(isSignOutButtonPresent());

    }


}
