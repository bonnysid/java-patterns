package behavioral.Сhain;

public abstract class Notifier {
    private final int priority;
    private Notifier nextNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifyManager(String message, int lvl) {
        if (lvl >= priority) write(message);
        if (nextNotifier != null) nextNotifier.notifyManager(message, lvl);
    }

    public abstract void write(String message);
}
