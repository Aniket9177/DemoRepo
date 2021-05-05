package java1;

import java.util.Scanner;

public class FahernhiteToCelsius {

	private static Scanner in;

	public static void main(String[] args) {
		float temp;
		in = new Scanner(System.in);
		System.out.println("Enter Temp in Fahrenhite");
		temp = in.nextInt();
		temp = ((temp - 32) * 5) / 9;
		System.out.println("Temp in Celsisus=" + temp);
	}

}
