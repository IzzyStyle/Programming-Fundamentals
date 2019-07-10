
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class GradingApp {

	static int maxPoint = 700; // Max points for the student average
	static int gradeA, gradeB, gradeC, gradeD, gradeF;
	static int classSize;
	static double[] classScores;
	static double[] classDivi;
	static double totalScore;
	static double xmean2;
	static double mean;

	static double sum;
	static double sumb;
	static double xmean;
	static double standarDiv;

	public static void main(String[] args) {

		System.out.println("Welcome Professor! It seems you want to start grading the project");

		Scanner numbStudents = new Scanner(System.in);

		System.out.println("Let's start out by first seeing how many students you have in the class \n"
				+ "Please only enter the integers");

		classSize = numbStudents.nextInt(); // will determine the size of the array

		double[] classScores = new double[classSize];
		double[] classDivi = new double[classSize];
		double[] meanarray = new double[classSize];
		double[] xmean2array = new double[classSize];

		if (classSize > 0) { // given that the class size is greater than zero, do this operation

			System.out.println("You have " + classSize + " Students. \n"
					+ "Keep in mind you are to record the grades for 4 assigment and 4 exams per student. \n"
					+ "Furthemore, the assigments are worth 50 points and exams 75"); // message before the operation
																						// start

			for (int i = 0; i < classSize; i++) // Setting the int equal to one since we want the for operation start at
												// the lowest possible class size

			{ // There are only 8th entries to consider.
				// I only need to store the totals!!

				Scanner score = new Scanner(System.in);
				System.out.println("What is the score for the First Assigment for student " + (i + 1));
				int score1 = score.nextInt();

				score = new Scanner(System.in);
				System.out.println("What is the score for the Second Assigment for student" + (i + 1));
				int score2 = score.nextInt();

				score = new Scanner(System.in);
				System.out.println("What is the score for the Third Assigment for student " + (i + 1));
				int score3 = score.nextInt();

				score = new Scanner(System.in);
				System.out.println("What is the score for the Fourth Assigment for student " + (i + 1));
				int score4 = score.nextInt();

				score = new Scanner(System.in);
				System.out.println("What is the score for the First Exam for student " + (i + 1));
				int score5 = score.nextInt();

				score = new Scanner(System.in);
				System.out.println("What is the score for the Second Exam for student " + (i + 1));
				int score6 = score.nextInt();

				score = new Scanner(System.in);
				System.out.println("What is the score for the Third Exam for student " + (i + 1));
				int score7 = score.nextInt();

				score = new Scanner(System.in);
				System.out.println("What is the score for the Fourth Exam for student " + (i + 1));
				int score8 = score.nextInt();

				double totalScore = score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8; // Calculating
																											// the total
																											// score

				xmean = (totalScore - mean);
				double xmean2insta = Math.pow(xmean, 2);
				xmean2 = xmean2insta;
				int sum = 0;
				int sumb = 0;

				xmean2array[i] = xmean2insta;
				meanarray[i] = totalScore;
				classScores[i] = totalScore; // storing those values in array
				classDivi[i] = xmean2; // storing values for standar diviation formula

				for (int counter = 0; counter < meanarray.length; counter++) {
					sum += meanarray[counter];
				}

				for (int counter2 = 0; counter2 < xmean2array.length; counter2++) {
					sumb += xmean2array[counter2];

				}
				mean = sum / classSize;
				standarDiv = Math.sqrt(sumb / classSize);

				// Utilize formula from:
				// https://www.mathsisfun.com/data/standard-deviation-formulas.html

			}

			for (int j = 0; j < classScores.length; j++) {

				if (classScores[j] >= mean + (2 * standarDiv)) // problem comes when setting the grades
					// it is using the last mean memory piece.
					System.out.println("Student " + (j + 1) + " has an A");
				// student must have the perfect score to be consider for an A

				else if (classScores[j] >= mean + (standarDiv))
					System.out.println("Student " + (j + 1) + " has an B");

				else if (classScores[j] >= mean)
					System.out.println("Student " + (j + 1) + " has a C");

				else if (classScores[j] >= mean - (standarDiv))
					System.out.println("Student " + (j + 1) + " has an D");

				else if (classScores[j] >= mean - (2 * standarDiv))
					System.out.println("Student " + (j + 1) + " has an F");

				else if (classScores[j] <= maxPoint) {
					double maxValue = classScores[0];

					for (int k = 1; k < classScores.length; k++) {

						if (classScores[k] > maxValue) {
							maxValue = classScores[k];
						}
						System.out.println("Student " + (j + 1) + " " + maxValue + " has an A");

					}
				}

				else if (classScores[j] < mean) {
					double minValue = classScores[0];

					for (int k = 1; k < classScores.length; k++) {

						if (classScores[k] < minValue) {
							minValue = classScores[k];
						}
						System.out.println("Student " + (j + 1) + " " + minValue + " has an F");

					}
				}

			}

		}

		if (classSize < 0) {

			System.out.println("I guess you don't need the program.  Make sure you use it when you need it.");
			// easter egg message.
		}

	}

}
