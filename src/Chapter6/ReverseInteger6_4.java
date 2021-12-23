package Chapter6;

import java.util.Scanner;

public class ReverseInteger6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
System.out.println("The reversed number is : "+reverse(n));
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
}
