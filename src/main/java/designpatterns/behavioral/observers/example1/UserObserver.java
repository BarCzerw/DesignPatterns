package designpatterns.behavioral.observers.example1;

public class UserObserver extends BaseObserver{

    private final String userName;

    public UserObserver(ChatChannel chatChannel, final String userName) {
        super(chatChannel);
        this.userName = userName;
        System.out.println(userName + " joined the " + chatChannel.getName());
    }

    @Override
    public void handleMessage(String message, String userType) {
        if (!userType.equals("ADMIN")) {
            System.out.println(userName + " reads message:" + message);
        }
    }

    @Override
    public String getObserverType() {
        return "USER";
    }

}
