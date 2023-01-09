package com.krafttechnologie.tests.day3_basicLocators;

import com.github.javafaker.Faker;
import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdLocatorTest {
    public static void main(String[] args) {
Faker faker=new Faker();

       WebDriver driver=WebDriverFactory.getDriver("chrome");
       driver.get("https://demoqa.com/text-box");
       driver.manage().window().maximize();
       WebElement inputUserName=driver.findElement(By.id("userName"));
       inputUserName.sendKeys(faker.name().firstName());
       WebElement inputEmail = driver.findElement(By.id("userEmail"));
       inputEmail.sendKeys(faker.internet().emailAddress());
       //driver.quit();
    }
}
