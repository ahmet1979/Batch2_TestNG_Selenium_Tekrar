package com.krafttecnologie.test.day6_webElements;

import com.krafttecnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyThatURLChanged {

    public static void main(String[] args) {
        String email="ahmet@gmail.com";
        String password="12345678";
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
        String expectedUrl= driver.getCurrentUrl();
        System.out.println("expectedUrl = " + expectedUrl);
        WebElement emailInputBox= driver.findElement(By.xpath("//input[@id='email']"));
        emailInputBox.sendKeys(email);
        WebElement passwordInputBox= driver.findElement(By.name("password"));
        passwordInputBox.sendKeys(password);
        WebElement loginBtn = driver.findElement(By.xpath("//button[@class='btn btn-primary w-100']"));
        loginBtn.click();
        String actualURL= driver.getCurrentUrl();
        System.out.println("actualURL = " + actualURL);
        if(expectedUrl.equals(actualURL)){
            System.out.println("not changed");
        }else{
            System.out.println("changed");
        }
    }
}
