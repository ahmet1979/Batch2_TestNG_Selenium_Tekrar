package com.krafttechnologie.tests.day5_css;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssWithContains {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        WebElement searchBtn=driver.findElement(By.cssSelector("input[id*='searchtext']"));
        searchBtn.sendKeys("splat");
        WebElement submitBtn= driver.findElement(By.cssSelector("span[id*='search-submit']"));
        submitBtn.click();
    }

}
