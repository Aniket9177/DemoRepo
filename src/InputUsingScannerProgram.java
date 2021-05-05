import java.util.Scanner;

public class InputUsingScannerProgram {

	public static void main(String[] args) {
		int a;
		float b;
		String s;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String");
		s = in.nextLine();
		System.out.println("You Enterd String " + s);
		System.out.println("Enter Integar");
		a = in.nextInt();
		System.out.println("You Enter Integar" + a);
		System.out.println("Enter a Float ");
		b = in.nextFloat();
		System.out.println("You Entered Float"+b);

	}

}
