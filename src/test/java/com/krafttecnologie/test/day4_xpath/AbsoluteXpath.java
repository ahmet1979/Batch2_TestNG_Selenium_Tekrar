package com.krafttecnologie.test.day4_xpath;

import com.krafttecnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AbsoluteXpath {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/");
        String actualText=driver.findElement(By.xpath("/html/body/main/div/h1")).getText();
        System.out.println("actualText = " + actualText);
    }
}
