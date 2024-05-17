import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "numbers.txt";


        RandomNumberFileGenerator generator = new RandomNumberFileGenerator(filePath);
        generator.generateAndWriteNumbers();


        RandomNumberFileAnalyzer analyzer = new RandomNumberFileAnalyzer(filePath);
        List<Integer> numbers = analyzer.readNumbers();

        int sum = analyzer.calculateSum(numbers);
        int max = analyzer.findMax(numbers);
        int min = analyzer.findMin(numbers);
        int evenCount = analyzer.countEvenNumbers(numbers);
        int specialCount = analyzer.countSpecialNumbers(numbers);

        System.out.println("Сумма всех чисел: " + sum);
        System.out.println("Максимальное количество: " + max);
        System.out.println("Минимальное количество: " + min);
        System.out.println("Подсчет четных чисел:" + evenCount);
        System.out.println("Количество специальных чисел: " + specialCount);
    }
}

