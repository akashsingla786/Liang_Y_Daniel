package Chapter5;

import java.util.Scanner;

public class FinancialApplication5_22 {
	public static void main(String ar[]) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Loan Amount :");
		double amount=scan.nextDouble();
		System.out.print("number of years :");
		int year=scan.nextInt();
		System.out.print("Annual Interest Rate: ");
		double rate=scan.nextDouble();
		double k=rate/1200;
		double month=amount * k / (1 - 1 / Math.pow(1 + k, year * 12));
		System.out.print("Monthly Payment: ");
		System.out.printf("%1.2f", month);
		double total=month*12*year;
		System.out.print("\nTotal Payment: ");
		System.out.printf("%1.2f", total);
		
System.out.print("\nPayment#		");
System.out.print("Interest		");
System.out.print("Principal		");
System.out.println("Balance		");

for(int i=1;i<=12;i++) {
	System.out.print(i+"                       ");
	
	
	System.out.printf("%1.2f",k*amount);
	System.out.printf("\t\t\t%1.2f", month-(k*amount));
	amount=amount-(month-(k*amount));
	System.out.printf("\t\t\t%1.2f", amount);
	System.out.println("");
}
	}
}
