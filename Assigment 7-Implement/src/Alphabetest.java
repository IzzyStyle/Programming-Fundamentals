import java.util.Scanner;

public class Alphabetest {

	public static void main(String[] args) {

		Queue list = new Queue(10);
		Scanner a = new Scanner(System.in);
		System.out.println("Can you enter a letter?");

		for (int i = 0; i < 10; i++) {

			Queue.enqueue(a.nextLine());// stores the values of the scanner in each element, until 10.
		}

		Queue.queueDisplay(); // This should print all items of the array

		Scanner b = new Scanner(System.in);

		System.out.println("Would you like to delete the list? (Type 'del')\n"
				+ "Or would you like to add more letters to the list? (Type 'add')");

		String desc = b.nextLine();// decision of the user

		if (desc.equals("del"))

			Queue.dequeue();
		Queue.dequeue();
		Queue.dequeue();
		Queue.dequeue();
		Queue.dequeue();
		Queue.dequeue();
		Queue.dequeue();
		Queue.dequeue();
		Queue.dequeue();
		Queue.dequeue();

		if (desc.equals("add")) {
			Scanner c = new Scanner(System.in);
			System.out.println("Lext add another letter");
			Queue.enqueue(c.nextLine());
		} else
			Queue.queueDisplay();
	}
}