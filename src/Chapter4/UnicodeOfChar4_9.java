package Chapter4;

import java.util.Scanner;

public class UnicodeOfChar4_9 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter a character: ");
	char ch=scan.next().charAt(0);
	int a=ch;
	System.out.println("The Unicode code for character "+ch+" is "+a);
	
}
}
