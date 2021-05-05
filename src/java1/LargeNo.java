package java1;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeNo {

	public static void main(String[] args) {
		String num1, num2;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter frist large num");
		num1 = in.nextLine();
		System.out.println("Enter second large num");
		num2 = in.nextLine();
		BigInteger frist = new BigInteger(num1);
		BigInteger Second = new BigInteger(num2);
		BigInteger sum;
		sum = frist.add(Second);
		System.out.println("Result of addition = " + sum);

	}

}
