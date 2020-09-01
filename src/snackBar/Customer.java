package snackBar;

public class Customer
{

	// fields (know)
	private static int maxId = 0;
	private int id;
	private String name;
	private double cashOnHand;

	// constructor
	public Customer(String name, double cashOnHand)
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

	public void addCash(double addedCash)
	{
		this.cashOnHand = addedCash + this.cashOnHand;
	}

	public void buySnacks(double totalCost)
	{
		this.cashOnHand = this.cashOnHand - totalCost;
	}

	


}