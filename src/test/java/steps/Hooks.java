package steps;

import at.base.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private static DriverManager driverManager = new DriverManager();

    @Before
    public static void clearcache() {
        driverManager.clearBrowserCache();
        driverManager.setupBrowser();
    }

    @After
    public static void afterTest() {
        driverManager.closeBrowser();
    }
}
