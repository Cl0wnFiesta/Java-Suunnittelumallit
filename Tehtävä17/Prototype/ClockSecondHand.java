public class ClockSecondHand implements Cloneable {
    private int value;

    public ClockSecondHand() {
        value = 0;
    }

    public ClockSecondHand(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void tick() {
        value = (value + 1) % 60;
    }

    public String toString() {
        return String.format("%02d", value);
    }

    public ClockSecondHand clone() {
        try {
            return (ClockSecondHand) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
