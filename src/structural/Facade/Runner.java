package structural.Facade;

public class Runner {
    public static void main(String[] args) {
        Workflow workflow = new Workflow();

        workflow.resolveProblems();
        workflow.stopResolveProblems();
    }
}
