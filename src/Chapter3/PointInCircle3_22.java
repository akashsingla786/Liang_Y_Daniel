package Chapter3;
import java.util.*;
public class PointInCircle3_22 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter a point with two coordinates: ");
	float x=scan.nextFloat();
	float y=scan.nextFloat();
	float d=(float) Math.pow((x*x)+(y*y), 0.5);
	if(d<=10)
		System.out.println("point ("+x+", "+y+" ) is in the circle");
	else
		System.out.println("point ("+x+", "+y+" ) is not in the circle");
	
}
}
