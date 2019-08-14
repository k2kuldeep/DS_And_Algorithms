/*Bulbble sort implementation.(Stable)
 * First element is check with 2nd element. if 1st is bigger then swapped with 2nd else no swapping. 
 * then 2nd is checked with 3rd and if bigger then swap else not. likewise each element is checked. 2nd last is checked with last.
 * After one round the biggest element will be at last index(its final position). continue till (N-1) rounds.
 * Order - O(n2). bestcase - O(n).
*/
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {64,34,25,12,22,11,90};
		int n = arr.length;
		
		//initial array
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
		
		//code
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)	//only required to go upto last unsorted position. so n-i-1
			{
				
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}	
			}
		}
		
		//sorted array
		for(int i:arr)
			System.out.print(i+" ");
		
		

	}

}
