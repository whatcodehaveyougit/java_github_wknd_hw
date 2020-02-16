import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RepoTest {

    Repo repo;
    Commit commit;
    Commit commit1;

    @Before
    public void before() {
        repo = new Repo("test","a test", RepoType.PUBLIC);
        commit = new Commit(0, "Test");
        commit1 = new Commit(1, "Test2");
    }

    @Test
    public void get_repo_name() {
        assertEquals("test", repo.getName());
    }

    @Test
    public void get_repo_description() {
        assertEquals("a test", repo.getDescription());
    }

    @Test
    public void get_repo_type() {
        assertEquals(RepoType.PUBLIC, repo.getRepoType());
    }

    @Test
    public void get_arraylist_of_git_commits() {
        repo.gitCommit(commit);
        repo.gitCommit(commit);
        repo.getArrayListOfGitCommits();
        assertEquals(2, repo.getArrayListOfGitCommits().size());
    }

    @Test void get_number_of_git_commits_in_repo() {
        repo.gitCommit(commit);
        repo.gitCommit(commit);
        assertEquals(2, repo.getNumberOfGitCommitsInRepo());
    }


    @Test
    public void get_git_commit_count() {
        repo.gitCommit(commit);
        repo.gitCommit(commit);
        assertEquals(2, repo.commitCount());
    }

    @Test
    public void can_get_commit_message_from_first_commit() {
        repo.gitCommit(commit);
        assertEquals("Test", repo.getFirstCommitDescriptionFromRepo());
    }


}
