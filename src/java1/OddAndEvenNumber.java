package java1;

import java.util.Scanner;

public class OddAndEvenNumber {

	public static void main(String[] args) {
		int x;
		System.out.println("Enter an integar to check if it is odd or even ");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		if (x % 2 == 0)
			System.out.println("Your Ented an even number ");
		else
			System.out.println("You enterd an odd number ");

	}

}
