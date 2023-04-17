import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        Clock clock = new Clock(12, 30, 00);

        Clock clock2 = clock.cloneDeep();
        clock2.setHourHand(22);
        clock2.setMinuteHand(05);
        clock2.setSecondHand(12);

        Clock clock3 = clock.cloneShallow();
        clock3.setHourHand(05);

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                clock.tick();
                clock2.tick();
                clock3.tick();

                System.out.println("Clock 1: " + clock);
                System.out.println("Clock 2: " + clock2);
                System.out.println("Clock 3: " + clock3 + "\n");
            }
        }, 0, 1000);

    }
}
