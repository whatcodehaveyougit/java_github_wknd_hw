import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AccountTest {

    Account account;

    @Before
    public void before() {
        account = new Account("whatcodehaveyougit", "Sigurd", AccountType.FREE);
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

    //    @Test
//    public void can_add_repo(){}
//
//}

    //    @Test
//    public void can_return_repo_object_by_name(){}
//
//}

//    @Test
//    public void can_upgrade_account_to_pro(){}
//
//}

}
