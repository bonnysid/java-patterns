package behavioral.Observer;

public interface Observed {
    void addSubscriber(Observer subscriber);
    void removeSubscriber(Observer subscriber);
    void notifySubscribers();
}
