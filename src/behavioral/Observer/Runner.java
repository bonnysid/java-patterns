package behavioral.Observer;

public class Runner {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("Java First Position");
        jobSite.addVacancy("Java Second Position");

        Observer firstSubscriber = new Subscriber("Vanya Petrenko");
        Observer secondSubscriber = new Subscriber("Nikita Bortsov");

        jobSite.addSubscriber(firstSubscriber);
        jobSite.addSubscriber(secondSubscriber);

        jobSite.addVacancy("Senior Java Developer");
    }
}
