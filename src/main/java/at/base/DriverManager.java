package at.base;

import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * This class is the Driver manager class to define WebDriver or Browser related configurations
 */

public class DriverManager {
    public void setupBrowser() {
        WebDriverRunner.clearBrowserCache();
        WebDriverRunner.setWebDriver(getHeadlessChromeDriver());
    }

    public void clearBrowserCache() {
        WebDriverRunner.clearBrowserCache();
        WebDriverRunner.closeWebDriver();
    }

    private WebDriver getHeadlessChromeDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1220,1080");
        options.setCapability("version", "68.0.3440.106");
        return new ChromeDriver(options);
    }

    public void closeBrowser() {
        WebDriverRunner.closeWebDriver();
    }
}
