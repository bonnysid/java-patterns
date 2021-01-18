package behavioral.Iterator;

public class Runner {
    public static void main(String[] args) {
        String [] skills = {"Java", "Spring", "Hibernate", "Maven", "MySQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Nikita Bortsov",skills);
        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.print("Skills: ");

        while(iterator.hasNext()) System.out.print(iterator.next().toString() + ", ");

    }
}
