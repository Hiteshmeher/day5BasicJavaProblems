package day5BasicJavaProblems;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		n = sc.nextInt();

		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(" " + i);
				n = n / i;
				i = 1;

			}
		}
	}
}