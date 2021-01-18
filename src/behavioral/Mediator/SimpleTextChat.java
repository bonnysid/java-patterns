package behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat{
    private User admin;
    private List<User> users = new ArrayList<>();

    public SimpleTextChat() {}

    public SimpleTextChat(User admin, List<User> users) {
        this.admin = admin;
        this.users = users;
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserToChat(User u) {
        users.add(u);
    }

    @Override
    public void sendMessage(String message, User user) {
        users.forEach(u -> {
            if(u != user) u.getMessage(message);
        });
        admin.getMessage(message);
    }
}
