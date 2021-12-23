package Chapter6;

import java.util.Scanner;

public class PalindromeInteger6_3 {
	public static void main(String ar[]) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
//		System.out.println(reverse(n));
		int n2=reverse(n);
		System.out.println(isPalindrome(n,n2));
	}
	public static int reverse(int number) {
		int sum=0;
		int a=10;
		while(number!=0) {
			sum=sum*10+number%10;
			number/=10;
		}
		return sum;
	}
	public static boolean isPalindrome(int number,int number2) {
		return number==number2;
	}

}
