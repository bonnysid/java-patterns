package FactoryMethod;

public class CppDeveloper implements Developer{

    private final String name;

    CppDeveloper(String name) {this.name = name;}

    @Override
    public void writeCode() {
        System.out.println((name == null ? "CppDeveloper " : name + ": CppDeveloper, ") + "is writing code...");
    }

}
