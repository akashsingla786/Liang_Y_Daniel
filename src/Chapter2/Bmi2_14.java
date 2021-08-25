package Chapter2;
import java.util.*;
public class Bmi2_14 {
public static void main(String ar[]) {
		Scanner scan=new Scanner (System.in);
		System.out.print("Enter weight in pounds: ");
		float weight=scan.nextFloat();
		System.out.print("Enter height in inches: ");
		float height=scan.nextFloat();
		weight=(float) (weight* 0.45359237) ;
		height=(float)(height*0.0254);
		float bmi=weight/(height*height);
		System.out.println("BMI is "+bmi);
}
}
