
public class Book
{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock = 0;
	
	public Book(String name, Author author, double price)
	{
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public Book(String name, Author author, double price, int qtyInStock)
	{
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public int getQtyInStock()
	{
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock)
	{
		this.qtyInStock = qtyInStock;
	}

	public String getName()
	{
		return name;
	}

	public Author getAuthor()
	{
		return author;
	}
	public String getAuthorEmail()
	{
		return author.getEmail();
	}

	public String getAuthorName()
	{
		return author.getName();
	}

	public char getAuthorGender()
	{
		return author.getGender();
	}

	public String toString()
	{
		return name + " by " + author;
	}
}
