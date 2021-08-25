package Chapter2;
import java.util.*;
public class Account2_13 {
public static void main(String ar[]) {
		Scanner scan=new Scanner (System.in);
		System.out.print("Enter the monthly saving amount: ");
		double amo=scan.nextDouble();
		for(int i=1;i<=6;i++)
		{
			
			amo=(double) (amo*(1+0.003125));
			System.out.println("After the "+i+" month, the account value is "+amo );
			amo=amo+100;
		}
		
}
}
