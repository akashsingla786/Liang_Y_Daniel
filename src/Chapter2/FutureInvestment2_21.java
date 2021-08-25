package Chapter2;
import java.util.*;
public class FutureInvestment2_21 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter investment amount: ");
	float amo=scan.nextFloat();
	System.out.print("Enter annual interest rate in percentage: ");
	float rate=scan.nextFloat();
	rate=rate/1200;
	System.out.print("Enter number of years: ");
	int year=scan.nextInt();
	float fi=(float) (amo*Math.pow(1+rate,year*12));
	System.out.println("Future value is $"+fi);
}
}
