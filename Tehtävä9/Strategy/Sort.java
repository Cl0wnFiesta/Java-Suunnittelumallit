public class Sort {
    private ISorting sorting;

    public Sort(ISorting sorting) {
        this.sorting = sorting;
    }

    public int[] sort(int[] arr) {
        return sorting.sort(arr);
    }

    public void setSorting(ISorting sorting) {
        this.sorting = sorting;
    }
}
