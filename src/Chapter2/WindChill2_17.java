package Chapter2;
import java.util.*;
public class WindChill2_17 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
	float t=scan.nextFloat();
	System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
	float v=scan.nextFloat();
	float wc=(float) (35.74+(0.6215*t)-(35.75*(Math.pow(v, 0.16)))+(0.4275*t*Math.pow(v, 0.16)));
	System.out.println("The wind chill index is "+wc);
}
}
