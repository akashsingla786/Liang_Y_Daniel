package Chapter5;

public class ASCIITable5_15 {
	public static void main(String[] args) {
		int count = 0;	
		for (int i = 33; i <= 126; i++) {
			count++;	
			if (count % 10 == 0)
				System.out.println("");
			else
				System.out.print((char)i + " ");	
		}
		System.out.println();
	}
}
