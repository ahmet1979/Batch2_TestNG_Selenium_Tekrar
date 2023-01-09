package com.krafttechnologie.tests.day2_webDriverBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndGetUrl {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.apple.com/");
        System.out.println(driver.getTitle());
        String expectedTitle="Apple";
        String actualTitle= driver.getTitle();
       /* if(actualTitle.equals(expectedTitle)){
            System.out.println("gecti");
        }else{
            System.out.println("kaldi");
        }*/
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedCurrentUrl="https://www.apple.com/";
        String actualCurrentUrl=driver.getCurrentUrl();
        /*if(actualCurrentUrl.equals(expectedCurrentUrl)){
            System.out.println("test pass");
        }else{
            System.out.println("test fail");
        }*/


    }
}
