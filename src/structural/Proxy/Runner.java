package structural.Proxy;

public class Runner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/bonnysid/java-patterns");

        project.run();
    }
}
