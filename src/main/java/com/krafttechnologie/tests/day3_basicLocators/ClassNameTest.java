package com.krafttechnologie.tests.day3_basicLocators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassNameTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
        Thread.sleep(2000);
        WebElement emailInputBox= driver.findElement(By.name("email"));
        emailInputBox.sendKeys("ahmet@gmail.com");
        WebElement passwordInputBox=driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("12345678");
        driver.findElement(By.cssSelector(".btn.btn-primary.w-100")).click();
        Thread.sleep(2000);
        System.out.println("driver.findElement(By.className(\"col-md-4\")).getText() = " + driver.findElement(By.className("col-md-4")).getText());
    }
}