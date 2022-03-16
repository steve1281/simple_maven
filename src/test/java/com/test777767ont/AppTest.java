package com.test777767ont;

import org.testng.Assert;

import static org.testng.Assert.*;

public class AppTest {

    @org.testng.annotations.BeforeMethod
    public void setUp() {
    }

    @org.testng.annotations.AfterMethod
    public void tearDown() {
    }

    @org.testng.annotations.Test
    public void testUserLogin() {
        App myapp = new App();
        Assert.assertEquals(0, myapp.userLogin("abc", "abc123"));
    }
    @org.testng.annotations.Test
    public void testUserLogin2() {
        App myapp = new App();
        Assert.assertEquals(1, myapp.userLogin("abc", "abc@123"));
    }
}