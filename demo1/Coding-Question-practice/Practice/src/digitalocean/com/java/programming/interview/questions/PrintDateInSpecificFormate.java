package digitalocean.com.java.programming.interview.questions;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDateInSpecificFormate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String formate = "MM-dd-yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(formate);
		//Date date = new Date(sdf);
		String date = sdf.format(new Date());
		System.out.println(date);
		
	}

}
