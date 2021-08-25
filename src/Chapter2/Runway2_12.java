package Chapter2;
import java.util.*;
public class Runway2_12 {
public static void main(String ar[])
{
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter speed and acceleration: ");
	float speed=scan.nextFloat();
	float acc=scan.nextFloat();
	float length=(speed*speed)/(2*acc);
	System.out.println("The minimum runway length for this airplane is "+length);
}
}
