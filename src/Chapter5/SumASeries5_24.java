package Chapter5;

public class SumASeries5_24 {
public static void main(String ar[]) {
	double sum=0;
	for(int i=1;i<=97;i=i+2) {
		sum+= (double)i/(i+2);
	}
	
	System.out.println("Sum of a series is :"+sum);
}
}
