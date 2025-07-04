package digitalocean.com.java.programming.interview.questions;

public class FabonaciiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0, b = 1;
		int sum = 0;
		System.out.println(" Using Normal Approach");

		for (int i = 0; i < 10; i++) {
			System.out.print(a + " ");
			sum = a + b;

			a = b;
			b = sum;
		}

		int count = 10;
		System.out.println();
		System.out.println(" Using Resucrsion");
		for (int i = 0; i < count; i++) {
			System.out.print(findfabonaciiUsingRecursion(i) + " ");
		}

	}

	private static int findfabonaciiUsingRecursion(int i) {
		// TODO Auto-generated method stub

		if (i <= 1) {
			return i;
		}

		return findfabonaciiUsingRecursion(i - 1) + findfabonaciiUsingRecursion(i - 2);
	}

}
