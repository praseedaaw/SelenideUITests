package at.utils;

import at.enums.ViewSizes;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/**
 * This class is used to store utilities related to port size
 */

public class ViewPortSizeUtils {

    private static final String JS_GET_VIEWPORT_WIDTH = "var width = undefined; if (window.innerWidth) {width = window.innerWidth;} else if (document.documentElement && document.documentElement.scrollWidth) {width = document.documentElement.scrollWidth;} else { var b = document.getElementsByTagName('body')[0]; if (b.scrollWidth) {width = b.scrollWidth;}};return width;";
    private static final String JS_GET_VIEWPORT_HEIGHT = "var height = undefined;  if (window.innerHeight) {height = window.innerHeight;}  else if (document.documentElement && document.documentElement.clientHeight) {height = document.documentElement.clientHeight;}  else { var b = document.getElementsByTagName('body')[0]; if (b.clientHeight) {height = b.clientHeight;}};return height;";

    public static void resizeViewPort(WebDriver driver, ViewSizes resolution) {
        Dimension targetDimension = resolution.getDimension();
        // initial resizing to have a baseline for offset calculation
        driver.manage().window().setSize(targetDimension);
        Dimension actualViewportSize = getViewportSize(driver);
        int correctedWidth = 2 * targetDimension.getWidth() - actualViewportSize.getWidth();
        int correctedHeight = 2 * targetDimension.getHeight() - actualViewportSize.getHeight();
        driver.manage().window().setSize(new Dimension(correctedWidth, correctedHeight));
    }

    private static Dimension getViewportSize(WebDriver driver) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        int width = Integer.parseInt(jsExecutor.executeScript(JS_GET_VIEWPORT_WIDTH).toString());
        int height = Integer.parseInt(jsExecutor.executeScript(JS_GET_VIEWPORT_HEIGHT).toString());
        return new Dimension(width, height);
    }
}