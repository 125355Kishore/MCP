
package com.example.playwrightdemo.stepdefs;

import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;

public class TestContext {
    public static final String BASE_URL = System.getenv().getOrDefault("BASE_URL", "https://pc-sandbox-gwcpdev.hexaware.zeta1-andromeda.guidewire.net/PolicyCenter.do");
  //https://pc-sandbox-gwcpdev.hexaware.zeta1-andromeda.guidewire.net/PolicyCenter.do
    public Playwright playwright;
    public Browser browser;
    public BrowserContext context;
    public Page page;

    public void initialize() {
        playwright = Playwright.create();
        // Always use headless mode in CI and by default
        boolean headless = false;
        String headlessEnv = System.getenv("HEADLESS");
        if (headlessEnv != null) {
            headless = Boolean.parseBoolean(headlessEnv);
        }
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(headless));
        context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null)); // Maximized
        page = context.newPage();

        // Debug: Print network connectivity to BASE_URL in CI
        if (System.getenv("CI") != null) {
            try {
                Process process = Runtime.getRuntime().exec("curl -I " + BASE_URL);
                java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(process.getInputStream()));
                String line;
                System.out.println("--- CURL OUTPUT FOR BASE_URL ---");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                System.out.println("--- END CURL OUTPUT ---");
            } catch (Exception e) {
                System.out.println("Failed to curl BASE_URL: " + e.getMessage());
            }
        }
    }

    public void cleanup() {
        if (context != null) context.close();
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
        playwright = null;
        browser = null;
        context = null;
        page = null;
    }
}
