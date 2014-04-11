/*
 * Name: Alex Tarng
 * Course: Advanced Java
 * Date: 4/11/14
 * Assignment: Exercise 1.11
 * 
 * 		The Assignment begins by instructing us to modify the Book class to support one or more authors by changing the instance variable authors to an Author array. Reuse the Author class written earlier.
 * 			Notes:
 * 				The constructors take an array of Author (i.e., Author[]), instead of an Author instance.
 * 				The toString() method shall return "book-name by n authors", where n is the number of authors.
 * 				A new method printAuthors() to print the names of all the authors.
 * 			You are required to:
 * 				Write the code for the Book class. You shall re-use the Author class written earlier.
 *				 Write a test program (called TestBook) to test the Book class.
 * 				Hints:
 * 					// Declare and allocate an array of Authors
 * 					Author[] authors = new Author[2];
 * 					authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
 * 					authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
 *  
 * 					// Declare and allocate a Book instance
 *   				Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
 *   				System.out.println(javaDummy);  // toString()
 *   				System.out.print("The authors are: ");
 *   				javaDummy.printAuthors();
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
