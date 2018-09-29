package testing.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testing.TestManager;
import testing.data.UserCredentials;

public class LoginHelper extends GenericHelper {

    public LoginHelper(TestManager manager) {
        super(manager);
    }

    /**
     * Executes logout operation terminating user session.
     */
    public void logout() {

        webDriver.findElement(By.xpath("//*[@id='user-links']/li[3]/details/ul/li[9]/form/button"))
                .click();
    }

    /**
     * Commits login form.
     *
     * @param credentials user credentials, i.e. password and login.
     */
    public void login(UserCredentials credentials) {

        webDriver.findElement(By.id("login_field")).sendKeys(credentials.getLogin());

        webDriver.findElement(By.id("password")).sendKeys(credentials.getPassword());

        waitFor.until(ExpectedConditions.elementToBeClickable(By.name("commit"))).click();
    }
}
