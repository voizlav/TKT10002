import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        boolean running = true;
        while (running) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            switch (command) {
                case "stop":
                    this.scanner.close();
                    running = false;
                    break;
                case "add":
                    String task = scanner.nextLine();
                    this.todoList.add(task);
                    break;
                case "list":
                    this.todoList.print();
                    break;
                case "remove":
                    String input = scanner.nextLine();
                    int taskNumber = Integer.parseInt(input);
                    this.todoList.remove(taskNumber);
                    break;
                default:
                    break;
            }
        }
    }
}
