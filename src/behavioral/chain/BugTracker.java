package behavioral.chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier report = new SimpleNotifier(Priority.SIMPLE);
        Notifier emailReport = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsReport = new SMSNotifier(Priority.ASAP);

        report.setNextNotifier(emailReport);
        emailReport.setNextNotifier(smsReport);

        report.notifyManager("All is OK!", 1);
        report.notifyManager("Something is not OK!", 2);
        report.notifyManager("We have a big problems!!!", 3);
    }
}
