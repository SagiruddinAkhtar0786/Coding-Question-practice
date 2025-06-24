package digitalocean.com.java.programming.interview.questions;

enum Days {
	Monday, Tuesday, Wednesday, Thurday, Friday, Saturday, Sunday;
}

public class Enum_Question {

	public static void main(String[] args) {
		Days today = Days.Friday;
		
		switch(today){
		case Monday : 
			System.out.println("Toay is Monday ");
			break;
		case Tuesday:
			System.out.println("today is tuesday");
			break;
			
		case Friday:
			System.out.println("Today is Friday >> ");
			break;
			
		default:
			System.out.println("It is normal day");
	
		}
		
		System.out.println("\nAll Days");
		
		for(Days d : Days.values())
			System.out.println(d);
	}

}
