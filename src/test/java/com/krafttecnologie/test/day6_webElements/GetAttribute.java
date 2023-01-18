package com.krafttecnologie.test.day6_webElements;

import com.krafttecnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetAttribute {
    public static void main(String[] args) {
        String email="ahmet@gmail.com";
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
        WebElement emailInputBox= driver.findElement(By.xpath("//input[@id='email']"));
       // emailInputBox.sendKeys(email);
        String value=emailInputBox.getAttribute("class");
        System.out.println("value = " + value);
    }
}
