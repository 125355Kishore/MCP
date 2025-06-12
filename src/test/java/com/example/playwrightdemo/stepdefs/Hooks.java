package com.example.playwrightdemo.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private TestContext testContext;

    public Hooks(TestContext testContext) {
        this.testContext = testContext;
    }

    @Before
    public void beforeScenario() {
        testContext.initialize();
    }

    @After
    public void afterScenario() {
        testContext.cleanup();
    }
}
