package Chapter5;

public class LargestSquare5_13 {

public static void main(String ar[]) {
	int n=0;
	while(Math.pow(n+1, 2)<12000) {
		n++;
	}
	System.out.println("Smallest number whose square is less than 12000 is "+n);
}
}
