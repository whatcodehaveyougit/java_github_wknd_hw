import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RepoTest {

    Repo repo;
    Commit commit;
//    Commit commit1;

    @Before
    public void before() {
        repo = new Repo("test","a test", RepoType.PUBLIC);
//        commit = new Commit("0", "Test");
//        commit1 = new Commit("1", "Test2");
    }

    @Test
    public void repo_has_name() {
        assertEquals("test", repo.getName());
    }

    @Test
    public void repo_has_description() {
        assertEquals("a test", repo.getDescription());
    }

    @Test
    public void repo_has_type() {
        assertEquals(RepoType.PUBLIC, repo.getRepoType());
    }

    @Test
    public void repo_can_git_commit() {
        assertEquals(1, repo.commitCount());
    }


}
