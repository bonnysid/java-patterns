package structural.Facade;

public class BugTracker {
    private boolean isActiveSprint;

    public void activateSprint() {
        System.out.println("Sprint is active");
        isActiveSprint = true;
    }

    public void finishSprint() {
        System.out.println("Sprint is finished");
        isActiveSprint = false;
    }

    public boolean isActiveSprint() {
        return isActiveSprint;
    }
}
