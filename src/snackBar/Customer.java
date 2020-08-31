package snackBar;

public class Customer
{

	// fields (know)
	private static int maxId = 0;
	private int id;
	private String name;
	private double cashOnHand;

	// constructor
	public Customer(String name, double cashOnHand, int id)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.cashOnHand = cashOnHand;
	}

	//methods (behaviors)

	// getter
	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public double getCashOnHand()
	{
		return cashOnHand;
	}

	// setter
	public void setName(String name)
	{
		this.name = name;
	}

	public double addCash(double addedCash)
	{
		return addedCash + this.cashOnHand;
	}

	public double buySnacks(double totalCost)
	{
		return this.cashOnHand - totalCost;
	}

	
}