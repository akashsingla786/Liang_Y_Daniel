package Chapter2;
import java.util.*;
public class MultiplyDigits2_6 {
public static void main(String ar[])
{	
	System.out.print("Enter a number between 0 and 1000:");
	Scanner scan=new Scanner (System.in);
	int n=scan.nextInt();
	int pro=1;
	int temp=n;
	while(n>0)
	{
		pro=pro*(n%10);
		n=n/10;
	}
	System.out.print("The multiplication of all digits in "+temp+" is "+pro);
}
}
