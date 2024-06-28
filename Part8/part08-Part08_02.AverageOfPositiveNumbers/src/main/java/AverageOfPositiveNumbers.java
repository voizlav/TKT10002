import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        while (true) {
            String input = scanner.nextLine();
            Integer number = Integer.parseInt(input);
            if (number == 0) {
                scanner.close();
                break;
            }
            if (number > 0) {
                sum += number;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double result = (double) sum / count;
            System.out.println(result);
        }
    }
}
