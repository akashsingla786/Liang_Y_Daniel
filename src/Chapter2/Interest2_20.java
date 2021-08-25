package Chapter2;
import java.util.*;
public class Interest2_20 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
	float bal=scan.nextFloat();
	float ir=scan.nextFloat();
	float i=(float) (bal*(ir/1200.0));
	System.out.println("The interest is "+i);
}
}
