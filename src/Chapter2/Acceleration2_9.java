package Chapter2;
import java.util.*;
public class Acceleration2_9 {
public static void main(String ar[])
{
	System.out.print("Enter v0, v1, and t: ");
	Scanner scan=new Scanner (System.in);
	float v=scan.nextFloat();
	float v1=scan.nextFloat();
	float t=scan.nextFloat();
	float a=(v1-v)/t;
	System.out.println("The average acceleration is "+a);
}
}
