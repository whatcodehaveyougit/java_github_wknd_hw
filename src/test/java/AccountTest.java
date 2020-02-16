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
        commit = new Commit(0, "Test");
        commit1 = new Commit(1, "Test1");
    }

    @Test
    public void get_account_name() {
        assertEquals("whatcodehaveyougit", account.getUsername());
    }

    @Test
    public void get_account_username() {
        assertEquals("Sigurd", account.getName());
    }

    @Test
    public void get_account_type() {
        assertEquals(AccountType.FREE, account.getAccountType());
    }

    @Test
    public void get_repo_by_key() {
        account.addRepoToAccount(repo);
        assertEquals(repo, account.getRepoByKey("test"));
    }

    @Test
    public void can_add_repo_to_account() {
        account.addRepoToAccount(repo);
        account.addRepoToAccount(repo1);
        assertEquals(2, account.getNumberOfReposInAccount());
    }

    @Test
    public void can_return_number_of_git_commits_in_a_repo() {
        account.addRepoToAccount(repo);
        repo.gitCommit(commit);
        repo.gitCommit(commit);
        assertEquals(2, account.ge(repo));
    }

    @Test
    public void can_count_the_repos_in_a_hashmap() {
        account.addRepoToAccount(repo);
        account.addRepoToAccount(repo1);
        assertEquals(2,  account.countReposInAccount());
    }

    @Test
    public void return_number_of_commits_in_each_repo() {
        account.addRepoToAccount(repo);
        account.addRepoToAccount(repo1);
        repo.gitCommit(commit);
        repo1.gitCommit(commit);
        repo1.gitCommit(commit);
        account.returnNumberOfCommitsInEachRepo();
    }

//    @Test
//    public void get_repo_with_most_commits() {
//        account.addRepoToAccount(repo);
//        account.addRepoToAccount(repo1);
//        repo.gitCommit(commit);
//        repo1.gitCommit(commit);
//        repo1.gitCommit(commit);
//        assertEquals(repo.getName(),  account.returnRepoWithMostCommits());
//    }



//    @Test
//    public void can_upgrade_account_to_pro(){}
//
//}

}
