import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // create a new Random object to generate random numbers
        Random random = new Random();

        // create a new int array of length 100000
        int[] randomInts = new int[100000];
       
        // fill the array with random integers between 1 and 100000 (inclusive)
        for (int i = 0; i < randomInts.length; i++) {
            randomInts[i] = random.nextInt(999999) + 1;
        }

        int[] randomIntsBubble = Arrays.copyOf(randomInts, randomInts.length);
        int[] randomIntsInsertion = Arrays.copyOf(randomInts, randomInts.length);
        int[] randomIntsSelection = Arrays.copyOf(randomInts, randomInts.length);
    
        Sort sort = new Sort(new BubbleSort());
        sort.sort(randomIntsBubble);

        System.out.println();
        sort.setSorting(new InsertionSort());
        sort.sort(randomIntsInsertion);

        System.out.println();
        sort.setSorting(new SelectionSort());
        sort.sort(randomIntsSelection);

        // BubbleSort took 10095 milliseconds to sort the array.

        // InsertionSort took 2112 milliseconds to sort the array.

        // SelectionSort took 1464 milliseconds to sort the array.

    }
}
