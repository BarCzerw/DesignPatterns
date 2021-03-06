package designpatterns.behavioral.interpreter;

public class MathWindows implements MathInterpreter {

    private double first, second, result;

    public MathWindows(double first, double second) {
        this.first = first;
        this.second = second;
        this.result = Double.MIN_VALUE;
    }

    public double getResult() {
        return result;
    }

    @Override
    public void interprete(MathOperations mathOperation) {
        switch (mathOperation) {
            case ADD -> {
                result = first + second;
            }
            case SUBTRACT -> {
                result = first - second;
            }
            case MULTIPLY -> {
                result = first * second;
            }
            case DIVIDE -> {
                result = first / second;
            }
            default -> {
                result = Double.MIN_VALUE;
                System.out.println("Operation not implemented");
            }
        }
    }
}
