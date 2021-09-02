package Chapter4;

import java.util.Scanner;

public class BinaryToDec4_11 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter binary digits (0000 to 1111): ");
	String str=scan.nextLine();
	System.out.println("The decimal value is "+Integer.parseInt(str,2));
}
}
