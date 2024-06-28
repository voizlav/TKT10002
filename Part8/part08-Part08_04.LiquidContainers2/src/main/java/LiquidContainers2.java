import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println(String.format("First: %s", first));
            System.out.println(String.format("Second: %s", second));
            System.out.print(">");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                scan.close();
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            Integer amount = Integer.parseInt(parts[1]);

            switch (command) {
                case "add":
                    first.add(amount);
                    break;
                case "move":
                    if (amount > first.contains()) {
                        amount = first.contains();
                    }
                    first.remove(amount);
                    second.add(amount);
                    break;
                case "remove":
                    second.remove(amount);
                default:
                    break;
            }
        }
    }

}
