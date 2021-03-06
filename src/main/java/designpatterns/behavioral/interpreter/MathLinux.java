package designpatterns.behavioral.interpreter;

public class MathLinux implements MathInterpreter{

    private double first, second, result;

    public MathLinux(double first, double second) {
        this.first = first;
        this.second = second;
        this.result = Double.MAX_VALUE;
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
                result = second / first;
            }
            case POWER_OF -> {
                result = Math.pow(first, second);
            }
            default -> {
                result = Double.MAX_VALUE;
                System.out.println("Operation not implemented");
            }
        }
    }
}
