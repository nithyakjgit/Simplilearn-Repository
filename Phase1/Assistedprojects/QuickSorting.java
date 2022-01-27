package Assistedprojects;
public class QuickSorting {
	int partition(int arr[], int low, int high) 
	{ 
		int pivot = arr[high]; 
		int i = (low-1); // index of smaller element 
		for (int j=low; j<high; j++) 
		{ 
			if (arr[j] <= pivot) 
			{ 
				i++; 

				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		} 

		int temp = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = temp; 

		return i+1; 
	} 

	void sort(int arr[], int low, int high) 
	{ 
		if (low < high) 
		{ 
			int pi = partition(arr, low, high); 
 
			sort(arr, low, pi-1);   // ---> left side
			sort(arr, pi+1, high);  // ----> right side
		} 
	} 

	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	public static void main(String args[]) 
	{ 
        int[] arr= {41 ,36 , 21 , 4 , 19 , 01 , 68 , 28 , 11 , 99 , 54};
		int n = arr.length; 
		
		System.out.println("Given Array");
        printArray(arr);

		QuickSorting ob = new QuickSorting(); 
		ob.sort(arr, 0, n-1); 

		System.out.println("sorted array"); 
		printArray(arr); 
	} 

}
