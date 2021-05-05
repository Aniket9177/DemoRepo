package java1;

import java.util.Scanner;

public class Swap2noUsing3rdVari {

	public static void main(String[] args) {
		int x, y, temp;
		System.out.println("Enter x and y");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		System.out.println("Before swapping\nx = " + x + "\ny=" + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After Swapping\nx=" + x + "\ny=" + y);
	}

}
