package Chapter5;

import java.util.Scanner;

public class DisplayPyramid5_17 {
	public static void main(String ar[]) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int n=scan.nextInt();
		for(int i=n;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print(j+" ");
			}
			for(int j=2;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
			
		}
	}

}
