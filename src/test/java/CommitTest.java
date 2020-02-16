import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CommitTest {

    Commit commit;

   @Before
    public void before() {
       commit = new Commit(1, "test");
   }

   @Test
    public void get_commit_unique_id() {
       assertEquals(1, commit.getUniqueId());
   }

   @Test
    public void get_commit_description() {
       assertEquals("test", commit.getDescription());
   }

}
