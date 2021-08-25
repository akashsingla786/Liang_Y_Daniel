package Chapter3;
import java.util.*;
public class ScissorPaperRock3_17 {
public static void main(String ar[]) {
	Random rn=new Random();
	int n=rn.nextInt(3);
	Scanner scan=new Scanner(System.in);
	System.out.print("scissor (0), rock (1), paper (2): ");
	int input=scan.nextInt();
	switch(n) {
	case 0:
		if(input==n)
			System.out.println("The computer is scissor . you are scissor too. it is a draw");
		else if(input-n==1)
			System.out.println("The computer is scissor. You are rock.You won");
		else
			System.out.println("The computer is scissor. You are paper.You lose");
		break;
	case 1:
		if(input==n)
			System.out.println("The computer is rock . you are rock too. it is a draw");
		else if(input-n== -1)
			System.out.println("The computer is rock. You are scissor.You lose");
		else
			System.out.println("The computer is rock. You are paper.You won");
		break;
	case 2:
		if(input==n)
			System.out.println("The computer is paper . you are paper too. it is a draw");
		else if(input-n== -2)
			System.out.println("The computer is paper. You are scissor.You won");
		else
			System.out.println("The computer is paper. You are rock.You lose");
		break;
	}
}
}
