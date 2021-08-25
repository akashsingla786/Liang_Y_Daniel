package Chapter3;
import java.util.*;
public class PeimeterTriangle3_19 {
public static void main(String ar[])
{
	Scanner scan=new Scanner(System.in);
	System.out.print(" Edge 1 points x, y: ");
	float x1 = scan.nextFloat();
	float y1 = scan.nextFloat();
	System.out.print(" Edge 2 points x, y: ");
	float x2 = scan.nextFloat();
	float y2 = scan.nextFloat();
	System.out.print(" Edge 3 points x, y: ");
	float x3 = scan.nextFloat();
	float y3 = scan.nextFloat();
	boolean flag=(x1+y1>x3+y3&& x2+y2>x3+y3  )||(x1+y1>x2+y2 && x3+y3>x2+y2)||(x2+y2>x1+y1 && x3+y3>x1+y1);
	if(flag)
	{
		float side1 = (float) Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		float side2 = (float) Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		float side3 = (float) Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
		System.out.println("Perimeter of triangle is :"+(side1+side2+side3));
	}
	else
		System.out.println("Input is Invalid");
}
}
