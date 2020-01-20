package at.enums;

import org.openqa.selenium.Dimension;

/**
 * This class is the Driver manager class to define WebDriver or Browser related configurations
 */

public enum ViewSizes {
    DESKTOP(new Dimension(1366,768)),
    TABLET(new Dimension(768,1024)),
	MOBILE(new Dimension(375,667));
	
    private final Dimension dimension;

    ViewSizes(Dimension dimension) {
        this.dimension = dimension;
    }

    public Dimension getDimension() {
        return dimension;
    }
}