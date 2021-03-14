package designpatterns.behavioral.observers.example1;

public class ObserverMain {

    public static void main(String[] args) {

        final ChatChannel chatChannel = new ChatChannel("design-patterns");

        final BaseObserver userA = new UserObserver(chatChannel, "user1");
        final BaseObserver userB = new UserObserver(chatChannel, "user2");
        final BaseObserver adminA = new AdminObserver(chatChannel, "GM1");
        final BaseObserver adminB = new AdminObserver(chatChannel, "GM2");

        userA.sendMessage("Hello all");
        userB.sendMessage("Hello user1!");
        adminA.sendMessage("Admin message");
        adminB.sendMessage("Admin response");

    }

}
