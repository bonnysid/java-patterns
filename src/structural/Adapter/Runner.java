package structural.Adapter;

public class Runner {
    public static void main(String[] args) {
        Database db = new JavaAppToDatabase();

        db.insert();
        db.select();
        db.update();
        db.remove();
    }
}
