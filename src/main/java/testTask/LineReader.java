package testTask;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class LineReader {

    public String read(String filename) throws IOException {
        return Files.lines(Paths.get(filename))
                .collect(Collectors.joining(System.lineSeparator()));
    }
}
