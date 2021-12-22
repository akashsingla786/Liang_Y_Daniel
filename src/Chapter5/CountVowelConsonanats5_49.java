package Chapter5;

import java.util.Scanner;

public class CountVowelConsonanats5_49 {
public static void main(String ar[]) {
	
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter a string : ");
	String str=scan.nextLine();
	str=str.replaceAll(" " , "");
	char ch;
	int count=0,c=0;
	for(int i=0;i<str.length();i++) {
		ch=str.charAt(i);
		if(ch=='a' || ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'|| ch=='o'||ch=='O'||ch=='u'||ch=='U') {
			count++;
		}
		else
			c++;
	}
	System.out.println("The number of vowels is : "+count);
	System.out.println("The number of consonants is : "+c);
}
}
