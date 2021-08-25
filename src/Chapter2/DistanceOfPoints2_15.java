package Chapter2;
import java.util.*;
public class DistanceOfPoints2_15 {
public static void main(String ar[])
{
	Scanner scan=new Scanner (System.in);
	System.out.print("Enter x1 and y1: ");
	double x1=scan.nextDouble();
	double y1=scan.nextDouble();
	System.out.print("Enter x2 and y2: ");
	double x2=scan.nextDouble();
	double y2=scan.nextDouble();
	
	double dist=Math.sqrt((Math.pow((x2-x1),2))+Math.pow((y2-y1), 2));
	System.out.println("The distance between the two points is "+dist);
}
}
