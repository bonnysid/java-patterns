package behavioral.Interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEE = getJavaEEExpression();

        System.out.println("This developer is Java Core developer: " + isJava.interpret("java"));
        System.out.println("This developer is Java EE developer: " + isJava.interpret("spring java"));
    }

    public static Expression getJavaExpression() {
        Expression javaCore = new TerminalExpression("Java Core");
        Expression java = new TerminalExpression("Java");

        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("spring");

        return new AndExpression(java, spring);
    }
}
