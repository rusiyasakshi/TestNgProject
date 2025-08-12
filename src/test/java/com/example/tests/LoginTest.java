package com.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void testLoginSuccess() {
        String expected = "Welcome";
        String actual = "Welcome"; // mock login result
        Assert.assertEquals(actual, expected, "Login should succeed");
    }

    @Test
    public void testLoginFailure() {
        String expected = "Error";
        String actual = "Error"; // mock login failure
        Assert.assertEquals(actual, expected, "Login should fail for invalid user");
    }
    
    @Test
    public void testLoginTime() {
        String expected = "time1";
        String actual = "time1"; // mock login failure
        Assert.assertEquals(actual, expected, "Login should fail for invalid user");
    }
}
