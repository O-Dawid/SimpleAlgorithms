package app;

public class QuickSortPasjaInformatyki {
    public void quickSort(int[] a, int low, int high) {
        int pivot = a[low];
        int leftItem = low;
        int rightItem = high;
        while (leftItem < rightItem) {
            while (leftItem <= rightItem) {
                while (a[leftItem] < pivot) {
                    leftItem++;
                }

                while (a[rightItem] > pivot) {
                    rightItem--;
                }

                if (leftItem <= rightItem) {
                    int temp = a[leftItem];
                    a[leftItem] = a[rightItem];
                    a[rightItem] = temp;
                    leftItem++;
                    rightItem--;
                }

            }
        }
        if (low < rightItem)
            quickSort(a, low, rightItem);

        if (high > leftItem)
            quickSort(a, leftItem, high);
    }

}