public class InsertionSort implements ISorting {

    public int[] sort(int[] arr) {
        long startTime = System.currentTimeMillis();
        int n = arr.length;
        int temp;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        long endTime = System.currentTimeMillis(); // record end time
        long elapsedTime = endTime - startTime; // calculate elapsed time
        System.out.println("InsertionSort took " + elapsedTime + " milliseconds to sort the array.");
        return arr;
    }

}
