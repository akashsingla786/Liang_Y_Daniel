package Chapter5;

public class NumberDivisblebyButNotBoth5_11 {

public static void main(String ar[]) {
	int k=0;
for(int i=100;i<=200;i++) {
	if((i%3==0 || i%4==0) && (i%12!=0)) {
		k++;
		System.out.print(i+" ");
		if(k%10==0)
			System.out.println("");
			
	}
	
}
}
}
