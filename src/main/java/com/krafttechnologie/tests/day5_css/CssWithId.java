package com.krafttechnologie.tests.day5_css;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssWithId {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        WebElement searchBtn= driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        searchBtn.sendKeys("css");
        WebElement submitBtn= driver.findElement(By.cssSelector("#nav-search-submit-button"));
        submitBtn.click();
    }

}
