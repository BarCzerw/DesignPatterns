package helloworldtest;

import lombok.Data;

@Data
public class PrinterClass {

    private static String welcomeMessage;

    public static void print(){
        if (welcomeMessage == null) {
            welcomeMessage = "Default message";
        }
        System.out.println(welcomeMessage);
    }

}
