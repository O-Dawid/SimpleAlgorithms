package app;

class BinarySearch { 
	int binarySearch(int arr[], int leftBound, int rightBound, int desirable) 
	{ 
		if (rightBound >= leftBound) { 
			int middle = leftBound + (rightBound - leftBound) / 2; 

			if (arr[middle] == desirable) 
				return middle; 

			if (arr[middle] > desirable) 
				return binarySearch(arr, leftBound, middle - 1, desirable); 

			return binarySearch(arr, middle + 1, rightBound, desirable); 
		} 
		return -1; 
	} 

	public static void main(String args[]) 
	{ 
		BinarySearch ob = new BinarySearch(); 
		int arr[] = { 2, 3, 4, 10, 40 }; 
		int arrayLength = arr.length; 
		int lookingFor = 10; 
		int indexOfResult = ob.binarySearch(arr, 0, arrayLength - 1, lookingFor); 
		if (indexOfResult == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at index " + indexOfResult); 
	} 
} 
/* This code is contributed by Rajat Mishra */
