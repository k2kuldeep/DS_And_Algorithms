import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,i,x;
		
		System.out.println("Enter the size of array");
		n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the array");
		for(i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number to search");
		x = sc.nextInt();
		
		//int result = BinSearchRec(arr,0,arr.length-1,x);
		int result = BinSearchIter(arr, n, x);
		if(result == 0)
			System.out.println("Element not found");
		else
			System.out.println("Element found at x = "+(int)(result+1));
	}
	
	public static int BinSearchRec(int arr[],int first,int last,int x){
		if(first==last)
		{
			if(x == arr[first])
				return first;
			else
				return 0;
		}
		else
		{
			int mid = (first+last)/2;
			
			if(x == arr[mid])
				return mid;
			else if(x<arr[mid])
				return BinSearchRec(arr,first,mid-1,x);
			else
				return BinSearchRec(arr,mid+1,last,x);
			
		}
	}
	
	// binary search time : 0(log n)
	public static int BinSearchIter(int arr[],int n,int x){
		int first =1,last=n;
		
		while(first<last){
			int mid = (first+last)/2;
			if(x==arr[mid])
				return mid;
			else if(x<arr[mid])
				last = mid-1;
			else
				first = mid+1;
		}
		return 0;
	}

}
