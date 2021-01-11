package AbstractFactory.website;

import AbstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website project manager is managing the website...");
    }
}
