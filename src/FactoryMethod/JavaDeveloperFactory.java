package FactoryMethod;

public class JavaDeveloperFactory implements DeveloperFactory{

    public Developer createDeveloper(String name) {
        return new JavaDeveloper(name);
    }

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper(null);
    }
}
