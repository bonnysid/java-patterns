package AbstractFactory;

import AbstractFactory.website.WebsiteTeamFactory;

public class WebSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory teamFactory = new WebsiteTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager projectManager = teamFactory.getProjectManager();

        System.out.println("Creating the website...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
