package main;

public class Quality {
    private int value;

    public Quality(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void increment() {
        if (value < 50) {
            value++;
        }
    }

    public void decrement() {
        if (value > 0) {
            value--;
        }
    }

    public void setZero() {
        value = 0;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
