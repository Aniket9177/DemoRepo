package java1;

import java.util.Scanner;

public class CompareTwoString {

	public static void main(String[] args) {
		String s1, s2;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the frist String ");
		s1 = in.nextLine();
		System.out.println("Enter the Second String ");
		s2 = in.nextLine();
		if (s1.compareTo(s2) > 0)
			System.out.println("Frist string is grater then second ");
		else if (s1.compareTo(s2) < 0)
			System.out.println("Frist String is smaller then second ");
		else
			System.out.println("Both string are same ");
	}

}
