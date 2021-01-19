package behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed{

    private List<Observer> subscribers = new ArrayList<>();
    private List<String> vacancies = new ArrayList<>();

    public void addVacancy(String vacancy) {
        this.vacancies.add(vacancy);
        notifySubscribers();
    }

    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
        notifySubscribers();
    }

    @Override
    public void addSubscriber(Observer subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Observer subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        this.subscribers.forEach(subscriber -> subscriber.handleEvent(vacancies));
    }
}
