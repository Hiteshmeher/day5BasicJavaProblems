package day5BasicJavaProblems;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] args) {
		int n;
		int power = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter power of 2 ");
		n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			if (0 <= n && n <= 31)
				power = 2 * power;
			System.out.println(+power);
			i++;
		}
	}
}