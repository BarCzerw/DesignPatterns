package designpatterns.structural.proxy.example;

public class Slack implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}
