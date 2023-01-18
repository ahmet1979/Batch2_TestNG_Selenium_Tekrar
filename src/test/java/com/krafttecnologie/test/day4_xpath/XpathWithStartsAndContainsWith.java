package com.krafttecnologie.test.day4_xpath;

import com.krafttecnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathWithStartsAndContainsWith {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.hepsiburada.com/");
       WebElement searcbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        searcbox.sendKeys("Selenium");
        WebElement searchBtn=driver.findElement(By.xpath("//div[contains(@class,'searchBoxOld-yDJzsIfi_S5gVgoa')]"));
     searchBtn.click();
    }
}
