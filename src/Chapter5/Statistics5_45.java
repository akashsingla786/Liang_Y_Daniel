package Chapter5;

import java.util.Scanner;

public class Statistics5_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scan=new Scanner(System.in);
			int sum=0;
			float dev=0;
			System.out.print("Enter 10 numbers: ");
			float n;
			for(int i=0;i<10;i++) {
				n=scan.nextFloat();
				sum+=n;
				dev+=Math.pow(n, 2);
			}
			
			dev= (float) Math.sqrt((dev - (Math.pow(sum, 2) / 10)) / (10 - 1));

			float mean=sum/10;
			
			System.out.println("The mean is : "+mean);
			System.out.println("The standard deviation is : "+dev);
			
		
	}

}
