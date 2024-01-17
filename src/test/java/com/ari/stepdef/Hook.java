package com.ari.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.Objects;

import static com.ari.BestUtil.quitDriver;
import static com.ari.BestUtil.startDriver;
import static java.sql.DriverManager.getDriver;

public class Hook {

    String tagsRunning = null;

    @Before
    public void beforeTest(Scenario scenario) {
        System.out.println("Before Test");

        String[] tags = scenario.getSourceTagNames().toArray(new String[0]);
        tagsRunning = tags[0];
        if (Objects.equals(tagsRunning, "@web")) {
            startDriver();
        }
    }

    @After
    public void afterTest(Scenario scenario) throws InterruptedException {
        if (Objects.equals(tagsRunning, "@web")) {
            quitDriver();
        }
    }
}
