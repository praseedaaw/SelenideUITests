package steps;

import at.base.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

/**
 * This class is the Hook class which initiates Drivermanager before the tests.
 * Cucumber After and Before annotations are used to run a set of actions before and after each test/scenario
 */

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
