package day5BasicJavaProblems;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		    int n;
	        double harmonicNumber= 1;
	        System.out.println("Enter the Number ");
	        Scanner scanner = new Scanner(System.in);
	        n = scanner.nextInt();
	        for (int i = 1; i < n; i++){
	            harmonicNumber = (double) (harmonicNumber + (double)1 / (i+1));
	        }
	        System.out.println("Harmonic Value of " + n + " is " + harmonicNumber);
	    }
	}