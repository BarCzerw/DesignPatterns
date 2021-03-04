package designpatterns.structural.adapter.exercise;

public class GameMain {

    public static void main(String[] args) {

        ComputerGame cg = new ComputerGame(
                "Gran Turismo",
                PegiAgeRating.P3,
                12.0,
                1,
                1,
                1,
                1,
                0.034);

        printInformation(new ComputerGameAdapter(cg));


    }

    public static void printInformation(PCGame game) {
        System.out.println("Title: " + game.getTitle());
        System.out.println("Triple A: " + game.isTripleAGame());
        System.out.println("Allowed age: " + game.getPegiAllowedAge());
        System.out.println("Requirements:\n" + game.getRequirements());
    }
}
