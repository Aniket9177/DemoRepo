package java1;

import java.util.Scanner;

public class NesdtedIfElse {

	public static void main(String[] args) {
		int marksObtained, passingMarks;
		char grade;
		passingMarks = 40;
		Scanner input = new Scanner(System.in);
		System.out.println("Input Mark scored by you ");
		marksObtained = input.nextInt();
		if (marksObtained >= passingMarks) {
			if (marksObtained > 90)
				grade = 'A';
			else if (marksObtained > 75)
				grade = 'B';
			else if (marksObtained > 60)
				grade = 'c';
			else
				grade = 'D';
			System.out.println("You paased the exam and your grade is " + grade);
		} else {
			grade = 'F';
			System.out.println("You Failed and your grade is " + grade);

		}

	}

}
