package app;

public class QuickSort {

    int findPartitionIndexForPivot(int arr[], int leftItem, int rightItem) {
        int pivot = arr[rightItem];
        int lastSwapPointer = leftItem - 1;
        
        for (int scannerPointer = leftItem; scannerPointer < rightItem; scannerPointer++) {
            if (arr[scannerPointer] < pivot) {
                int temp = arr[scannerPointer];
                arr[scannerPointer] = arr[++lastSwapPointer];
                arr[lastSwapPointer] = temp;
            }
        }
        int temp = arr[rightItem];
        arr[rightItem] = arr[++lastSwapPointer];
        arr[lastSwapPointer] = temp;
        
        return lastSwapPointer;
    }

    void sort(int arr[], int low, int high) {
        if (low < high) {
            int partitonIndex = findPartitionIndexForPivot(arr, low, high);
            sort(arr, low, partitonIndex - 1);
            sort(arr, partitonIndex + 1, high);
        }
    }

    public static void main(String[] args) throws Exception {
        int arr[] = { 10, 7, 8, 9, 1, 5 };
        int arrayLength = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, --arrayLength);

        // QuickSortPasjaInformatyki quickSortPasjaInformatyki = new QuickSortPasjaInformatyki();
        // quickSortPasjaInformatyki.quickSort(arr,0, --arrayLength);

        printArray(arr);
    }

    static void printArray(int arr[]) {
        for (int i : arr)
            System.out.print(i + " ");
    }
}