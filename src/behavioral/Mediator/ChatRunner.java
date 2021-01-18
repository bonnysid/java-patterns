package behavioral.Mediator;

public class ChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "bonnysid");
        User user1 = new SimpleUser(chat, "kira");
        User user2 = new SimpleUser(chat, "lite");
        User user3 = new SimpleUser(chat, "michel");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        admin.sendMessage("Hello there!");

    }
}
