public class Container {
    final private int MAX = 100;
    private int container;

    public Container() {
        this.container = 0;
    }

    public int contains() {
        return this.container;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.container += amount;
            this.normalize(true);
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.container -= amount;
            this.normalize(false);
        }
    }

    private void normalize(boolean isMax) {
        if (isMax) {
            if (this.container > this.MAX) {
                this.container = this.MAX;
            }
        } else {
            if (this.container < 0) {
                this.container = 0;
            }
        }
    }

    public String toString() {
        return String.format("%d/%d", this.container, this.MAX);
    }
}
