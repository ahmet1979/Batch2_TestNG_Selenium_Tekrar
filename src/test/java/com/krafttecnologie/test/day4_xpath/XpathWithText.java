package com.krafttecnologie.test.day4_xpath;

import com.krafttecnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XpathWithText {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/");
        //String text=driver.findElement(By.xpath("//li[text()='Dashboard']")).getText();
        //String text=driver.findElement(By.xpath("//li[.='Dashboard']")).getText();
        String text=driver.findElement(By.xpath("//*[text()='Dashboard']")).getText();
        System.out.println("text = " + text);

    }


}
