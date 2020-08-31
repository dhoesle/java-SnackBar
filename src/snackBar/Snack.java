package snackBar;

public class snackBar
{
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingId;

	//constructor
	public Snack(String name, int quantity, double cost, int vendingId)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingId = vendingId;
	}
	//methods (behaviors)
	public int getId() //methods must have parenthesis () 
	{ 
		return id;
	}

	public String getName() //methods must have parenthesis () 
	{ 
		return name;
	}

	public double getCost()
	{
		return cost;
	}

	public int getVendingId()
	{
		return vendingId;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setName()
	{
		this.name = name; 
	}

	public void setCost()
	{
		this.cost = cost;
	}
	
	public void setVendingId()
	{
		this.vendingId = vendingId;
	}

	public int addQuantity(int additionalQuan)
	{
		return this.quantity + additionalQuan;
	}

	public double buySnacks()
	{
		return this.quantity * this.cost;
	}

	public double getTotal(int givenQuan)
	{
		return this.cost * givenQuan;
	}

}