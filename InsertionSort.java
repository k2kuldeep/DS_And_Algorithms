/*Insertion Sort implementation.(Stable)
 * loop from i=1 to n -> pick element arr[i] and insert it into sorted sequence sequence arr[0,1,....i-1]
 * Loop is done from array position 1 and not 0.
 * Order - O(n2). 
 * Follow Up q - Insertion sort on linked list.
*/
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {64,34,25,12,22,11,90};
		int n = arr.length;
		
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
		
		//code
		for(int i=1;i<n;i++){
			int key = arr[i];	//the element which is to kept at its place
			int j = i-1;		//start checking from one previous element.
			
			//keep swapping elements one forward until element smaller than key is found.
			while(j>=0 && key<arr[j]){
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;	
		}
		
		for(int i:arr)
			System.out.print(i+" ");
	}

}
