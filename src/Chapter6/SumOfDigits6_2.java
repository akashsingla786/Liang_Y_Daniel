package Chapter6;

import java.util.Scanner;

public class SumOfDigits6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		long n=scan.nextLong();
		System.out.println("Sum of digits is : "+sumDigits(n));

	}
	public static int sumDigits(long n) {
		int sum=0;
		while(n!=0) {
			sum=(int) (sum+n%10);
			n=n/10;
		}
		
		return sum;
	}

}
