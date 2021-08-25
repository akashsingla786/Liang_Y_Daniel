package Chapter3;

import java.util.Scanner;

public class CompareCost3_33 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter weight and price for package 1: ");
	float w1=scan.nextFloat();
	float p1=scan.nextFloat();
	System.out.print("Enter weight and price for package 2: ");
	float w2=scan.nextFloat();
	float p2=scan.nextFloat();
	
	float s=p1/w1;
	float s1=p2/w2;
	if(s>s1)
		System.out.println("Package 2 has a better price.");
	else if(s<s1)
		System.out.println("Package 1 has a better price.");
	else
		System.out.println("Two packages have the same price.");
}
}
