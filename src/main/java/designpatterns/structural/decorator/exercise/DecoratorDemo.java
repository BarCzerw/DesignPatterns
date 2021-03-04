package designpatterns.structural.decorator.exercise;

import java.util.List;

public class DecoratorDemo {
    public static void main(String[] args) {

        final ExecutionTimesBaseStatistics baseStatisticsLogger = new ExecutionTimesBaseStatistics(List.of(1.2, 2.2, 3.4));
        baseStatisticsLogger.displayStatistics();

        final StatisticsLogger statisticsLogger = new WithMeanStatisticsLogger(
                new WithSummaryStatisticsLogger(
                        baseStatisticsLogger));
        statisticsLogger.displayStatistics();

    }
}
