package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegisterPositiveTest(){
        //click on Login link
        driver.findElement(By.cssSelector("[href='/login']")).click();

        //enter Email field

        //enter password field

        //click on Registration button

        //verify that Sign out button present
    }
}
