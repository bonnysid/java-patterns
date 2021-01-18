package behavioral.Memento;

import java.util.Date;

public class Save {
    private String version;
    private Date date;

    public Save(String version) {
        this.version = version;
        this.date = new Date();
    }

    public String getVersion() {
        return version;
    }


}
