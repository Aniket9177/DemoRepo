package java1;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialForLargeNo {

	public static void main(String[] args) {
		int n, c;
		BigInteger inc = new BigInteger("1");
		BigInteger fact = new BigInteger("1");
		Scanner input = new Scanner(System.in);
		System.out.println("Input an integar");
		n = input.nextInt();
		for (c = 1; c <= n; c++) {
			fact = fact.multiply(inc);
			inc = inc.add(fact);
		}
		System.out.println(n + "!= " + fact);

	}

}
