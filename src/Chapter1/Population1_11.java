package Chapter1;

public class Population1_11 {
	public static void main(String[] strings) {

       double birth=31536000/7.0;
       double death=31536000/13.0;
       double immigrant=31536000/45.0;
       double currPop=312032486.0;
       		
       for(int i=0;i<5;i++)
       {
    	   currPop=currPop+birth+immigrant-death;
    	   System.out.println((int )currPop);
       }


    }
}
