import java.util.*;
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Enter the size of array");
		n = sc.nextInt();
		int array[] = new int[n];
		
		System.out.println("Enter the array");
		for(int i=0;i<n;i++)
			array[i] = sc.nextInt();
			
		MergeSortRecr(array);
		
		System.out.println("Sorted array");
		for(int i:array)
			System.out.println(i);
		
	}
	
	public static void MergeSortIter(int array[]){
		// 2 way merging which is iterative merging
		int mid = array.length/2;
		
		
	}

	public static void MergeSortRecr(int[] array) {
		//always have a base case in recursive
		if(array == null)
			return;
		
		if(array.length >1)
		{
			int mid = array.length/2;
		
			//split into left part
			int left[] = new int[mid];
			for(int i=0;i<mid;i++)
				left[i] = array[i];
			
			//split into right part
			int right[] = new int[array.length - mid];
			for(int i=mid;i<array.length;i++)
				right[i-mid] = array[i];
			
			
			MergeSortRecr(left);
			MergeSortRecr(right);
			
			int i=0,j=0,k=0;
			//merging
			while(i<left.length && j<right.length){
				if(left[i]<right[j])
				{
					array[k] = left[i];
					i++;
				}
				else
				{
					array[k] = right[j];
					j++;
				}
				k++;
			}
			
			//if one array ends before other
			while(i<left.length){
				array[k] = left[i];
				i++;k++;
			}
			while(j<right.length){
				array[k] = right[j];
				j++;k++;
			}
		}
		}

}
