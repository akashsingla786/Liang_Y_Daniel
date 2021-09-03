package Chapter4;

import java.util.Scanner;

public class ProcessAString4_20 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter String :");
	String str=scan.nextLine();
	System.out.println("Length of String is :"+str.length());
	System.out.println("Last Character of string is :"+str.charAt(str.length()-1));
}
}
