package structural.Bridge;

public class BankSystem extends Program {

    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system is developing...");
        developer.writeCode();
        System.out.println("Bank system developed.");
    }
}
