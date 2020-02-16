import java.util.ArrayList;

public class Repo {

    private String name;
    private String description;
    private RepoType repoType;
    private ArrayList<Commit> commits;

    public Repo(String name, String description, RepoType repoType) {
        this.name = name;
        this.description = description;
        this.repoType = repoType;
        this.commits = new ArrayList<Commit>();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public RepoType getRepoType() {
        return repoType;
    }

    public ArrayList getArrayListOfGitCommits(){
        return this.commits;
    }

    public int getNumberOfGitCommitsInRepo() {
        return this.commits.size();
    }


    public int commitCount() {
        return this.commits.size();
    }

    public void gitCommit(Commit commit) {
        this.commits.add(commit);
    }

    public String getFirstCommitDescriptionFromRepo() {
        return this.commits.get(0).getDescription();
    }



//    get a commit by its uniqueId

//     get the repository with the most commits


}
