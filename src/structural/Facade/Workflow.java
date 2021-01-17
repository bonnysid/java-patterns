package structural.Facade;

public class Workflow {
    private final Developer developer = new Developer();
    private final BugTracker bugTracker = new BugTracker();
    private final Job job = new Job();

    public void resolveProblems() {
        job.doJob();
        bugTracker.activateSprint();
        developer.doJobBeforeDeadLine(bugTracker);
    }

    public void stopResolveProblems() {
        bugTracker.finishSprint();
        developer.doJobBeforeDeadLine(bugTracker);
        job.stopJob();
    }
}
