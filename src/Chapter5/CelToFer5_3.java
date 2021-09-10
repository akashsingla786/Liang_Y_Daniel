package Chapter5;

import java.util.Scanner;

public class CelToFer5_3 {
public static void main(String ar[]) {
	
	System.out.println("Celsius"+"			"+"Fahrenheit");
	for(int i=0;i<=100;i=i+2)
	{
		float f=(i*9/5)+32;
		System.out.println(i+"			"+f);
	}
}
}
