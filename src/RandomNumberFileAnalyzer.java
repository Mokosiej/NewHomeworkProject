import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RandomNumberFileAnalyzer {
    private String filePath;

    public RandomNumberFileAnalyzer(String filePath) {
        this.filePath = filePath;
    }

    public List<Integer> readNumbers() {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return numbers;
    }

    public int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public int findMax(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public int findMin(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public int countEvenNumbers(List<Integer> numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int countSpecialNumbers(List<Integer> numbers) {
        int count = 0;
        for (int i = 1; i < numbers.size() - 1; i++) {
            if (numbers.get(i) > numbers.get(i - 1) && numbers.get(i) < numbers.get(i + 1)) {
                count++;
            }
        }
        return count;
    }
}
