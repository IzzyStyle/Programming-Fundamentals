
import java.text.DecimalFormat;
import java.util.Scanner;

public class OrderTaking {

	public static void main(String[] args) {

		System.out.println("Welcome to The Lil' Burger Grill! \n" + "We are currently located in: "
				+ "\n123 Dollah Ln.,\n" + "Village, IL 60194.\n" + "Is this for \"pick up\" or \"delivery?\"");
		// Welcome message from the restaurant

		Scanner details = new Scanner(System.in);
		// Keep Getting a leak warning... Idk what to do.
		String answer = details.nextLine();
		// First scan that will determine the results

		if (answer.equals("delivery") || answer.equals("Delivery") || answer.equals("DELIVERY")) {

			int zipcode; // Declaring that the zipcode value will be entered as numbers.
			String name, address, city; // keeping other details as strings
			String order; // this is crucial for the rest of the program

			System.out.println("Great! We are just going to need couple details.");

			Scanner named = new Scanner(System.in);

			System.out.println("What is your Full name?");

			name = named.nextLine(); // The collection of name

			Scanner addressd = new Scanner(System.in);

			System.out.println("What is your Address?");

			address = addressd.nextLine(); // The collection of address

			Scanner cityd = new Scanner(System.in);

			System.out.println("What is your City?");

			city = cityd.nextLine(); // The collection of city, assuming they are in Illinois

			Scanner zipcoded = new Scanner(System.in);

			System.out.println("And Finally your Zipcode?");

			zipcode = zipcoded.nextInt(); // The collection of zipcode as an integer

			System.out.println("You have entered the following information:" + "\n" + name + "\n" + address // The
																											// formating
																											// is just
																											// for
																											// visual
																											// purposes.
					+ "\n" + city + " " + zipcode);

			if (zipcode == 60194) {// The if statement should kick in as soon as the answer is entered.

				double subtotal = 0; // Setting values as Zero since they are going to be added upon.
				double total = 0;
				double tax = 0.08;
				double taxes;
				int count = 0;
				int deliverya = 0;

				System.out.println("By the way you get free delivery!"); // little easter eggs for each zipcode choice

				System.out.println("Now here is our menu" +

						"\n burger" + // you can enter the your request as a string
						"\n drink" + "\n fries" + "\n ice cream");

				Scanner ordera = new Scanner(System.in); // I don't know what it means by its "never close"

				System.out.println("What would you like to order? (Type 0 to finish order)");

				order = ordera.nextLine();

				while (order.equals("burger") || order.equals("drink") || order.equals("fries")
						|| order.equals("icecream"))
				// these statements above makes it possible for the customer to use words to say
				// what they want
				{

					double burger = 3.50; // burger //Declaring other value for further calculations
					double drink = 1.75; // drink
					double fries = 2.60; // fries
					double icecream = 1.00; // icecream
					count++;
					subtotal += burger;
					subtotal += drink;
					subtotal += fries;
					subtotal += icecream;

					System.out.println("What else would you like to order? (Type 0 to finish order)");
					order = ordera.nextLine();

					System.out.println();
					if (count == 0)
						System.out.println("No values were entered.");
					else // took inspiration from page 216 of the book.
					{
						taxes = (subtotal * (tax));
						total = taxes + subtotal + deliverya;
						DecimalFormat fmt = new DecimalFormat("0.##"); // formating for real life scenario.

						System.out.println("Your total is " + fmt.format(total));

					}

				}

			}

			if (zipcode > 60194 && zipcode <= 60199) {

				double subtotal = 0;
				double total = 0;
				double tax = 0.08;
				double taxes;
				int count = 0;
				int deliveryb = 5;

				System.out.println("Delievery is available with a 5 dollar fee.");
				System.out.println("Now here is our menu" +

						"\n burger" + "\n drink" + "\n fries" + "\n ice cream");

				Scanner orderb = new Scanner(System.in);

				System.out.println("What would you like to order? (Type 0 to finish order)");

				order = orderb.nextLine();

				while (order.equals("burger") || order.equals("drink") || order.equals("fries")
						|| order.equals("icecream")) {

					double burger = 3.50; // burger //Declaring other value for further calculations
					double drink = 1.75; // drink
					double fries = 2.60; // fries
					double icecream = 1.00; // icecream
					count++;
					subtotal += burger;
					subtotal += drink;
					subtotal += fries;
					subtotal += icecream;

					System.out.println("What else would you like to order? (Type 0 to finish order)");
					order = orderb.nextLine(); // nameing the order in differently to know where I am in the code
				}
				System.out.println();
				if (count == 0)
					System.out.println("No values were entered.");
				else {
					taxes = (subtotal * (tax));
					total = taxes + subtotal + deliveryb;
					DecimalFormat fmt = new DecimalFormat("0.##");

					System.out.println("Your total is " + fmt.format(total));
				}

			}

			if (zipcode > 60199 && zipcode <= 60204) { // This is a the max range for the ten dollar fees

				double subtotal = 0;
				double total = 0;
				double tax = 0.08;
				double taxes;
				int count = 0;
				int deliveryc = 10;

				System.out.println("Delievery is available with a 5 dollar fee.");
				System.out.println("Now here is our menu" +

						"\n burger" + "\n drink" + "\n fries" + "\n ice cream");

				Scanner orderc = new Scanner(System.in);

				System.out.println("What would you like to order? (Type 0 to finish order)");

				order = orderc.nextLine();

				while (order.equals("burger") || order.equals("drink") || order.equals("fries")
						|| order.equals("icecream")) {

					double burger = 3.50; // burger //Declaring other value for further calculations
					double drink = 1.75; // drink
					double fries = 2.60; // fries
					double icecream = 1.00; // icecream
					count++;
					subtotal += burger;
					subtotal += drink;
					subtotal += fries;
					subtotal += icecream;

					System.out.println("What else would you like to order? (Type 0 to finish order)");
					order = orderc.nextLine();
				}
				System.out.println();
				if (count == 0)
					System.out.println("No values were entered.");
				else {
					taxes = (subtotal * (tax));
					total = taxes + subtotal + deliveryc;
					DecimalFormat fmt = new DecimalFormat("0.##");

					System.out.println("Your total is " + fmt.format(total));
				}
			}

			if (zipcode > 60204) { // no restaurant food for them...
				double subtotal = 0;
				double total = 0;
				double tax = 0.08;
				double taxes;
				int count = 0;
				int deliveryc = 0;

				System.out.println("Sorry we can't deliver to you.");

				Scanner orderd = new Scanner(System.in);
				System.out.println("Would you like to place the order for pick up? (Type \"Yes\" or \"No\" ");

				order = orderd.nextLine();

				while (answer.equals("Yes") || answer.equals("yes") || answer.equals("YES") || answer.equals("y")
						|| answer.equals("Y")) {

					System.out.println("Great! We'll use your name to identify your order");

					System.out.println("Also, here is our address " + name + ": " + "123 Dollah Ln., \n"
							+ "Village, IL 60194.\n" + "and here is our menu!" +

							"\n burger" + "\n drink" + "\n fries" + "\n ice cream\n");

					Scanner ordere = new Scanner(System.in);

					System.out.println("What would you like to order? (Type 0 to finish order)");

					order = ordere.nextLine();

					if (order.equals("burger") || order.equals("drink") || order.equals("fries")
							|| order.equals("icecream")) {

						double burger = 3.50; // burger //Declaring other value for further calculations
						double drink = 1.75; // drink
						double fries = 2.60; // fries
						double icecream = 1.00; // icecream
						count++;
						subtotal += burger;
						subtotal += drink;
						subtotal += fries;
						subtotal += icecream;

						System.out.println("What else would you like to order? (Type 0 to finish order)");
						order = ordere.nextLine();
					}
					System.out.println();
					if (count == 0)
						System.out.println("No values were entered.");
					else {
						taxes = (subtotal * (tax));
						total = taxes + subtotal;
						DecimalFormat fmt = new DecimalFormat("0.##");

						System.out.println("Your total is " + fmt.format(total) + " "
								+ "It will be ready in about 10 minutes, " + name);

					}
				}
				if (order.equals("n") || order.equals("no") || order.equals("No") || order.equals("NO")) { // another if
																											// scenario
																											// for
																											// entries
																											// that have
																											// "no" as
																											// an answer

					System.out.println("Sorry to hear that! Here is our address " + name + ": " + "123 Dollah Ln., \n"
							+ "Village, IL 60194.\n" + "\nPlease visit us anytime");
				}

			}

		}

		if (answer.equals("pick up") || answer.equals("Pick Up") || answer.equals("PickUp") || answer.equals("PICK UP")
				|| answer.equals("pickup")) {
			// line 318 is accounting for all possible pick up answers just to be ready.
			double subtotal = 0;
			double total = 0;
			double tax = 0.08;
			double taxes;
			int count = 0;
			String order;
			String name;

			System.out.println("Great! We are just going to need a name for the order");

			Scanner named = new Scanner(System.in);

			System.out.println("What is your name?");

			name = named.nextLine(); // The collection of name

			System.out.println("Awesome! Here is our address " + name + ": " + "123 Dollah Ln., \n"
					+ "Village, IL 60194.\n" + "and here is our menu!" +

					"\n burger" + "\n drink" + "\n fries" + "\n ice cream\n");

			Scanner ordere = new Scanner(System.in);

			System.out.println("What would you like to order? (Type 0 to finish order)");

			order = ordere.nextLine();

			while (order.equals("burger") || order.equals("drink") || order.equals("fries")
					|| order.equals("icecream")) {

				double burger = 3.50; // burger //Declaring other value for further calculations
				double drink = 1.75; // drink
				double fries = 2.60; // fries
				double icecream = 1.00; // icecream
				count++;
				subtotal += burger;
				subtotal += drink;
				subtotal += fries;
				subtotal += icecream;

				System.out.println("What else would you like to order? (Type 0 to finish order)");
				order = ordere.nextLine();
			}
			System.out.println();
			if (count == 0)
				System.out.println("No values were entered.");
			else {
				taxes = (subtotal * (tax));
				total = taxes + subtotal;
				DecimalFormat fmt = new DecimalFormat("0.##");

				System.out.println(
						"Your total is " + fmt.format(total) + " " + "It will be ready in about 10 minutes, " + name);

			}
		}

	}
}
