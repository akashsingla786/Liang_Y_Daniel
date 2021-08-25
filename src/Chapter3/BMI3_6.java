package Chapter3;
import java.util.*;
public class BMI3_6 {
public static void main(String ar[]) {
	Scanner scan=new Scanner (System.in);
	System.out.print("Enter weight in pounds:");
	double w=scan.nextDouble();
	System.out.print("Enter feet: ");
	double f=scan.nextDouble();
	System.out.print("Enter inches: ");
	double in=scan.nextDouble();
	w=(double) (w*0.453592);
	f=(double) (0.3048*f);
	in=(double) (in*0.0254);
	double h=f+in;
	double bmi=w/(h*h);
	System.out.println("BMI is "+bmi);
	 if (bmi < 18.5)
         System.out.println("Underweight");
     else if (bmi < 25)
         System.out.println("Normal");
     else if (bmi < 30)
         System.out.println("Overweight");
     else
         System.out.println("Obese");

			}
}
