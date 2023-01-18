package com.krafttecnologie.test.day3_basicLocators;

import com.krafttecnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAnaPartialLinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
        WebElement example1= driver.findElement(By.linkText("Example 1: Element on page that is hidden"));
        example1.click();
        String expectedTitle="Example 1: Element on page that is hidden";
        String actualTitle=driver.findElement(By.tagName("h4")).getText();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("test pass");
        }else{
            System.out.println("test fail");
        }
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.partialLinkText("Example 2")).click();
        String expectedText="Example 2: Element rendered after the fact";
        String actualText=driver.findElement(By.tagName("h4")).getText();
        if(actualText.contains(expectedText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

    }
}
