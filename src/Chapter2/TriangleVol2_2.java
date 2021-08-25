package Chapter2;

import java.util.Scanner;

public class TriangleVol2_2 {
public static void main(String ar[])
{
	Scanner scan=new Scanner (System.in);
	float side=scan.nextFloat();
	float area= (float) (Math.sqrt(3)*side*side)/4;
	float volume=area*side;
	System.out.println(area);
	System.out.println(volume);
}
}
