package Chapter2;

import java.util.Scanner;

public class Ping2_4 {
public static void main(String ar[])
{
	System.out.print("Enter a number in square meters: ");
	Scanner scan=new Scanner(System.in);
	float meter=scan.nextFloat();
	float pings=(float) (meter*0.3025);
	System.out.println(meter+" square meters is "+pings+" pings");
}
}
