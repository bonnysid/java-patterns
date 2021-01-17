package creational.FactoryMethod;

public class JsDeveloperFactory implements DeveloperFactory{

    public Developer createDeveloper(String name) {
        return new JsDeveloper(name);
    }

    @Override
    public Developer createDeveloper() {
        return new JsDeveloper();
    }
}
