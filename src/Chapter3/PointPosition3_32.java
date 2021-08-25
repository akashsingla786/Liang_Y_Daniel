package Chapter3;

import java.util.Scanner;

public class PointPosition3_32 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter three points for p0, p1, and p2: ");
	float x0=scan.nextFloat();
	float y0=scan.nextFloat();
	float x1=scan.nextFloat();
	float y1=scan.nextFloat();
	float x2=scan.nextFloat();
	float y2=scan.nextFloat();
	
	float p2=(x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
	if(p2>0)
		System.out.println("p2 is on the left side of the line");
	else if(p2==0)
		System.out.println("p2 is on the same line");
	else
		System.out.println("p2 is on the right side of the line");
	
}
}
