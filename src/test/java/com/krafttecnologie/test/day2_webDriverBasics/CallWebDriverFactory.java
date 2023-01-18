package com.krafttecnologie.test.day2_webDriverBasics;

import com.krafttecnologie.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.apple.com/");
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        String expectedTitle = "Apple";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("test gecti");
        } else {
            System.out.println("test kaldi");
        }
        driver.quit();

    }

}
