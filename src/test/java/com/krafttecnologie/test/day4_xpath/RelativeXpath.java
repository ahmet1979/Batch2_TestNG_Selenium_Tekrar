package com.krafttecnologie.test.day4_xpath;

import com.krafttecnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RelativeXpath {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.hepsiburada.com/");
       // String actualText=driver.findElement(By.xpath("(//a[@href='https://www.hepsiburada.com/cozummerkezi'])[1]")).getText();
        String actualText=driver.findElement(By.xpath("(//a[@*='https://www.hepsiburada.com/cozummerkezi'])[1]")).getText();
        System.out.println("actualText = " + actualText);
    }
}
