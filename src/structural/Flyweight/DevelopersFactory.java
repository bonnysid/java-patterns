package structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class DevelopersFactory {
    private final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality) {
        String modernizeSpeciality = speciality.trim().toLowerCase();
        Developer developer = developers.get(modernizeSpeciality);

        if(developer == null) {
            System.out.println("Hiring " + modernizeSpeciality + " developer...");
            switch (modernizeSpeciality) {
                case "java" -> developer = new JavaDeveloper();
                case "c++", "cpp" -> developer = new CppDeveloper();
                default -> throw new IllegalArgumentException("We dont know this speciality!");
            }
            developers.put(modernizeSpeciality, developer);
        }

        return developer;
    }
}
