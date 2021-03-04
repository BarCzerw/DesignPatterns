package designpatterns.structural.decorator.exercise;

import java.util.List;

public class WithMeanStatisticsLogger implements StatisticsLogger {

    private final StatisticsLogger decoratedLogger;

    public WithMeanStatisticsLogger(StatisticsLogger decoratedLogger) {
        this.decoratedLogger = decoratedLogger;
    }

    @Override
    public void displayStatistics() {
        System.out.println("Mean time: " + getMeanExecutionTime());
        decoratedLogger.displayStatistics();
    }

    private Double getMeanExecutionTime() {
        return getTotalExecutionTime() / getStatisticsSize();
    }

    private int getStatisticsSize() {
        return getExecutionTimes().size();
    }

    private Double getTotalExecutionTime() {
        return decoratedLogger.getExecutionTimes().stream().reduce(0.0, (k, v) -> k += v);
    }

    @Override
    public List<Double> getExecutionTimes() {
        return decoratedLogger.getExecutionTimes();
    }
}
