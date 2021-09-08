package Chapter4;

import java.util.Scanner;

public class ThreeCountries4_24 {
	 public static void main(String[] args){
	        Scanner scan = new Scanner(System.in);

	        System.out.print("Enter the first city: ");
	        String firstCity = scan.nextLine();
	        System.out.print("Enter the second city: ");
	        String secondCity = scan.nextLine();
	        System.out.print("Enter the third city: ");
	        String thirdCity = scan.nextLine();

	        if (firstCity.toUpperCase().compareTo(secondCity.toUpperCase()) > 0){
	            String temp = firstCity;
	            firstCity = secondCity;
	            secondCity = temp;
	        }

	        if (secondCity.toUpperCase().compareTo(thirdCity.toUpperCase()) > 0){
	            String temp = secondCity;
	            secondCity = thirdCity;
	            thirdCity = temp;
	        }

	        if (firstCity.toUpperCase().compareTo(secondCity.toUpperCase()) > 0){
	            String temp = firstCity;
	            firstCity = secondCity;
	            secondCity = temp;
	        }

	        System.out.printf("The three countries in descending order are  %s, %s, %s%n",
	            thirdCity,secondCity,firstCity);
	    }
}
