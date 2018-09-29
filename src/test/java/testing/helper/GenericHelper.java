package testing.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import testing.TestManager;

public abstract class GenericHelper {

    protected final TestManager manager;

    protected WebDriver webDriver;

    protected WebDriverWait waitFor;

    public GenericHelper(TestManager manager) {
        this.manager = manager;
        this.webDriver = manager.getWebDriver();
        this.waitFor = new WebDriverWait(webDriver, TestManager.WAIT_PERIOD_SECONDS);
    }
}
