package com.krafttecnologie.test.day7_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
    @Test @Ignore
    public void logout() {
        System.out.println("First Test Case LogOut");
    }

    @Test
    public void login() {
        System.out.println("Second Test Case Login");
    }
    @Test
    public void register(){
        System.out.println("Third Test Case Register");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After Method");
    }

}
