package creational.FactoryMethod;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory factory = createDeveloperFactory("java");
        Developer developer = factory.createDeveloper("Nikita");

        developer.writeCode();
    }

    public static DeveloperFactory createDeveloperFactory(String specification) {
        return switch (specification.toLowerCase()) {
            case "java" -> new JavaDeveloperFactory();
            case "cpp", "c++" -> new CppDeveloperFactory();
            case "js", "javascript" -> new JsDeveloperFactory();
            default -> throw new IllegalArgumentException("This specification " + specification.toLowerCase() + " isn't allow here! Try another");
        };
    }
}
