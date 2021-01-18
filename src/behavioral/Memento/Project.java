package behavioral.Memento;

import java.util.Date;

public class Project {
    private String version;
    private Date date;

    public Project(String version) {
        this.version = version;
        this.date = new Date();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
        this.date = new Date();
    }

    public void loadSave(Save save) {
        this.version = save.getVersion();
        this.date = new Date();
    }
    public Save save() {
        return new Save(version);
    }

    @Override
    public String toString() {
        return "Project: \n" +
                "Version: " + version + '\n' +
                "Date: " + date +
                '\n';
    }

}
