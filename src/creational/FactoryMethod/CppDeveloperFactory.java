package creational.FactoryMethod;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper(null);
    }

    @Override
    public Developer createDeveloper(String name) {
        return new CppDeveloper(name);
    }
}
