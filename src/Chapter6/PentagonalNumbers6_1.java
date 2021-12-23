package Chapter6;

import java.util.Scanner;

public class PentagonalNumbers6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);		
		int n=scan.nextInt();
		System.out.println("The number is: "+getPentagonalNumber(n));
	}
	
	public static int getPentagonalNumber(int n) {
		int a=0;
		
			a=(n*(3*n-1))/2;
		
		return a;
		
		
		
		
	}

}
