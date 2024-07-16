public class Student extends Person {
    private int count;

    public Student(String name, String address) {
        super(name, address);
        this.count = 0;
    }

    public void study() {
        this.count++;
    }

    public int credits() {
        return this.count;
    }
}
