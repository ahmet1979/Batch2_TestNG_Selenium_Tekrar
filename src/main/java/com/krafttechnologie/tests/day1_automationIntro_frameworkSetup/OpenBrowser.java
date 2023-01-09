package com.krafttechnologie.tests.day1_automationIntro_frameworkSetup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) {
        //WebDriverManager.firefoxdriver().setup();
        //WebDriver driver=new FirefoxDriver();
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        System.out.println("sayfanin basligi = " + driver.getTitle());
        String expectedTitle="Amazon.com. Spend less. Smile more.";
        String actualTitle= driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("baslik beklendigi gibi test gecti");
        }else {
            System.out.println("baslik beklendigi gibi degil test fail");
        }
    }
}
