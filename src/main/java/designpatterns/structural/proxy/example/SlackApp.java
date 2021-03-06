package designpatterns.structural.proxy.example;

import java.util.LinkedList;
import java.util.List;

public class SlackApp {

    public static void main(String[] args) {

        List<User> userList = createAllUsers();
        String message = "classes at 8am, don't be late!";
        runMessageCheck(userList, message);

    }

    private static LinkedList<User> createAllUsers() {
        return new LinkedList<>(List.of(
                new User("Sysadmin", UserType.ADMIN),
                new User("Logged", UserType.USER_LOGGED),
                new User("NotLogged", UserType.USER_NOT_LOGGED),
                new User("goldUser47", UserType.USER_SUBSCRIBER)
        ));
    }

    private static void runMessageCheck(List<User> userList, String message) {
        System.out.println("----------------------------------------------------------");
        for (User user : userList) {
            System.out.println("Checking message sending for userType: " + user.getUserType());
            MessageSender ms = new Slack();
            MessageSender msProxy = new SlackProxy(user, ms);
            System.out.println("Slack message");
            ms.sendMessage(message);
            System.out.println("SlackProxy message");
            msProxy.sendMessage(message);
            System.out.println("----------------------------------------------------------");
        }
    }

}
