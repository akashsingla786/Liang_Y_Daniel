package Chapter5;

import java.util.Scanner;

public class FinancialApplication5_21 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Loan Amount :");
	double amount=scan.nextDouble();
	System.out.print("number of years :");
	int year=scan.nextInt();
	double i=0;
	System.out.print("Interest Rate           ");
	System.out.print("Monthly Paymeny      ");
	System.out.println("Total Payment");
	for(i=5;i<=10;i=i+0.250) {
		System.out.printf("%-5.3f", i);
		System.out.print("%                     ");
		double k=i/1200;
		double inc=amount * k / (1 - 1 / Math.pow(1 + k, year * 12));
		System.out.printf("%-19.2f", inc);
		System.out.printf("%-10.2f\n",(inc * 12) * year);
//		System.out.println(inc);
	}
}
}
