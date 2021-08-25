package Chapter3;
import java.util.*;
public class PickCard3_24 {
	public static void main(String[] args) {
		Random rn=new Random();
		int rank = (int)((rn.nextInt(13) ));
//		System.out.println(rank);
		
		int suit = (int)(rn.nextInt(4));
//		System.out.println(suit);
		System.out.print("The card you picked is ");
		switch(rank) 
		{
			case 0: System.out.print("Ace"); break;
			case 1: System.out.print(rank); break;
			case 2: System.out.print(rank); break;
			case 3: System.out.print(rank); break;
			case 4: System.out.print(rank); break;
			case 5: System.out.print(rank); break;
			case 6: System.out.print(rank); break;
			case 7: System.out.print(rank); break;
			case 8: System.out.print(rank); break;
			case 9: System.out.print(rank); break;
			case 10: System.out.print("Jack"); break;
			case 11: System.out.print("Queen"); break;
			case 12: System.out.print("King"); 
		}
		System.out.print(" of ");
		switch (suit) 
		{
			case 0: System.out.println("Clubs"); break;
			case 1: System.out.println("Diamonds"); break;
			case 2: System.out.println("Hearts"); break;
			case 3: System.out.println("Spades"); 
		}
	}
}
