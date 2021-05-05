package java1;

import java.util.Scanner;

class IfElse2 {

	private static Scanner input;

	public static void main(String[] args) {
		int markObtained ,passingMarks;
		 passingMarks = 40;
		 input = new Scanner(System.in);
		 System.out.println("Input marks scored by you ");
		 
		markObtained = input.nextInt();
		if (markObtained >= passingMarks) {
			System.out.println("You Passed the exam .");
		}
			else {
				System.out.println("Unfortunately you failed to pass exam ");
			}
		}
		 
		

	}


