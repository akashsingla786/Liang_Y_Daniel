package Chapter2;
import java.util.*;
public class Driving_23 {
public static void main(String ar[]) {
	Scanner scan = new Scanner(System.in);

	
	System.out.print("Enter the driving distace: ");
	float dist = scan.nextFloat();
	System.out.print("Enter miles per gallon: ");
	float miles = scan.nextFloat();
	System.out.print("Enter price per gallon: ");
	float price = scan.nextFloat();

	
	float cost = (dist / miles) * price;

	
	System.out.println("The cost of driving is $" + cost);
}
}
