package testTask;

import com.google.gson.Gson;

import java.io.IOException;

public class LegsCounter {
    private static final int CHICKEN_LEGS = 2;
    private static final int COW_LEGS = 4;
    private static final int PIG_LEGS = 4;
    private final LineReader lineReader = new LineReader();

    public int countTotalAnimalLegs(String fileName) throws IOException {
        String input = lineReader.read(fileName);
        Animals animals = new Gson().fromJson(input, Animals.class);
        return countLegs(animals);
    }

    public int countLegs(Animals animals) {
        return animals.getChickens() * CHICKEN_LEGS +
                animals.getCows() * COW_LEGS +
                animals.getPigs() * PIG_LEGS;
    }
}
