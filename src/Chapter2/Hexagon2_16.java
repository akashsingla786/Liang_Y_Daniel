package Chapter2;
import java.util.*;
public class Hexagon2_16 {
public static void main(String ar[]) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the length of the side: ");
		float side=scan.nextFloat();
		float area=(float) (((3*Math.sqrt(3))*(side*side))/2);
		System.out.println("The area of the hexagon is "+area);
}
}
