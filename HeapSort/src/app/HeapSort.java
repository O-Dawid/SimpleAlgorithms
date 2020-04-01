package app;

public class HeapSort {
    public void sort(int arr[]) {
        int arrayLength = arr.length;
        arr = getMaxHeapFromTheMiddle(arr, arrayLength);
        startExtractionPhase(arr, arrayLength);
    }

    private int[] getMaxHeapFromTheMiddle(int[] arr, int arrayLength) {
        for (int i = arrayLength / 2 - 1; i >= 0; i--)
            heapify(arr, arrayLength, i);
        return arr;
    }

    private void startExtractionPhase(int[] arr, int arrayLength) {
        for (int currentArrayLength = arrayLength - 1; currentArrayLength >= 0; currentArrayLength--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[currentArrayLength];
            arr[currentArrayLength] = temp;
            // extract MAX HEAP to the Root
            heapify(arr, currentArrayLength, 0);
        }
    }

    void heapify(int arr[], int arrayLength, int indexLocalRoot) {
        int indexOfLargestValue = indexLocalRoot;
        int indexOfLeftChild = 2 * indexLocalRoot + 1;
        int indexOfRightChild = 2 * indexLocalRoot + 2;

        if (indexOfLeftChild < arrayLength && arr[indexOfLeftChild] > arr[indexOfLargestValue])
            indexOfLargestValue = indexOfLeftChild;

        if (indexOfRightChild < arrayLength && arr[indexOfRightChild] > arr[indexOfLargestValue])
            indexOfLargestValue = indexOfRightChild;

        if (indexOfLargestValue != indexLocalRoot) {
            int swap = arr[indexLocalRoot];
            arr[indexLocalRoot] = arr[indexOfLargestValue];
            arr[indexOfLargestValue] = swap;

            heapify(arr, arrayLength, indexOfLargestValue);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printSortedArray(arr);
    }

    static void printSortedArray(int arr[]) {
        int arrayLength = arr.length;
        for (int i = 0; i < arrayLength; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}