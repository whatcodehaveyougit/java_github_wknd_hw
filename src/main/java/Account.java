import java.util.ArrayList;
import java.util.HashMap;

public class Account {

    private String username;
    private String name;
    private AccountType accountType;
    private HashMap<String, Repo> repositories;

    public Account(String username, String name, AccountType accountType){
        this.username = username;
        this.name = name;
        this.accountType = accountType;
        this.repositories = new HashMap<String, Repo>();
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public AccountType getAccountType() {
        return accountType;
    }

//    public ArrayList<Repo> getRepositories() {
//        return repositories;
//    }



}
