import java.util.Scanner;

public class CalculationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PaidAdvisor a = new PaidAdvisor(null, null, 1, 0); //Set Value equal to 1 so, easter Egg can show if the value is zeor

		System.out.println("Welcome! Lets find out how much money you have earned!");

		Scanner firsta = new Scanner(System.in);
		Scanner lasta = new Scanner(System.in);

		System.out.println("Let start out by giving me your First and Last name.");

		String firstname = firsta.nextLine();
		String lastname = lasta.nextLine();

		Scanner hrs = new Scanner(System.in);
		
		System.out.println("Now let's see how many regular hours you worked.");

		double hoursWorked = hrs.nextDouble();
		
		Scanner hrsspecial = new Scanner(System.in);
		System.out.println("Have you worked any special hours. If so, how many?");
		
		double specialHoursWorked = hrsspecial.nextDouble();
		
		a.setName(firstname, lastname);
		a.setHours(hoursWorked, specialHoursWorked);
		a.setHoursspecial(specialHoursWorked);
		
		a.setNameRateHours();
		
		a.toString();	
	}
}