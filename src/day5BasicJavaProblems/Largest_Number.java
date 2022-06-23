package day5BasicJavaProblems;

public class Largest_Number {

	public static void main(String[] args) {
		int a = 22;
		int b = 98;
		int c = 102;
		if (a > b && a > c) {
			System.out.println("Largest number is " + a);
		}
		else if (b > a && b > c) {
			System.out.println("Largest number is " + b);
		}
		else 
			System.out.println("Largest number is " + c);

	}

}
