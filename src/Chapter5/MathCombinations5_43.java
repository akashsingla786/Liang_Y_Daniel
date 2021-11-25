package Chapter5;

public class MathCombinations5_43 {
public static void main(String ar[]) {
	int count =0;
	for(int i=1;i<=7;i++) {
		for(int j=i+1;j<=7;j++) {
			count++;
		}
	}
	System.out.println("The total number of all combinations is "+count);
}
}


