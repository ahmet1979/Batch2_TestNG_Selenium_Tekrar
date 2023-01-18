package com.krafttecnologie.test.day5_css;

import com.krafttecnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssWithNthOfType {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/index");
        WebElement text= driver.findElement(By.cssSelector("div[class='row']:nth-of-type(1)"));
        System.out.println(text.getText());

    }
}
