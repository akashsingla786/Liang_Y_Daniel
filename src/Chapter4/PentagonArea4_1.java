package Chapter4;
import java.util.*;
public class PentagonArea4_1 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the length from the center to a vertex: ");
		float ver=scan.nextFloat();
		float s=(float) (2*ver*Math.sin(3.14/5.0));
		float area=(float) ((5*s*s)/(4*Math.tan(3.14/5.0)));
		System.out.println("The area of the pentagon is "+ area);
}
}
