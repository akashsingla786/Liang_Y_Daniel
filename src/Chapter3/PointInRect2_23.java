package Chapter3;
import java.util.*;
public class PointInRect2_23 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter a point with two coordinates: ");
	float x=scan.nextFloat();
	float y=scan.nextFloat();
	boolean withinRectangle = (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2 ) || (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2);
	System.out.println("Point (" + x + ", " + y + ") is " +((withinRectangle) ? "in " : "not in ") + "the rectangle");
	
}

}
