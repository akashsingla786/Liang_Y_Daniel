package Chapter3;
import java.util.*;
public class QuadraticRoots3_1 {
public static void main(String ar[])
{
	Scanner scan=new Scanner (System.in);
	System.out.print("Enter a, b, c: ");
	float a=scan.nextFloat();
	float b=scan.nextFloat();
	float c=scan.nextFloat();
	float d=(b*b)-(4*a*c);
//	System.out.println(d);
	float r1=0;
	float r2=0;
	if(d>0)
	{
		r1=(float) ((-b+Math.pow(d, 0.5))/(2*a));
		r2=(float) ((-b-Math.pow(d, 0.5))/(2*a));
		System.out.println("The equation has two roots "+r1+" and "+r2);
	}
	else if(d==0)
	{
		r1=(float) ((-b+Math.pow(d, 0.5))/(2*a));
		System.out.println("The equation has one root "+r1);
	}
	else
		System.out.println("The equation has no real roots");
}
}
