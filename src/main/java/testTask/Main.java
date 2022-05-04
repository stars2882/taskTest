package testTask;

import java.io.IOException;

public class Main {
    private static final String FILENAME = "animals.json";

    public static void main(String[] args) throws IOException {
        LegsCounter legsCounter = new LegsCounter();
        System.out.println(legsCounter.countTotalAnimalLegs(FILENAME));
    }
}
