package creational.AbstractFactory;

import creational.AbstractFactory.banking.BankingTeamFactory;

public class BankSystemProject {
    public static void main(String[] args) {
        ProjectTeamFactory teamFactory = new BankingTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager projectManager = teamFactory.getProjectManager();

        System.out.println("Creating the bank system...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
