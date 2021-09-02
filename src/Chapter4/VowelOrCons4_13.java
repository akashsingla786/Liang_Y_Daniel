package Chapter4;

import java.util.Scanner;

public class VowelOrCons4_13 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter a letter: ");
	char ch=scan.next().charAt(0);
	if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
			if(Character.toUpperCase(ch)=='A' || Character.toUpperCase(ch)=='E' || Character.toUpperCase(ch)=='I' ||Character.toUpperCase(ch)=='O'||Character.toUpperCase(ch)=='U') {
				System.out.println(ch+" is a vowel");
			}
			else {
				System.out.println(ch+" is a consonant");
			}
	}
	else
		System.out.println(ch+" is an invalid input");
}
}
