package lab6.task;

import java.util.Random;

public class RandomOutTask implements Task {
    private int randomNumber;

    public RandomOutTask() {
        this.randomNumber = new Random().nextInt(100);
    }

    @Override
    public void execute() {
        System.out.println("Generated random number: " + randomNumber);
    }
}
