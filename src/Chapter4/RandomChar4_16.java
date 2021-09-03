package Chapter4;

import java.util.Random;
import java.util.Scanner;

public class RandomChar4_16 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	int n = (int)(Math.random() * 27);
	char ch=(char) (n+'a');
	System.out.println(ch);
}
}
