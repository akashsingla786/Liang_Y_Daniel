package Chapter3;
import java.util.*;
public class TwoRectangles3_28 {
public static void main(String ar[])
{
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter r1’s center x-, y-coordinates, width, and height: ");
	float r1x=scan.nextFloat();
	float r1y=scan.nextFloat();
	float r1w=scan.nextFloat();
	float r1h=scan.nextFloat();
	System.out.print("Enter r2’s center x-, y-coordinates, width, and height: ");
	float r2x=scan.nextFloat();
	float r2y=scan.nextFloat();
	float r2w=scan.nextFloat();
	float r2h=scan.nextFloat();
	if((Math.abs(r1x-r2x)<Math.abs((r1w+r2w)/2)) && (Math.abs(r1y-r2y)<Math.abs((r1h+r2h)/2)) )
	{
		if((r1h / 2 + r2h / 2 <= r1h) &&(r1w / 2 + r2w / 2 <= r1w))
			System.out.println("r2 is inside r1");
		else
			System.out.println("r2 overlaps r1");
		
	}
	else
		System.out.println("r2 does not overlap r1");
}
}
