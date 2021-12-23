package Chapter6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class SortThreeNumbers6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[3];
Scanner scan=new Scanner(System.in);

for(int i=0;i<3;i++) {
	arr[i]=scan.nextInt();
	
}
Arrays.sort(arr);
for (int i = 0; i < arr.length; i++) {
	System.out.print(arr[i]+" ");
}
	}

}
