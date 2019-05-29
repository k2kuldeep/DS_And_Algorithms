import java.util.*;
public class MaxAndMin {
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
		
		//MaxMin(arr, n);
		MaxMinRec(arr, 0, n-1);
		System.out.println("Maximum = "+max+"\t Minimum = "+min);
	}
	
	/*public static void MaxMin(int arr[],int n){
		int max,min;
		max=min=arr[0];
		
		for(int i=1;i<n;i++){
			if(arr[i]>max)
				max = arr[i];
			else if(arr[i]<min)
				min = arr[i];
		}
		
		System.out.println("Maximum = "+max+"\t Minimum = "+min);
	}*/
	
	static int min,max;
	public static void MaxMinRec(int arr[],int i,int j){
		max = min = arr[0];
		if(i == j)
		{
			max = min = arr[i];
		}
		else if(i== j-1)
		{
			if(arr[i] < arr[j]){
				min = arr[i];
				max = arr[j];
			}
			else{
				min = arr[j];
				max = arr[i];
			}
		}
		else{
			int mid = (i+j)/2;
			MaxMinRec(arr,i,mid);
			int max1 = max,min1 = min;
			MaxMinRec(arr, mid+1, j);
			if(max1>max) max = max1;
			if(min1 < min) min = min1;
		}
		
	}

}
