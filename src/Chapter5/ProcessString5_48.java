package Chapter5;

import java.util.Scanner;

public class ProcessString5_48 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter a String: ");
	String str=scan.nextLine();
	
	for(int i=0;i<str.length();i++) {
		if(i%2!=0 && str.charAt(i)!=' ')
			System.out.print(str.charAt(i));
	}
		
}
}
