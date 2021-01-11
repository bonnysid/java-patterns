package FactoryMethod;

public class JsDeveloper implements Developer{
    private final String name;

    JsDeveloper() {this(null);}

    JsDeveloper(String name) {this.name = name;}

    @Override
    public void writeCode() {
        System.out.println((name == null ? "Js developer " : name + ": Js developer, ") + "is writing code...");
    }
}
