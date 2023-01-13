package com.krafttechnologie.tests.day5_css;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssWithClass {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        WebElement searchBtn= driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        searchBtn.sendKeys("rexona");
        WebElement submitBtn= driver.findElement(By.cssSelector(".nav-search-submit.nav-sprite"));
        submitBtn.click();
    }
}
