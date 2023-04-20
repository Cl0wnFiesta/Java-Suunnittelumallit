import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main extends Thread {
    static Collection<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        Main thread = new Main();
        Main thread2 = new Main();
        list.add("Hello");
        list.add("World");
        list.add("!");
        list.add("Java");
        list.add("is");
        list.add("cool");
        list.add("!");

        thread.start();
        thread2.start();

    }

    // Vain yksi säie pääsee kerrallaan tähän metodiin
    @Override
    public void run() {
        synchronized (list) {
            System.out.println("Thread: " + Thread.currentThread().getId());
            Iterator it = list.iterator();

            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }

    public void run1() {
            System.out.println("Thread: " + Thread.currentThread().getId());
            Iterator it = list.iterator();
            System.out.println(it.next());
            System.out.println(it.next());
            System.out.println(it.next());
            System.out.println("!!!!!!");
            it.forEachRemaining(t -> System.out.println(t));
    }
}