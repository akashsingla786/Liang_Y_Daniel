package Chapter3;
import java.util.*;
public class PointsTriangle3_27 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	float x1=scan.nextFloat();
	float y1=scan.nextFloat();
	float x2=scan.nextFloat();
	float y2=scan.nextFloat();
	float x3=scan.nextFloat();
	float y3=scan.nextFloat();
	System.out.print("Enter a point’s x- and y-coordinates: ");
	float x=scan.nextFloat();
	float y=scan.nextFloat();
//	float side1=(float) Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
//	float side2=(float) Math.sqrt(Math.pow(x3-x1, 2)+Math.pow(y3-y1, 2));
//	float side3=(float) Math.sqrt(Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2));
	float a1,a2,a3,a4;
	a1=(float) Math.abs((x1*(y3-y2)+x3*(y2-y1)+x2*(y1-y3))/2.0);
	a2=(float) Math.abs((x1*(y-y2)+x*(y2-y1)+x2*(y1-y))/2.0);
	a3=(float) Math.abs((x1*(y3-y)+x3*(y-y1)+x*(y1-y3))/2.0);
	a4=(float) Math.abs((x*(y3-y2)+x3*(y2-y)+x2*(y-y3))/2.0);
	
	if(a1==a2+a3+a4)
		System.out.println("The point is in the triangle");
	else
		System.out.println("The point is not in the triangle");
	
}
}
