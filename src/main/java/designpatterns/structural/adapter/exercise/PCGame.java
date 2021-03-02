package designpatterns.structural.adapter.exercise;

public interface PCGame {
    String getTitle();
    Integer getPegiAllowedAge();
    boolean isTripleAGame();
    Requirements getRequirements();
}