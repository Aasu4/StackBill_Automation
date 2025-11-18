package com.wolfapp.base;

import java.time.Duration;
import java.time.Instant;

import org.testng.annotations.*;

public class TestReport {
	private Instant start;

    @BeforeMethod
    public void beforeMethod() {
        start = Instant.now();
    }

    @AfterMethod
    public void afterMethod() {
        Instant end = Instant.now();
        long timeElapsed = Duration.between(start, end).toSeconds();
        System.out.println("Total test execution time: " + timeElapsed + " seconds");
    }

    @Test
    public void exampleTest() {
        // Your test code here
    }
}