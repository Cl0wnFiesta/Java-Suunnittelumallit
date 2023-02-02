import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {
    private ClockTimer timer;

    public DigitalClock(ClockTimer timer) {
        this.timer = timer;
        timer.attach(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg == timer)
            draw();
    }

    public void draw() {
        System.out.println("DigitalClock: " + timer.getHour() + ":" + timer.getMinute() + ":" + timer.getSecond());
    }

}
