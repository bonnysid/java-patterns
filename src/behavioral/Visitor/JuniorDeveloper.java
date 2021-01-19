package behavioral.Visitor;

public class JuniorDeveloper implements Developer{
    @Override
    public void create(Database database) {
        System.out.println("Drop database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating is not available test...");
    }

    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Creating poor class...");
    }
}
