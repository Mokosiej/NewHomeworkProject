import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomNumberFileGenerator {
    private static final int NUMBER_COUNT = 100;
    private String filePath;

    public RandomNumberFileGenerator(String filePath) {
        this.filePath = filePath;
    }

    public void generateAndWriteNumbers() {
        Random random = new Random();
        try (FileWriter writer = new FileWriter(filePath)) {
            for (int i = 0; i < NUMBER_COUNT; i++) {
                int number = random.nextInt(1000);
                writer.write(number + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

