package Chapter5;

import java.util.Scanner;

public class ReverseAString5_46 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter a string : ");
	String name=scan.nextLine();
	
	String str="";
	
	for(int i=name.length()-1;i>=0;i--) {
		str=str+name.charAt(i);
//System.out.println(str);
	
	}
	System.out.println("The reversed string is : "+str);
}
}
