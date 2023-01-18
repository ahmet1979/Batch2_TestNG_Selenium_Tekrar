package com.krafttecnologie.test.day6_webElements;

import com.krafttecnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTask {
    public static void main(String[] args) {
        String product="rexona";
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        WebElement searchBoxBtn = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBoxBtn.sendKeys("rexona");
        WebElement submitBtn= driver.findElement(By.id("nav-search-submit-button"));
        submitBtn.click();
        String actualText=driver.findElement(By.xpath("//span[contains(text(),'38 results for')]/..")).getText();
        System.out.println("actualText = " + actualText);
        if(actualText.contains(product)){
            System.out.println("pass");
        }else{
            System.out.println("failed");
        }
    }
}
