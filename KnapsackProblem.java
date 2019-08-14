//solve 0 1 knapsack problem using dynamic programming
public class KnapsackProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wt[] = {10,20,30};
		int val[] = {60,100,120};
		
		int W = 50;//capacity
		int  n = val.length;
		
		int k[][] = new int[n+1][W+1];
		
		for(int i=0;i<=n;i++){
			
			for(int j=0;j<=W;j++){
				
				if(i==0 || j==0)
					k[i][j] = 0;
				else if(wt[i - 1] <= j)
					k[i][j] = max(val[i-1]+k[i-1][j-wt[i-1]],k[i-1][j]);
				else
					k[i][j] = k[i-1][j];
				
			}
		}
		
		System.out.println(k[n][W]);
		
	}

	static int max(int a,int b) {
		// TODO Auto-generated method stub
		return (a>b)? a:b;
	}

}
