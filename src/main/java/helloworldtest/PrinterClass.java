package helloworldtest;

public class PrinterClass {

    private static String welcomeMessage;

    public static void print(){
        if (welcomeMessage == null) {
            welcomeMessage = "Default message";
        }
        System.out.println(welcomeMessage);
    }

    public static void setWelcomeMessage(String welcomeMessage) {
        PrinterClass.welcomeMessage = welcomeMessage;
    }

    public static void main(String[] args) {

        PrinterClass.setWelcomeMessage("Hello world!");
        PrinterClass.print();

    }
}
