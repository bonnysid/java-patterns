package behavioral.Visitor;

public class Runner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer senior = new SeniorDeveloper();
        Developer junior = new JuniorDeveloper();

        System.out.println("Junior in Action...");
        project.beWritten(junior);

        System.out.println("\n==============================================\n");

        System.out.println("Senior in Action...");
        project.beWritten(senior);
    }
}
