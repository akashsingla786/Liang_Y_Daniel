package Chapter1;
import java.util.*;
public class CramersRule1_13 {
	public static void main(String[] strings) {
		Scanner scan=new Scanner(System.in);
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		double e=scan.nextDouble();
		double c=scan.nextDouble();
		double d=scan.nextDouble();
		double f=scan.nextDouble();
		double x=(e*d-b*f)/(a*d-b*c);
		double y=(a*f-e*c)/(a*d-b*c);
		System.out.println("x ="+x+"\n"+"y ="+y);
    }
}
