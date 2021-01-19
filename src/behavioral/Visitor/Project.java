package behavioral.Visitor;

public class Project implements ProjectElement{
    private ProjectElement[] projectElements;

    public Project() {
        projectElements = new ProjectElement[]{
                new Database(),
                new Test(),
                new ProjectClass()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for(ProjectElement projectElement : projectElements) {
            projectElement.beWritten(developer);
        }
    }
}
