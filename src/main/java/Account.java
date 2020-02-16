import sun.tools.jconsole.Tab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

    public int getNumberOfReposInAccount() {
        return this.repositories.size();
    }

    public Repo getRepoByKey(String key) {
        return repositories.get(key);
    }

    public int getNumberOfGitCommitsInRepo(Repo repo) {
        return repo.getNumberOfGitCommitsInRepo();
    }

    public int countReposInAccount() {
        int counter;
        counter = 0;
        for (Map.Entry me : this.repositories.entrySet()) {
            counter++;
        }
        return counter;
    }

    public void returnNumberOfCommitsInEachRepo() {
    for (Map.Entry<String, Repo> entry : entries) {
            entry.getValue();
        }

//    public void returnNumberOfCommitsInEachRepo() {
//        for (Map.Entry me : this.repositories.entrySet()) {
//            Repo repo;
//            repo = me.getValue();
//            System.out.println("Value: " + me.getValue());
//        }
//    }

//    public void returnNumberOfCommitsInEachRepo() {
//        for ( Repo repo : this.repositories.values()) {
//            System.out.println( repo.getNumberOfGitCommitsInRepo());
//        }
//    }

//    public String returnRepoWithMostCommits() {
//        Repo repo;
//        for (Map.Entry me : this.repositories.entrySet()) {
//            if (this.getNumberOfGitCommitsInRepo(this.repositories)) > repo {
//                repo = this.repositories;
//            }
//        }
//    }

    public static void main(String[] args) {

    }
}
