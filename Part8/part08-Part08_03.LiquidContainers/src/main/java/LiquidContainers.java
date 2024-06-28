
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int MAX = 100;
        int first = 0, second = 0;

        while (true) {
            System.out.println(String.format("First: %d/100", first));
            System.out.println(String.format("Second: %d/100", second));
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                scan.close();
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            Integer number = Integer.parseInt(parts[1]);

            switch (command) {
                case "add":
                    if (number < 0) {
                        break;
                    }
                    first += number;
                    if (first > MAX) {
                        first = MAX;
                    }
                    break;
                case "move":
                    // todo
                    break;
                case "remove":
                    // todo
                    break;
                default:
                    break;
            }
        }
    }

}
