//The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order)
//from unsorted part and putting it at the beginning.
//time complexity = O(n2)
//space complexity = O(1)
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {64,25,12,22,11};
		
		sortArray(arr);
		printArray(arr);
		
	}

	private static void sortArray(int[] arr) {
		// TODO Auto-generated method stub
		int len = arr.length;
		
		for(int i=0;i<len-1;i++){
			
			int minIndex = i;
			for(int j=i+1;j<len;j++){
				if(arr[j] < arr[minIndex])
					minIndex = j;
			}
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	

	private static void printArray(int arr[]) {
		// TODO Auto-generated method stub
		for(int i:arr)
			System.out.print(i+"\t");
	}
	
}
