package com.krafttechnologie.tests.day5_css;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class classWithMoreAttributes {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/index");
        WebElement componenetText= driver.findElement(By.cssSelector("div[class='row']>div[class='col-md-4']"));
        System.out.println(componenetText.getText());

    }


}
