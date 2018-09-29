package testing.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testing.TestManager;
import testing.data.RepoForm;

public class RepoHelper extends GenericHelper {

    public RepoHelper(TestManager manager) {
        super(manager);
    }

    public void deleteRepo(String repoName) {

        waitFor.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='js-repo-pjax-container']/div[1]/nav/a[4]")))
                .click();

        waitFor.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='options_bucket']/div[10]/ul/li[4]/button")))
                .click();

        waitFor.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='text' and @name='verify'" +
                " and @aria-label='Type in the name of the repository to confirm that you want to delete this repository.']")))
                .sendKeys(repoName);

        waitFor.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit' and contains(text()," +
                "'I understand the consequences, delete this repository')]")))
                .click();
    }

    public void createRepo(RepoForm repoForm) {

        waitFor.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='your_repos']/div/div[1]/a")))
                .click();

        waitFor.until(ExpectedConditions.presenceOfElementLocated(By.id("repository_name")))
                .sendKeys(repoForm.getRepoName());

        waitFor.until(ExpectedConditions.presenceOfElementLocated(By.id("repository_description")))
                .sendKeys(repoForm.getDescription());

        WebElement withReadmeCheckbox = waitFor.until(ExpectedConditions.elementToBeClickable(By.id("repository_auto_init")));

        if (!withReadmeCheckbox.isSelected() && repoForm.isInitWithReadme())
            withReadmeCheckbox.click();

        waitFor.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='new_repository']/div[3]/button")))
                .click();
    }
}
