package org.example.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.utils.DriverManager;

public class Hooks {
    private final DriverManager driverManager;

    public Hooks() {
        this.driverManager = new DriverManager();
    }

    @Before
    public void setUp() throws Exception {
        driverManager.initDriver();
    }

    @After
    public void tearDown() {
        driverManager.quitDriver();
    }

    public DriverManager getDriverManager() {
        return driverManager;
    }
}