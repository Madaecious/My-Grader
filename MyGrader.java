/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	Name:			Mark Barros
//	Course:			CS1400 - Intro to Programming and Problem Solving
//	Description:	This program prompts the user for a series of grades from 0 to 100 .  It then finds
//					and outputs the count, average, and standard deviation of the input numbers.
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

// These are necessary imports. -----------------------------------------------------------------------------
import java.util.Scanner;
import java.lang.Math;

// Beginning of MyGrader class. -----------------------------------------------------------------------------
public class MyGrader {
	public static void main(String[] args) {
		// Declarations -------------------------------------------------------------------------------------
		final int GRADE_INPUT_MAX = 100;
		double gradeMean = 0.0,
		       standardDeviation = 0.0,
		       squareOfMeanDifferences = 0.0,
		       gradeSum = 0.0;
		double[] grades = new double[GRADE_INPUT_MAX];
		int actualNumberOfGrades = 0,
		    currentGrade = 0;
		Scanner keyboard = new Scanner(System.in);
		// Initial Output -----------------------------------------------------------------------------------
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Type in the grades using their numerical equivalents: A=4, B=3, C=2, D=1, F=0.");
		System.out.println("Then type in -1 when you're finished. You can type in a maximum of 100 grades.");
		System.out.println("------------------------------------------------------------------------------");
		// Inputs -------------------------------------------------------------------------------------------
		while(currentGrade != -1 && actualNumberOfGrades  <  GRADE_INPUT_MAX) {
			currentGrade = keyboard.nextInt();
			if(currentGrade != -1) {
				gradeSum += currentGrade;
				grades[actualNumberOfGrades++] = currentGrade;
			}
		}
		keyboard.close();
		// Calculations -------------------------------------------------------------------------------------
		gradeMean = gradeSum / actualNumberOfGrades;
		for(int i = 0; i <= actualNumberOfGrades - 1; i++) {
			squareOfMeanDifferences  += Math.pow((grades[i] - gradeMean), 2);
		}
		standardDeviation = Math.sqrt((1.0/((double)actualNumberOfGrades)) * squareOfMeanDifferences);
		// Final Output -------------------------------------------------------------------------------------
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("My Grader by Mark Barros");
		System.out.println("------------------------------------------------------------------------------");
		System.out.printf("Count: %4d\n", actualNumberOfGrades);
		System.out.printf("Average: %11.2f\n", gradeMean);
		System.out.printf("Standard Deviation: %11.2f\n", standardDeviation);
		System.out.println("------------------------------------------------------------------------------");
	}
} // End of MyGrader class. ---------------------------------------------------------------------------------
