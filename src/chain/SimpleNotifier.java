package chain;

public class SimpleNotifier extends Notifier{
    public SimpleNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Simple report: " + message);
    }
}
