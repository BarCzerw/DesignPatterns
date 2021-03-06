package designpatterns.structural.proxy.example;

public class SlackProxy implements MessageSender {

    private MessageSender messageSender;
    private User user;

    public SlackProxy(User user, MessageSender messageSender) {
        this.user = user;
        this.messageSender = messageSender;
    }

    @Override
    public void sendMessage(String message) {
        if (isLogged()) {
            messageSender.sendMessage("@" + user.getNickname() + " : " + message);
        }
    }

    private boolean isLogged() {
        switch (user.getUserType()) {
            case USER_LOGGED:
            case ADMIN:
                return true;
            case USER_SUBSCRIBER:
                System.out.println("Subscriber " + user.getNickname());
                return true;
            case USER_NOT_LOGGED:
                System.out.println(user.getNickname() + " is offline!");
                return false;
            default:
                throw new RuntimeException();
        }
    }
}
