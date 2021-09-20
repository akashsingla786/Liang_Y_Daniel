package Chapter5;

import java.util.Scanner;

public class DisplayPattern5_18 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter number of lines: ");
	int n=scan.nextInt();
	System.out.println("Pattern A");
	for(int i=1;i<=n;i++) {
		for(int j=0;j<i;j++) {
			System.out.print("* ");
		}
		System.out.println("");
	}
	
	System.out.println("Pattern B");
	for(int i=n;i>0;i--) {
		for(int j=0;j<i;j++) {
			System.out.print("* ");
		}
		System.out.println("");
		
		
	}
	
	System.out.println("Pattern C");
	for (int i = 1; i <= n; i++) {
		for (int k = n - i;  k>= 1; k--) {
			System.out.print("  ");
		}
		for (int j = i; j >= 1; j--) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	System.out.println("Pattern D");
	
	for (int i = 0; i < n; i++) {			
		for (int k = 0; k < i; k++) {		
			System.out.print("  ");
		}
		for (int j = 0; j < 6 - i; j++) {	
			System.out.print("* ");
		}
		System.out.println();							
	}
	
	
}
}
