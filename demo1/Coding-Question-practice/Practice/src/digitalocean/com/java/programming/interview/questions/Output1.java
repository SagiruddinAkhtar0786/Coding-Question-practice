package digitalocean.com.java.programming.interview.questions;

public class Output1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		String str1 = "sagir";
		System.out.println(str1.equals("sagir"));
		try {
			
			System.out.println(str1.equals("sagir") | str.equals(null)); //Exception in thread "main" java.lang.NullPointerException
			//at digitalocean.com.java.programming.interview.questions.Output1.main(Output1.java:10)
		}catch(Exception ex) {
			System.out.println(str +"string in null : "+ex.getMessage());
		}
		
		String x = "abc";
		String y = "abc";

		x.concat(y);
		
		String newStr = x.concat(y);

		System.out.println("value of x not change >>  "+x);
		System.out.println("creates new string >> "+newStr);


	}

}
