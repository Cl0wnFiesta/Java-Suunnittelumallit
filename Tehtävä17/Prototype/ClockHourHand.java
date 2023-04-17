public class ClockHourHand implements Cloneable {

    private int value;

    public ClockHourHand() {
        value = 0;
    }

    public ClockHourHand(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void tick() {
        value = (value + 1) % 12;
        System.out.println(value);

    }

    public String toString() {
        return String.format("%02d", value);
    }

    public ClockHourHand clone() {
        try {
            return (ClockHourHand) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
