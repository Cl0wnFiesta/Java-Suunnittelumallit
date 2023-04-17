public class Clock implements Cloneable {
    private ClockHourHand hourHand = new ClockHourHand();
    private ClockMinuteHand minuteHand = new ClockMinuteHand();
    private ClockSecondHand secondHand = new ClockSecondHand();

    public Clock(int hourHand, int minuteHand, int secondHand) {

        this.hourHand.setValue(hourHand);
        this.minuteHand.setValue(minuteHand);
        this.secondHand.setValue(secondHand);
    }

    public void setHourHand(int hourHand) {
        this.hourHand.setValue(hourHand);
    }

    public void setSecondHand(int secondHand) {
        this.secondHand.setValue(secondHand);
    }

    public void setMinuteHand(int minuteHand) {
        this.minuteHand.setValue(minuteHand);
    }

    public ClockHourHand getHourHand() {
        return hourHand;
    }

    public ClockMinuteHand getMinuteHand() {
        return minuteHand;
    }

    public ClockSecondHand getSecondHand() {
        return secondHand;
    }

    public void tick() {
        secondHand.tick();
        if (secondHand.getValue() == 0) {
            minuteHand.tick();
            if (minuteHand.getValue() == 0) {
                hourHand.tick();
            }
        }
    }

    public String toString() {
        return hourHand + ":" + minuteHand + ":" + secondHand;
    }

    public Clock cloneDeep() {
        try {
            Clock clock = (Clock) super.clone();
            clock.hourHand =  hourHand.clone();
            clock.minuteHand = minuteHand.clone();
            clock.secondHand = secondHand.clone();
            return clock;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }

    public Clock cloneShallow() {
        try {
            return (Clock) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }

}