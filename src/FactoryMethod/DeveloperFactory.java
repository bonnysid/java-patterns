package FactoryMethod;

public interface DeveloperFactory {
    Developer createDeveloper();
    Developer createDeveloper(String name);
}
