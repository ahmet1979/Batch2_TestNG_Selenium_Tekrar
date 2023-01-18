package com.krafttecnologie.test.day2_webDriverBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
       driver.get("https://www.apple.com/");
        Thread.sleep(2000);
        driver.quit();
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com");

    }
}
