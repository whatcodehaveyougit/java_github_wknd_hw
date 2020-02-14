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

    public void addRepoToAccount(Repo repo) {
        this.repositories.put(repo.getName(), repo);
    }

    public int getNumberOfRepos() {
        return this.repositories.size();
    }

    public Repo getRepoByKey(String key) {
        return repositories.get(key);
    }
//
//    public Repo returnRepoWithMostCommits() {
//        return
//    }


//    public Repo getRepoByName(String repoName){
//
//    }



}
