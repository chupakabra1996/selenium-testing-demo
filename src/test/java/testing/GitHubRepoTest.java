package testing;

import org.junit.Test;
import testing.data.RepoForm;
import testing.data.UserCredentials;

public class GitHubRepoTest extends TestBase {

    private static final String GITHUB_USERNAME = "chupakabra1996";

    @Test
    public void login_is_successful() {

        manager.getNavHelper().navToLogin();

        UserCredentials credentials = new UserCredentials(GITHUB_USERNAME, System.getenv("GITHUB_PASSWD"));

        manager.getLoginHelper().login(credentials);
    }

    @Test
    public void repo_is_created() {

        manager.getNavHelper().navToLogin();

        UserCredentials credentials = new UserCredentials(GITHUB_USERNAME, System.getenv("GITHUB_PASSWD"));

        manager.getLoginHelper().login(credentials);

        RepoForm repoForm = new RepoForm("DummyRepository",
                "Dummy repository description", true);

        manager.getRepoHelper().createRepo(repoForm);
    }


    @Test
    public void repo_is_deleted() {

        manager.getNavHelper().navToLogin();

        UserCredentials credentials = new UserCredentials(GITHUB_USERNAME, System.getenv("GITHUB_PASSWD"));

        manager.getLoginHelper().login(credentials);

        String repoName = "DummyRepository";

        manager.getNavHelper().navToUserRepository(credentials.getLogin(), repoName);

        manager.getRepoHelper().deleteRepo(repoName);
    }
}
