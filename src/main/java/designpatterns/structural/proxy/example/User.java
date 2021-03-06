package designpatterns.structural.proxy.example;

public class User {

    private String nickname;
    private UserType userType;

    public User(String nickname, UserType userType) {
        this.nickname = nickname;
        this.userType = userType;
    }

    public String getNickname() {
        return nickname;
    }

    public UserType getUserType() {
        return userType;
    }
}
