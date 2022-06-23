package day5BasicJavaProblems;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
	   System.out.println("Enter a number");
	   Scanner sc = new Scanner(System.in);
	   int x = sc.nextInt();
	   if (x%2 == 0)
		   System.out.println("Entered number is Even");
	   else
		   System.out.println("Entered number is Odd");
	}

}
