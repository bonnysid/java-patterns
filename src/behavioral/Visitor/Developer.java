package behavioral.Visitor;

public interface Developer {
    void create(Database database);
    void create(Test test);
    void create(ProjectClass projectClass);
}
