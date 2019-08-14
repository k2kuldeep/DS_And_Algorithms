/*Selection Sort Implementation.(UNSTABLE)
Select the minimum element fromn the array and keep it at beginning. Then select smaller element from remaining array and keep it at 2nd position.
At any time array is divided into two parts : one sorted and other unsorted.
time complexity = O(n2)
space complexity = O(1)
*/
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {64,25,12,22,11};
		int len = arr.length;
		
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
		
		//code
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
		
		for(int i:arr)
			System.out.print(i+" ");
	}	
}
