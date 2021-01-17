package creational.Prototype;

public class Runner {
    public static void main(String[] args) {
        Project project = new Project(1, "Master", "Source code = new Source();");

        ProjectFactory factory = new ProjectFactory(project);

        Project projectCopy = factory.copyProject();

        System.out.println(project);
        System.out.println(projectCopy);
    }
}
