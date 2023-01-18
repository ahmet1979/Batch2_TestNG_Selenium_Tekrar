package com.krafttecnologie.test.day5_css;

import com.krafttecnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssWithMultipleAttribute {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        WebElement searchBtn= driver.findElement(By.cssSelector("input[id*='twotabsearchtextbox'][type='text']"));
        searchBtn.sendKeys("testNG");
        WebElement submitBtn= driver.findElement(By.cssSelector("input[id*='nav-search-submit-button'][type='submit']"));
        submitBtn.click();
    }
}
