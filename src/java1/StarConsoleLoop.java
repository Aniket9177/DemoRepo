package java1;

public class StarConsoleLoop {

	public static void main(String[] args) {
		int row, numberOfStar;
		for (row = 1; row <= 10; row++) {
			for (numberOfStar = 1; numberOfStar <= row; numberOfStar++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}

}
