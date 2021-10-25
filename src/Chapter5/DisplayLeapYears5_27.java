package Chapter5;

public class DisplayLeapYears5_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=2014;i<=2114;i++) {
			if((i % 400 == 0) || ((i % 4 == 0) && (i % 100 != 0))) {
					System.out.println(i+" ");
					count++;
			}
			
	
		
		
	}
		System.out.println("total number of years are: "+count );
}}
