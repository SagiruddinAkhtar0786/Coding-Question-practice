package timeComplexity;

public class TimeComplexityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double now = System.currentTimeMillis();
		
		TimeComplexityDemo complexity = new TimeComplexityDemo();
		//int findSum = ;
		System.out.println(complexity.findSum(12345));
		//System.out.println(complexity.findSumOfN(12345));

		
		System.out.println("Time taken : "+(System.currentTimeMillis() - now));

	}
	
	public int findSum(int n) {
		int sum = 0;
		
		for(int i = 0 ; i <= n ;i++) {
			sum += i;
		}
		return sum;
		
	}
	public int findSumOfN(int n) {
		int sum = 0;
		
		sum = n *(n+1);
		return sum;
		
	}

}
