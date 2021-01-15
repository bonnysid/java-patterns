package Builder;

public class Runner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new VisitCardWebsiteBuilder());

        Website visitCard = director.buildWebsite();
        System.out.println(visitCard);
    }
}
