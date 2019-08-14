import java.util.Arrays;
import java.util.Comparator;

//solve fractional knapsack problem by greedy method
public class FractionalKnapsackProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] wt = {10, 40, 20, 30}; 
        int[] p = {60, 40, 100, 120};
		
		int capacity = 50;
		int len = p.length;
		
		//creating an array of class and sorting according to cost of each class 
		//so rest values(profit and weight) will be sorted accordingly
		ArrayValue[] iVal = new ArrayValue[len];
		
		for(int i=0;i<len;i++){
			iVal[i] = new ArrayValue(p[i],wt[i]);
			//System.out.println("iVal = "+iVal[i]);
		}
		
		//comparator interface is used to order the objects of a user defined class
		Arrays.sort(iVal,new Comparator<ArrayValue>() {
			@Override
			public int compare(ArrayValue arg0, ArrayValue arg1) {
				// TODO Auto-generated method stub
				return (arg1.cost).compareTo(arg0.cost);		//arg1 compared to arg0 sorts in descending order
															// while arg0 compared to arg1 sorts in ascending order
			}
		});
		
		double totalValue = 0;
		for(ArrayValue i:iVal){
			//System.out.println(i.cost);
			if(capacity - i.wt >= 0 ){			//when whole item can be added
				capacity -= (int)(i.wt);
				totalValue += i.value;
				
				System.out.println("capacity 1 left = "+capacity);
				System.out.println("profit 1 total = "+totalValue);
			}
			else{								//when only a fraction is added
				double ratio = capacity/i.wt;
				totalValue += ratio*i.value;
				capacity -= (int)(i.wt)*ratio;
				
				System.out.println("capacity 2 left = "+capacity);
				System.out.println("profit 2 total = "+totalValue);
				break;
			}
		}
		System.out.println("total profit = "+totalValue);
	}

	static class ArrayValue
	{
		int value;
		Double cost;
		double wt;
		ArrayValue(int p,double wt){
			this.value = p;
			this.wt = wt;
			
			cost = p/wt;
			
			System.out.println("cost = "+cost);
		}
	}
	
}