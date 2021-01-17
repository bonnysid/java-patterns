package structural.Proxy;

public class RealProject implements Project{
    private final String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("Loading project " + url + "...");
    }

    @Override
    public void run() {
        System.out.println("Starting project " + url + "...");
    }
}
