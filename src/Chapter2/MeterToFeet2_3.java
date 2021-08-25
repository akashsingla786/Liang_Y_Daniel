package Chapter2;
import java.util.*;
public class MeterToFeet2_3 {
public static void main(String ar[])
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Value for meter: ");
	float meter=scan.nextFloat();
	float feet=(float) (meter*3.2786);
	System.out.println(meter+" meters is"+feet+" feet");
}
}
