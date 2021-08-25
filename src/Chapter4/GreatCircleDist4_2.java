package Chapter4;
import java.util.*;

public class GreatCircleDist4_2 {
		public static void main(String ar[]) {
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
			double x1=scan.nextDouble();
			double y1=scan.nextDouble();
			System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
			double x2=scan.nextDouble();
			double y2=scan.nextDouble();
			x1=Math.toRadians(x1);
			y1=Math.toRadians(y1);
			x2=Math.toRadians(x2);
			y2=Math.toRadians(y2);
			double radius=6371.01;
			double d=radius*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
			System.out.println("The distance between the two points is "+d+" Km");
		}}
