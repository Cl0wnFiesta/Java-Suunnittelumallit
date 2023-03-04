public class BubbleSort implements ISorting {

    public int[] sort(int[] arr) {
        long startTime = System.currentTimeMillis();
        int temp = 0;

        int n = arr.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (arr[i] > arr[k]) {
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }

        }

        long endTime = System.currentTimeMillis(); // record end time
        long elapsedTime = endTime - startTime; // calculate elapsed time
        System.out.println("BubbleSort took " + elapsedTime + " milliseconds to sort the array.");
        return arr;
    }
}
