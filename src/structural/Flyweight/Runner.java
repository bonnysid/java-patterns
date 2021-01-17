package structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        DevelopersFactory developersFactory = new DevelopersFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(developersFactory.getDeveloperBySpeciality("java"));
        developers.add(developersFactory.getDeveloperBySpeciality("java"));
        developers.add(developersFactory.getDeveloperBySpeciality("java"));
        developers.add(developersFactory.getDeveloperBySpeciality("java"));
        developers.add(developersFactory.getDeveloperBySpeciality("java"));
        developers.add(developersFactory.getDeveloperBySpeciality("java"));
        developers.add(developersFactory.getDeveloperBySpeciality("cpp"));
        developers.add(developersFactory.getDeveloperBySpeciality("cpp"));
        developers.add(developersFactory.getDeveloperBySpeciality("cpp"));
        developers.add(developersFactory.getDeveloperBySpeciality("cpp"));

        developers.forEach(Developer::writeCode);
    }
}
