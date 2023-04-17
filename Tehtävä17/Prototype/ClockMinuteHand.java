public class ClockMinuteHand implements Cloneable {

    private int value;

    public ClockMinuteHand() {
        value = 0;
    }

    public ClockMinuteHand(int value) {
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
        System.out.println(value);

    }

    public String toString() {
        return String.format("%02d", value);
    }

    public ClockMinuteHand clone() {
        try {
            return (ClockMinuteHand) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
