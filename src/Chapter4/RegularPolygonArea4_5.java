package Chapter4;
import java.util.*;
public class RegularPolygonArea4_5 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the number of sides: ");
	int n=scan.nextInt();
	System.out.print("Enter the side: ");
	double s=scan.nextDouble();
	double area=(n*s*s)/(4*Math.tan(3.14159/n));
	System.out.println("The area of the polygon is "+area);
	
}
}
