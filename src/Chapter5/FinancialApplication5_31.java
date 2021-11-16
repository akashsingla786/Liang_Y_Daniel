package Chapter5;

import java.util.Scanner;

public class FinancialApplication5_31 {

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
		double sum=amount;
		
		System.out.println("Month 		 CD Value");
	
		for(int i=1;i<=months;i++) {
					sum=sum +(sum * intr);
					System.out.println(i+" 		"+sum);
						
//					sum=amount;
		}
//	System.out.println(sum);

	}

}
