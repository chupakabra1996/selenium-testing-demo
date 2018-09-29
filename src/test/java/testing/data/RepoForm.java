package testing.data;

public class RepoForm {

    private String repoName;

    private String description;

    private boolean initWithReadme;

    public RepoForm(String repoName, String description, boolean initWithReadme) {
        this.repoName = repoName;
        this.description = description;
        this.initWithReadme = initWithReadme;
    }

    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isInitWithReadme() {
        return initWithReadme;
    }

    public void setInitWithReadme(boolean initWithReadme) {
        this.initWithReadme = initWithReadme;
    }
}
