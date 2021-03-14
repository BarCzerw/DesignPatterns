package designpatterns.behavioral.observers.example1;

public class AdminObserver extends BaseObserver {

    private final String adminName;

    public AdminObserver(ChatChannel chatChannel, String adminName) {
        super(chatChannel);
        this.adminName = adminName;
        System.out.println(adminName + "(admin) joined " + chatChannel.getName());
    }

    @Override
    public void handleMessage(String message, String userType) {
        System.out.println(adminName + " reads " + message + " from user " + userType);
    }

    @Override
    public String getObserverType() {
        return "ADMIN";
    }
}
