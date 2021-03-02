package designpatterns.structural.adapter.exercise;

public class ComputerGameAdapter implements PCGame{

    private ComputerGame computerGame;

    public ComputerGameAdapter(ComputerGame computerGame) {
        this.computerGame = computerGame;
    }

    @Override
    public String getTitle() {
        return computerGame.getName();
    }

    @Override
    public Integer getPegiAllowedAge() {
        return Integer.parseInt(computerGame.getPegiAgeRating().name().replace("P", ""));
    }

    @Override
    public boolean isTripleAGame() {
        return computerGame.getBudgetInMillionsOfDollars() > 50;
    }

    @Override
    public Requirements getRequirements() {
        return new Requirements(
                computerGame.getMinimumGpuMemoryInMegabytes(),
                computerGame.getDiskSpaceNeededInGB(),
                computerGame.getRamNeededInGb(),
                computerGame.getCoreSpeedInGhz(),
                computerGame.getCoresNeeded());
    }
}
