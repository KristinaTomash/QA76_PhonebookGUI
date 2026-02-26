package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteContactTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        clickOnLoginLink();
        fillLoginRegisterForm("kristitomash33@gmail.com", "Aa12345!");
        clickOnLoginLink();

        click(By.cssSelector("[href='/add']"));
        type(By.xpath("//input[1]"),"Oliver");
        type(By.xpath("//input[2]"),"Kan");
        type(By.xpath("//input[3]"),"1234567890");
        type(By.xpath("//input[4]"),"Test1@gmail.com");
        type(By.xpath("//input[5]"),"Berlin");
        type(By.xpath("//input[6]"),"QA");
        click(By.cssSelector(".add_form__2rsm2 button"));
    }
    @Test
    public void deleteContactTest(){
        int sizeBefore = sizeOfContacts();
        click(By.cssSelector(".contact-item_card__2SOIM"));
        click(By.xpath("//button[.='Remove']"));

        pause(1000);
        int sizeAfter = sizeOfContacts();
        Assert.assertEquals(sizeAfter,sizeBefore-1);
    }

    public int sizeOfContacts() {
        if (isElementPresent(By.cssSelector(".contact-item_card__2SOIM"))){
            return driver.findElements(By.cssSelector(".contact-item_card__2SOIM")).size();
        }
        return 0;
    }

    public void pause(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
