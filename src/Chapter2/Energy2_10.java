package Chapter2;
import java.util.*;
public class Energy2_10 {
public static void main(String ar[])
{
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the amount of water in kilograms: ");
	float water=scan.nextFloat();
	System.out.print("Enter the initial temperature: ");
	float intemp=scan.nextFloat();
	System.out.print("Enter the final temperature: ");
	float fitemp=scan.nextFloat();
	float energy=water*(fitemp-intemp)*4184;
	System.out.print("The energy needed is "+energy);
}
}
