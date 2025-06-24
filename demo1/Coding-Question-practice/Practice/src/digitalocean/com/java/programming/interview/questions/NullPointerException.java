package digitalocean.com.java.programming.interview.questions;

public class NullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		printString(str, 3);

		System.out.println(str);
	}

	private static void printString(String str, int n) {
		System.out.println(str);
		for (int i = 0; i <= n; i++) {
			try {

				System.out.println(str.toUpperCase()+" >>>> ");
			} catch (Exception ex) {
				ex.printStackTrace();
				System.out.println("Null Pointer Exception :: " + ex.getMessage());
			}
		}
	}

}
