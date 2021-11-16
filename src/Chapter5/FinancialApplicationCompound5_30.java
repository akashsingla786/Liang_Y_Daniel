package Chapter5;

import java.util.Scanner;

public class FinancialApplicationCompound5_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Amount: ");
		int amount =scan.nextInt();
		System.out.print("Enter interset: ");
		double intr=scan.nextDouble();
		System.out.print("Enter Month: ");
		int months=scan.nextInt();
		intr=intr/(100*12);
//		System.out.println(intr);
		double sum=0;
		for(int i=0;i<months;i++) {
					sum= ((amount+sum)*(1 + intr));
//					sum=amount;
		}
	System.out.println(sum);
	
	}

}
