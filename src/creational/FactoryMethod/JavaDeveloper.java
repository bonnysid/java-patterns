package creational.FactoryMethod;

public class JavaDeveloper implements Developer {
    private final String name;

    JavaDeveloper() {this(null);}

    JavaDeveloper(String name) {this.name = name;}

    @Override
    public void writeCode() {
        System.out.println((name == null ? "JavaDeveloper " : name + ": JavaDeveloper, ") + "is writing code...");
    }
}
