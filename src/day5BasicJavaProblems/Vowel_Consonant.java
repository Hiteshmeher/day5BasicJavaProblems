package day5BasicJavaProblems;

import java.util.Scanner;

public class Vowel_Consonant {

	public static void main(String[] args) {
		System.out.println("Enter a Character");
		Scanner sc = new Scanner(System.in);
		char x = sc.next().charAt(0);
		if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
			System.out.println("Entered Character is Vowel");
		} else
			System.out.println("Entered Character is Consonant");
	}
}
