package java1;

import java.util.Scanner;

public class AddTwoNo {

	public static void main(String[] args) {
		int x, y, z;
		System.out.println("Enter Two Intergar to calculate their sum ");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = x + y;
		System.out.println("Sum of enterd intergar = " + z);

	}

}
