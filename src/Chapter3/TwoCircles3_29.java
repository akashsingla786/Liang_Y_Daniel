package Chapter3;

import java.util.Scanner;

public class TwoCircles3_29 {
public static void main(String ar[]) {	
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter circle1’s center x-, y-coordinates, and radius: ");
	float x1=scan.nextFloat();
	float y1=scan.nextFloat();
	float r1=scan.nextFloat();
	System.out.print("Enter circle2’s center x-, y-coordinates, and radius: ");
	float x2=scan.nextFloat();
	float y2=scan.nextFloat();
	float r2=scan.nextFloat();
	if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) <= Math.abs(r1 - r2))
		System.out.println("circle2 is inside circle1");
	else if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5)<= r1 + r2)
		System.out.println("circle2 overlaps circle1");
	else
		System.out.println("circle2 does not overlap circle1");
}
}
