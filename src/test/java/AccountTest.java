import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;

public class AccountTest {

    Account account;
    Repo repo;
    Repo repo1;
    Commit commit;
    Commit commit1;

    @Before
    public void before() {
        account = new Account("whatcodehaveyougit", "Sigurd", AccountType.FREE);
        repo = new Repo("test","a test", RepoType.PUBLIC);
        repo1 = new Repo("test1","a test1", RepoType.PUBLIC);
        commit = new Commit("0", "Test");
        commit1 = new Commit("1", "Test1");
    }

    @Test
    public void account_has_name() {
        assertEquals("whatcodehaveyougit", account.getUsername());
    }

    @Test
    public void account_has_username() {
        assertEquals("Sigurd", account.getName());
    }

    @Test
    public void account_has_account_type() {
        assertEquals(AccountType.FREE, account.getAccountType());
    }

    @Test
    public void can_add_repo_to_account() {
        account.addRepoToAccount(repo);
        account.addRepoToAccount(repo1);
        assertEquals(2, account.getNumberOfRepos());
    }

    @Test
    public void can_get_repo_by_key() {
        account.addRepoToAccount(repo);
        assertEquals(repo, account.getRepoByKey("test"));
    }

    @Test
    public void get_repo_with_most_commits() {
        repo.gitCommit(commit);
        repo1.gitCommit(commit);
        repo1.gitCommit(commit);
        assertEquals("test1",  account.returnRepoWithMostCommits().getName());
    }



//    @Test
//    public void can_upgrade_account_to_pro(){}
//
//}

}
