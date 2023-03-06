import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // create a new Random object to generate random numbers
        Random random = new Random();

        // create a new int array of length 100000
        int[] randomInts = new int[100000];
   

        // fill the array with random integers between 0 and 999999 (inclusive)
        for (int i = 0; i < randomInts.length; i++) {
            randomInts[i] = random.nextInt(100000);
        }

        Sort sort = new Sort(new BubbleSort());
        sort.sort(randomInts);

        System.out.println();
        sort.setSorting(new InsertionSort());
        sort.sort(randomInts);

        System.out.println();
        sort.setSorting(new SelectionSort());
        sort.sort(randomInts);

        // BubbleSort took 9974 milliseconds to sort the array.

        // InsertionSort took 737 milliseconds to sort the array.

        // SelectionSort took 646 milliseconds to sort the array.

    }
}
