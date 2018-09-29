package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import testing.helper.LoginHelper;
import testing.helper.NavHelper;
import testing.helper.RepoHelper;

import java.util.concurrent.TimeUnit;

/**
 * Serves as a layer between helpers and tests.
 */
public class TestManager {

    public static final int WAIT_PERIOD_SECONDS = 30;

    private String baserURL;

    private WebDriver webDriver;

    // helpers

    private LoginHelper loginHelper;

    private NavHelper navHelper;

    private RepoHelper repoHelper;

    public TestManager() {

        baserURL = "https://github.com";

        webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(WAIT_PERIOD_SECONDS, TimeUnit.SECONDS);

        // helpers
        loginHelper = new LoginHelper(this);
        navHelper = new NavHelper(this);
        repoHelper = new RepoHelper(this);

    }

    public void close() {
        webDriver.quit();
    }

    public String getBaserURL() {
        return baserURL;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public LoginHelper getLoginHelper() {
        return loginHelper;
    }

    public NavHelper getNavHelper() {
        return navHelper;
    }

    public RepoHelper getRepoHelper() {
        return repoHelper;
    }
}
