import java.util.Observable;
import java.util.Observer;

public class AnalogClock implements Observer {
    private ClockTimer timer;

    public AnalogClock(ClockTimer timer) {
        this.timer = timer;
        timer.attach(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg == timer)
            draw();
    }

    public void draw() {
        System.out.println("AnalogClock: " + timer.getHour() + ":" + timer.getMinute() + ":" + timer.getSecond());
    }

}
