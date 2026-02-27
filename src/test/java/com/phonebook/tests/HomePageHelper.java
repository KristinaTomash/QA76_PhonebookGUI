package com.phonebook.tests;

import org.openqa.selenium.By;

public class HomePageHelper extends BaseHelper {
    public boolean isHomeComponentPresent(){
       return isElementPresent(By.xpath("//div[2]//h1"));
    }
}
