package Chapter5;

public class SmallestCube5_12 {
public static void main(String ar[]) {
	int n=0;
	while(Math.pow(n, 3)<12000) {
		n++;
	}
	System.out.println("Smallest number whose cube is greater than 12000 is "+n);
}
}
