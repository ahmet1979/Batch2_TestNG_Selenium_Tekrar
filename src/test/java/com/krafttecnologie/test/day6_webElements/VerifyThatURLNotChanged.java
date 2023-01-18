package com.krafttecnologie.test.day6_webElements;

import com.krafttecnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyThatURLNotChanged {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
        // String expectedURL= "https://www.krafttechexlab.com/login";
        String expectedURL = driver.getCurrentUrl();
        System.out.println("expectedURL = " + expectedURL);
        WebElement loginBtn = driver.findElement(By.xpath("//button[@class='btn btn-primary w-100']"));
        loginBtn.click();
        String actualURL = driver.getCurrentUrl();
        System.out.println("actualURL = " + actualURL);
        if (expectedURL.equals(actualURL)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
    }
}
