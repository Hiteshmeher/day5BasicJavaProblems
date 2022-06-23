package day5BasicJavaProblems;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		int x, headscount = 0, tailscount = 0;
		double heads, tails;
		System.out.print("enter no. of times you want to flip the coin: ");
		Scanner n = new Scanner(System.in);
		x = n.nextInt();
		for (int i = 0; i < x; i++) {
			double random = Math.random();
			if (random < 0.5)
				tailscount++;
			else
				headscount++;
		}
		System.out.println("Number of times Head occures " + headscount);
		System.out.println("Number of times Tail occures " + tailscount);

		heads = headscount / (double) x * 100;
		tails = tailscount / (double) x * 100;

		System.out.println("Percentage of heads: " + heads + " %");
		System.out.println("Percentage of tails: " + tails + " %");
	}
}