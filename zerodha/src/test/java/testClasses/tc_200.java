package testClasses;

import java.util.Date;

public class tc_200 {
	public static void main(String[] args) {
		Date d = new Date();
		String str = d.toString();
		
	    str= str.replace(" ", "_");
	    
	    str=str.replace(":", "_");
	    System.out.println(str);

		
	}
}
