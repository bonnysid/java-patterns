package structural.Decorator;

public class Runner {
    public static void main(String[] args) {
        Developer dev = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(dev.makeJob());
    }
}
