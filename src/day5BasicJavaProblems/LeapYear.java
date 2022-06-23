package day5BasicJavaProblems;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
	        int length = 4;
	        boolean leap = false;
	        System.out.println("Enter the Year");
	        Scanner sc = new Scanner(System.in);
	        int year = sc.nextInt();
	        int yearLength = String.valueOf(year).length();
	        if (length == yearLength){
	            if (year % 4 == 0) {
		            System.out.println(year + " is a leap year.");
	            }
	            else if (year % 400 == 0) {
		            System.out.println(year + " is a leap year.");
	            }
	            else if (year % 100 == 0) {
		            System.out.println(year + " is not a leap year.");
	            }
	          else
	        	  System.out.println(year + " is not a leap year.");  
	        }
	}
}