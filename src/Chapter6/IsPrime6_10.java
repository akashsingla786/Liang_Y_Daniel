package Chapter6;

public class IsPrime6_10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfPrimes = 0;	// Counts the number of prime numbers

		// Find the number of prime numbers less than 10000
		for (int i = 1; i < 10000; i++) {
			int count=0;
			for(int j=2;j<=i;j++) {
				if(i%j==0)
					count++;
			}
			if(count==1)
				numberOfPrimes++;
		}

		// Display result
		System.out.println(
			"The number of prime numbers less than 10000: " + numberOfPrimes);
	}
}
