
public class Book
{
	private String name;
	private Author[] authors = new Author[5];
	private int numAuthors = 0;
	private double price;
	private int qtyInStock = 0;
	
	public Book(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	
	public Book(String name, double price, int qtyInStock)
	{
		this.name = name;
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

	public Author[] getAuthors()
	{
		return authors;
	}

	public int getNumAuthors()
	{
		return numAuthors;
	}

	public String toString()
	{
		return name + " by " + this.numAuthors + " authors";
	}
	
	public void printAuthors()
	{
		for (Author a : this.authors)
		{
			if (a != null)
			{
				System.out.println(a);
			}
		}
	}
	
	public void addAuthor(Author author)
	{
	      authors[numAuthors] = author;
	      numAuthors++;
	}
	
	public boolean removeAuthorByName(String authorName)
	{
		for (Author a : this.authors)
		{
			if (a.getName().equals(authorName))
			{
				a = null;
				return true;
			}
		}
		return false;
	}
}
