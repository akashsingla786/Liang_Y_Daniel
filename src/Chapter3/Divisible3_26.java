package Chapter3;
import java.util.*;
public class Divisible3_26 {
public static void main(String ar[])
{
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int n=scan.nextInt();
	System.out.println("Is "+n+" divisible by 4 and 5? " +((n % 4 == 0) && (n % 5 == 0)));
	System.out.println("Is "+n+" divisible by 4 or 5? " +((n % 4 == 0) ||(n % 5 == 0)));
	System.out.println("Is "+n+" divisible by 4 and 5 but not both? " +((n % 4 == 0) ^(n % 5 == 0)));
}
}
