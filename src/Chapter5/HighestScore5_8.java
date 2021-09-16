package Chapter5;

import java.util.Scanner;

public class HighestScore5_8 {
public static void main (String ar[]) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int max=Integer.MIN_VALUE;
	String name="";
	for(int i=0;i<n;i++) {
		String str=scan.next();
		int k=scan.nextInt();
		if(k>max) {
			max=k;
			name=str;
			
		}
	}
	System.out.println("Name of the student: "+name+" with highest score: "+max);
}
}
