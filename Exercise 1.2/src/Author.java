/*
 * Name: Alex Tarng
 * Course: Advanced Java
 * Date: 3/5/14
 * Assignment: Exercise 1.2
 * 
 * 		The Assignment begins by instructing us to create the Author class below with three instance variables (name:String, email:String, gender:char),
 * 		one constructor to initialize all of them, getName(), getEmail(), setEmail(), and getGender() getters and setters, and a toString() method
 * 		that returns "author-name (gender) at email".
 * 
 * 		Then the text tells us to create a TestAuthor class to test the constructor and public methods.
 * 
 * 		The assignment then instructs us to create the Book class with four instance variables (name:String, author:Author, price:double, and qtyInStock:int),
 * 		two constructors (one with and one without a default qtyInStock), getName(), getAuthor(), getPrice(), setPrice(), getQtyInStock(), and setQtyInStock()
 * 		getters and setters, and a toString() that returns "'book-name' by author-name (gender) at email".
 * 
 * 		The assignment asks us to create a TestBook class to test the constructor and public methods in the class Book.
 * 
 * 		The assignment then presents us with two Try's:
 * 
 * 		Try 1: Printing the name and email of the author from a Book instance. (Hint: aBook.getAuthor().getName(), aBook.getAuthor().getEmail()).
 * 			
 * 			So we implemented the print statement into the TestBook class.
 * 
 * 		Try 2: Introduce new methods called getAuthorName(), getAuthorEmail(), getAuthorGender() in the Book class to return the name, email and gender of the author of the book. For example,
 * 			public String getAuthorName() { ...... }
 * 			
 * 			So we implemented the new methods and tested them out in TestBook.
 * 
 * 
 */
public class Author
{
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender)
	{
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getName()
	{
		return name;
	}

	public char getGender()
	{
		return gender;
	}
	
	public String toString()
	{
		return name + " (" + gender + ") at " + email;
	}
}
