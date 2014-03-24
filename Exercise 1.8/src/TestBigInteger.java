import java.math.BigInteger;

/*
 * Name: Alex Tarng
 * Course: Advanced Java
 * Date: 3/19/14
 * Assignment: Exercise 1.8
 * 
 * 		The Assignment begins:
 * 			Recall that primitive integer type byte, short, int and long represent 8-, 16-, 32-, and 64-bit signed integers, respectively.
 * 			You cannot use them for integers bigger than 64 bits. Java API provides a class called BigInteger in a package called java.math.
 * 			Study the API of the BigInteger class (Java API From "Packages", choose "java.math" " From "classes", choose "BigInteger"
 * 			" Study the constructors (choose "CONSTR") on how to construct a BigInteger instance, and the public methods available (choose "METHOD").
 * 			Look for methods for adding and multiplying two BigIntegers.
 * 		
 * 			We are then instructed to:
 * 			Write a program called TestBigInteger that:
 * 				1. adds "11111111111111111111111111111111111111111111111111111111111111" to "22222222222222222222222222222222222222222222222222" and prints the result.
 * 				2. multiplies the above two number and prints the result.
 * 				Hints:
 * 					import java.math.BigInteger
 * 					public class TestBigInteger {
 * 						public static void main(String[] args) {
 * 							BigInteger i1 = new BigInteger(...);
 * 							BigInteger i2 = new BigInteger(...);
 * 							System.out.println(i1.add(i2));
 * 							.......
 * 						}
 * 					}
 * 
 * 			So we wrote the TestBigInteger to accomplish these tasks.
 * 			
 * 		
 */
public class TestBigInteger
{
	public static void main(String[] args)
	{
		BigInteger i1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
		BigInteger i2 = new BigInteger("22222222222222222222222222222222222222222222222222");
		System.out.println(i1.add(i2));
		System.out.println(i1.multiply(i2));
	}
}
