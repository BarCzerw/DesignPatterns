package designpatterns.behavioral.interpreter;

import java.util.LinkedList;
import java.util.List;

public class MathApp {

    public static void main(String[] args) {

        List<MathOperations> mathOperations = createMathOperattions();
        runOperations(mathOperations, 45.6, 7.12);

    }

    private static void runOperations(List<MathOperations> mathOperations, double v, double v1) {

        MathWindows windows = new MathWindows(v, v1);
        MathLinux linux = new MathLinux(v, v1);

        for (MathOperations mathOperation : mathOperations) {
            windows.interprete(mathOperation);
            linux.interprete(mathOperation);
            System.out.println(mathOperation + " - win: " + windows.getResult() + " | lin: " + linux.getResult());
        }
    }

    private static List<MathOperations> createMathOperattions() {
        return new LinkedList<>(List.of(
                MathOperations.ADD,
                MathOperations.SUBTRACT,
                MathOperations.MULTIPLY,
                MathOperations.DIVIDE,
                MathOperations.POWER_OF
        ));
    }

}
