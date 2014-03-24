
public class TestAuthor {
	
	public static void main(String[] args)
	{
		System.out.println("TestAuthor:");
		Author scary = new Author("Steve King", "sking@pausd.org", 'm');
		System.out.println(scary);
		scary.setEmail("ERRORGHGHGF");
		System.out.println(scary);
		System.out.println("TestBook:");
		TestBook.testBook();
	}
}
