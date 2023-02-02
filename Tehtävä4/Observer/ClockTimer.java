import java.util.Timer;
import java.util.TimerTask;

public class ClockTimer extends Subject{

    private int hour;
    private int minute;
    private int second;

    public ClockTimer() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                tick();
            }
        };
        timer.schedule(task, 0, 1);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    private void tick() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        notifyObservers();
    }


}