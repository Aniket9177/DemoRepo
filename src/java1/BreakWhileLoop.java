package java1;

import java.util.Scanner;

public class BreakWhileLoop {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("Input an integer");
			n = in.nextInt();
			if (n == 0) {
				break;
			}
			System.out.println("You Enterd " + n);

		}

	}

}
