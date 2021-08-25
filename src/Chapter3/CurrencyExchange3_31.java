package Chapter3;

import java.util.Scanner;

public class CurrencyExchange3_31 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the exchange rate from dollars to RMB: ");
	float rate=scan.nextFloat();
	System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
	float a=scan.nextFloat();
	
	
	if(a==0)
	{
		System.out.print("Enter the dollar amount: ");
		float dollar=scan.nextFloat();
		System.out.println("$"+dollar+" is "+rate*dollar+" yuan");
	}
	else if(a==1)
	{
		System.out.print("Enter the RMB amount: ");
		float dollar=scan.nextFloat();
		System.out.println(dollar+" yuan is $"+dollar/rate);
	}
	else
		System.out.println("Incorrect input");
}
}
