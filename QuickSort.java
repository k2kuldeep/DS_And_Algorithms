public class QuickSort {
	
	static void QuickS(int arr[], int low, int high) {
		if(low>high) return;
		int mid=low+(high-low)/2;
		int pivot=arr[mid];
		int i=low;
		int j=high;
		while(i<=j) {
			while(arr[i]<pivot)
				i++;
			while(arr[j]>pivot)
				j--;
			if(i<=j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		if(low<j) {
			QuickS(arr, low, j);
		}
		if(high>i) {
			QuickS(arr, i, high);
		}
		
		
	}

	public static void main(String[] args) {
	int arr[]= {10,33,8,7,66};
	System.out.println("Before shorting");
	for(int k=0;k<arr.length;k++)
	System.out.print(arr[k]+" ");
	QuickS(arr, 0, arr.length-1);
	System.out.println("\nAfter Shorting");
	for(int k=0;k<arr.length;k++)
		System.out.print(arr[k]+" ");
	}
}
