package designpatterns.structural.decorator.exercise;

import java.util.List;

public class WithSummaryStatisticsLogger implements StatisticsLogger {

    private final StatisticsLogger decoratedLogger;

    public WithSummaryStatisticsLogger(StatisticsLogger decoratedLogger) {
        this.decoratedLogger = decoratedLogger;
    }

    @Override
    public void displayStatistics() {
        printSummary();
        decoratedLogger.displayStatistics();
    }

    private void printSummary() {
        printRecordsSize();
        printRecordsSum();
        printMaxValue();
        printMinValue();
    }

    private void printMinValue() {
        System.out.println("Min value: " + getExecutionTimes().stream().min(Double::compare));
    }

    private void printMaxValue() {
        System.out.println("Max value: " + getExecutionTimes().stream().max(Double::compare));
    }

    private void printRecordsSum() {
        System.out.println("Total time: " + getExecutionTimes().stream().reduce(Double::sum));
    }

    private void printRecordsSize() {
        System.out.println("Records size: " + getExecutionTimes().size());
    }

    @Override
    public List<Double> getExecutionTimes() {
        return decoratedLogger.getExecutionTimes();
    }
}
