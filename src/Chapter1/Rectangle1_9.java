package Chapter1;
import java.util.*;
public class Rectangle1_9 {
public static void main(String ar[])
{
	Scanner scan=new Scanner(System.in);
	double width=scan.nextDouble();
	double height=scan.nextDouble();
	double peri=2*(width+height);
	double area=height*width;
	System.out.println(peri);
	System.out.println(area);
}
}
