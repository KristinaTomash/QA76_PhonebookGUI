package com.phonebook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class AddContactTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        clickOnLoginLink();
        fillLoginRegisterForm("kristitomash33@gmail.com", "Aa12345!");
        clickOnLoginLink();
    }
    @Test
    public void addContactPositiveTest(){
        //click on Add link
click(By.cssSelector("[href='/add']"));
        //enter name
        type(By.xpath("//input[1]"),"Oliver");
        //enter lastName
        type(By.xpath("//input[2]"),"Kan");
        //enter phone
        type(By.xpath("//input[3]"),"1234567890");
        //enter email
        type(By.xpath("//input[4]"),"Test1@gmail.com");
        //enter address
        type(By.xpath("//input[5]"),"Berlin");
        // enter description
        type(By.xpath("//input[6]"),"QA");
        //click on SAVE button
        click(By.cssSelector(".add_form__2rsm2 button"));
        //assert by name(text)
        Assert.assertTrue(isContactCreatedByText("Oliver"));

    }
    public boolean isContactCreatedByText(String text) {
        List<WebElement> contacts = driver.findElements(By.cssSelector("h2"));
        for (WebElement element: contacts){
            if(element.getText().contains(text))
                return true;
        }
        return false;
    }
    @AfterMethod
    public void postCondition(){
        //click on Card
        click(By.cssSelector(".contact-item_card__2SOIM"));
        //click on Remove button
        click(By.xpath("//button[.='Remove']"));
    }

}
