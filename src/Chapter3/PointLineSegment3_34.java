package Chapter3;

import java.util.Scanner;

public class PointLineSegment3_34 {

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
	
	if(p2==0 && x2>x0 &&x2<x1 && y2<y1 &&y2>y0)
		System.out.println("("+x2+", "+y2+" )"+" is on the line segment from "+" ("+x0+", "+y0+")"+" to "+"("+x1+", "+y1+")");
	else
		System.out.println("("+x2+", "+y2+" )"+" is not on the line segment from "+" ("+x0+", "+y0+")"+" to "+"("+x1+", "+y1+")");
	
}
}
