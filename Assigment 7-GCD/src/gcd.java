
import java.util.Scanner;

public class gcd {

	public static void main(String[] args) throws oneException {
		System.out
				.println("It looks like you want to find the Greatest Common Divisor. \n" + "Well, let's get started.");

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the first number:");

		int a = input.nextInt();

		System.out.println("Please enter the second number:");
		int b = input.nextInt();

		oneException problem = new oneException("The greatest common divisor is just one.");

		if (getgcd(a, b) == 1)
			throw problem;

		else
			System.out.println("The greatest common Divisor is " + getgcd(a, b) + ".");
	}

	public static int getgcd(int a, int b)

	{
		int gcd = 0;
		if (a > b) {
			for (int i = b; i >= 1; i--) {
				if (a % i == 0 && b % i == 0) {
					return i;
				}
			}
		} else {
			for (int j = a; j >= 1; j--) {
				if (a % j == 0 && b % j == 0) {
					return j;
				}
			}
		}
		return gcd;

	}
}