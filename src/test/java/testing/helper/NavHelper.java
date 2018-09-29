package testing.helper;

import testing.TestManager;

public class NavHelper extends GenericHelper {

    private static final String LOGIN_SUB_PATH = "/login";

    public NavHelper(TestManager manager) {
        super(manager);
    }

    public void navToLogin() {
        webDriver.navigate().to(manager.getBaserURL() + LOGIN_SUB_PATH);
    }

    public void navToHome() {
        webDriver.navigate().to(manager.getBaserURL());
    }

    public void navToUserRepository(String userName, String repoName) {
        webDriver.navigate().to(manager.getBaserURL() + "/" + userName + "/" + repoName);
    }
}
