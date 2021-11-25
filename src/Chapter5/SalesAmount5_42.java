package Chapter5;

import java.util.Scanner;

public class SalesAmount5_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Commission : ");
		final double COMMISSION_SOUGHT = scan.nextDouble(); 
		double salesAmount, 				
				 commission,				
				 balance;					
		salesAmount = 0;
		commission=0;
		 while (commission < COMMISSION_SOUGHT) {
			balance = commission = 0;	
			salesAmount += 0.01;			

			if (salesAmount > 10000)
				commission += (balance = salesAmount - 10000) * 0.10;

			if (salesAmount > 5000)
				commission += (balance -= balance - 5000) * 0.08;
			if (salesAmount > 0)
				commission += balance * 0.06;
		}

		System.out.printf("Minimum sales to earn $30,000: $%.0f\n", salesAmount);	
	
	}

}
