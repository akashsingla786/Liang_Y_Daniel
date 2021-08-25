package Chapter2;
import java.util.*;
public class Financial2_5 {
	public static void main(String ar[])
	{
		System.out.print("Enter the subtotal and a gratuity rate:");
		Scanner scan=new Scanner(System.in);
		float subTotal=scan.nextFloat();
		float gratuity=scan.nextFloat();
		float f=gratuity/subTotal;
		subTotal=subTotal+f;
		System.out.println("The gratuity is $"+f+" and total is $"+subTotal);
	}
}
