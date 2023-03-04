public class SelectionSort implements ISorting {

    public int[] sort(int[] arr) {
        long startTime = System.currentTimeMillis();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        long endTime = System.currentTimeMillis(); // record end time
        long elapsedTime = endTime - startTime; // calculate elapsed time
        System.out.println("SelectionSort took " + elapsedTime + " milliseconds to sort the array.");
        return arr;
    }

}
