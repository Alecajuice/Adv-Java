
public class TestBook {
	
	public static void testBook()
	{
		Author scary = new Author("Steve King", "sking@pausd.org", 'm');
		Book aBook = new Book("Java for dummy", scary, 19.95, 1000);
		System.out.println(aBook);
		aBook.setPrice(199.95);
		aBook.setQtyInStock(10);
		System.out.println(aBook.getPrice() + " " + aBook.getQtyInStock());
		// Use an anonymous instance of Author
		Book anotherBook = new Book("more Java for dummy", new Author("King Steve", "ksteve@pausd.org", 'm'), 29.95, 888);
		System.out.println(anotherBook);
		anotherBook.setPrice(2);
		anotherBook.setQtyInStock(12345);
		System.out.println(anotherBook.getPrice() + " " + anotherBook.getQtyInStock());
		System.out.println("Try 1:");
		System.out.println(aBook.getAuthor().getName() + " " + aBook.getAuthor().getEmail());
		System.out.println("Try 2:");
		System.out.println(aBook.getAuthorName() + " " + aBook.getAuthorEmail());
	}
}
