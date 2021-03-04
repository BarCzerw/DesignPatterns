package designpatterns.structural.decorator.exercise;

import java.util.List;

public interface StatisticsLogger {
    void displayStatistics();
    List<Double> getExecutionTimes();
}
