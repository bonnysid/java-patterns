package behavioral.Interpreter;

public class TerminalExpression implements Expression{
    private String data;

    public TerminalExpression(String data) {
        this.data = data.trim().toLowerCase();
    }


    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
