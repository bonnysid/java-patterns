package behavioral.Memento;

public class Runner {
    public static void main(String[] args) throws Exception{
        GithubRepo github = new GithubRepo();
        Project project = new Project("Version 1.0");

        System.out.println("Creating the project...\n");
        Thread.sleep(1000);

        System.out.println(project);

        System.out.println("Saving project to github...");
        Thread.sleep(1000);
        github.setSave(project.save());

        System.out.println("Creating new version of project...");
        Thread.sleep(1000);
        project.setVersion("Version 1.1");
        System.out.println(project);

        System.out.println("Something went wrong...");
        System.out.println("Rollback...");
        Thread.sleep(2000);
        project.loadSave(github.getSave());
        System.out.println(project);
    }
}
