import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void remove(int taskNumber) {
        this.tasks.remove(--taskNumber);
    }

    public void print() {
        int i = 0;
        for (String task : tasks) {
            System.out.println(String.format("%d: %s", ++i, task));
        }
    }

}
