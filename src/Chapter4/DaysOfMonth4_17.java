package Chapter4;

import java.util.Scanner;

public class DaysOfMonth4_17 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter a year: ");
	int year=scan.nextInt();
	System.out.print("Enter a month: ");
	String month=scan.next();
	if(month.charAt(0)>='A' && month.charAt(0)<='Z') {
		boolean leap=((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		if(month.equals("Jan")|| month.equals("Mar") ||month.equals("May")||month.equals("Jul")||month.equals("Aug")||month.equals("Oct")||month.equals("Dec")) {
			System.out.println(month+" "+year+" has 31 days");
		}
		else if(month.equals("Apr") || month.equals("Jun") || 
				month.equals("Sep") || month.equals("Nov")) {
			System.out.println(month+" "+year+" has 30 days");
		}
		else
		{
			System.out.println(month+" "+year+" has "+((leap) ? 29 : 28)+" days");
		}
	}
	else
		System.out.println(month+" is not a correct month name");
}
}
