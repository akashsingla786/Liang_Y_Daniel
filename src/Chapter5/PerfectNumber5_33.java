package Chapter5;

import java.util.Scanner;

public class PerfectNumber5_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=1;i<=10000;i++) {
		int temp=i;
			int sum=0;
		for(int j=1;j<i;j++) {
			if(i%j==0)
			{
				sum=sum+j;
			}
		}
		if(sum==temp)
			System.out.println(sum);

	}}

}
