package snackBar;

public class Main
{
	private static void workWithData()
	{
		System.out.println("");
		System.out.println("Welcome to the SnackBar");
		System.out.println("\n");




		Customer cu1 = new Customer("Jane", 45.25);
		Customer cu2 = new Customer("Bob", 33.14);

		VendingMachine v1 = new VendingMachine("Food");
		VendingMachine v2 = new VendingMachine("Drink");
		VendingMachine v3 = new VendingMachine("Office");

								//( name, quantity, cost, vendingId)

		Snack s1 = new Snack("Chips", 36, 01.75, 1);
		Snack s2 = new Snack("Chocolate Bar", 36, 01.00, 1);
		Snack s3 = new Snack("Pretzel", 30, 02.00, 1);

		Snack s4 = new Snack("Soda", 24, 02.50, 2);
		Snack s5 = new Snack("Water", 20, 02.75, 2);

		

		cu1.buySnacks(s4.getTotal(3));
		s4.buySnacks(3);

		System.out.println("Customer 1 cash on hand $" + cu1.getCashOnHand());
		System.out.println("Quantity of snack 4 is " + s4.getQuantity());
		System.out.println("");


		cu1.buySnacks(s3.getTotal(1));
		s3.buySnacks(1);

		System.out.println("Customer 1 cash on hand $" + cu1.getCashOnHand());
		System.out.println("Quantity of snack 3 is " + s3.getQuantity());
		System.out.println("");

		cu2.buySnacks(s4.getTotal(2));
		s4.buySnacks(2);

		System.out.println("Customer 2 cash on hand $" + cu2.getCashOnHand());
		System.out.println("Quantity of snack 4 is " + s4.getQuantity());
		System.out.println("");

		cu1.addCash(10.00);
		System.out.println("Customer 1 cash on hand $" + cu1.getCashOnHand());
		System.out.println("");

		cu1.buySnacks(s2.getTotal(1));
		s2.buySnacks(1);

		System.out.println("Customer 1 cash on hand $" + cu1.getCashOnHand());
		System.out.println("Quantity of snack 2 is " + s2.getQuantity());
		System.out.println("");

		s3.addQuantity(12);
		System.out.println("Quantity of snack 3 is " + s3.getQuantity());
		System.out.println("");

		cu2.buySnacks(s3.getTotal(3));
		s3.buySnacks(3);

		System.out.println("Customer 2 cash on hand $" + cu2.getCashOnHand());
		System.out.println("Quantity of snack 3 is " + s3.getQuantity());
		System.out.println("");

		System.out.println("***STRETCH GOALS***");
		System.out.println("");
		//STRETCH GOALS


		System.out.println("Snack: " + s1.getName());
		System.out.println("Vending Machine: " + v1.getName());
		System.out.println("Quantity: " + s1.getQuantity());
		System.out.println("Total Cost: $" + s1.getTotal(s1.getQuantity()));
		System.out.println("");

		System.out.println("Snack: " + s2.getName());
		System.out.println("Vending Machine: " + v1.getName());
		System.out.println("Quantity: " + s2.getQuantity());
		System.out.println("Total Cost: $" + s2.getTotal(s2.getQuantity()));
		System.out.println("");

		System.out.println("Snack: " + s3.getName());
		System.out.println("Vending Machine: " + v1.getName());
		System.out.println("Quantity: " + s3.getQuantity());
		System.out.println("Total Cost: $" + s3.getTotal(s3.getQuantity()));
		System.out.println("");

		System.out.println("Snack: " + s4.getName());
		System.out.println("Vending Machine: " + v2.getName());
		System.out.println("Quantity: " + s4.getQuantity());
		System.out.println("Total Cost: $" + s4.getTotal(s4.getQuantity()));
		System.out.println("");

		System.out.println("Snack: " + s5.getName());
		System.out.println("Vending Machine: " + v2.getName());
		System.out.println("Quantity: " + s5.getQuantity());
		System.out.println("Total Cost: $" + s5.getTotal(s5.getQuantity()));
		System.out.println("");

	}


	public static void main(String[] args)
	{
		workWithData();
	}
}