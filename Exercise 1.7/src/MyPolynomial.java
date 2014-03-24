/*
 * Name: Alex Tarng
 * Course: Advanced Java
 * Date: 3/17/14
 * Assignment: Exercise 1.7
 * 
 * 		The Assignment begins by instructing us to create the MyPolynomial class that contains:
 * 			An instance variable named coeffs, which stores the coefficients of the n-degree polynomial in a double array of size n+1, where c0 is kept at index 0.
 * 			A constructor MyPolynomial(coeffs:double...) that takes a variable number of doubles to initialize the coeffs array, where the first argument corresponds to c0. The three dots is known as varargs (variable number of arguments), which is a new feature introduced in JDK 1.5. It accepts an array or a sequence of comma-separated arguments. The compiler automatically packs the comma-separated arguments in an array. The three dots can only be used for the last argument of the method.
 * 			Hints:
 * 				public class MyPolynomial {
 * 		  			private double[] coeffs;
 * 					public MyPolynomial(double... coeffs) {  // varargs
 * 						this.coeffs = coeffs;                 // varargs is treated as array
 * 					}
 * 					......
 * 				}
 *   
 *   			// Test program
 *   			// Can invoke with a variable number of arguments
 *   			MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
 *   			MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
 *   			// Can also invoke with an array
 *   			Double coeffs = {1.2, 3.4, 5.6, 7.8}
 *   			MyPolynomial p2 = new MyPolynomial(coeffs);
 *   		Another constructor that takes coefficients from a file (of the given filename), having this format:
 *   			Degree-n(int)
 *   			c0(double)
 *   			c1(double)
 *   			......
 *   			......
 *   			cn-1(double)
 *   			cn(double)
 *   			(end-of-file)
 *   		Hints:
 *   			public MyPolynomial(String filename) {
 *   				Scanner in = null;
 *   				try {
 *   					in = new Scanner(new File(filename));  // open file
 *   				} catch (FileNotFoundException e) {
 *   					e.printStackTrace();
 *   				}
 *   				int degree = in.nextInt();      // read the degree
 *   				coeffs = new double[degree+1];  // allocate the array
 *   				for (int i=0; i<coeffs.length; ++i) {
 *   					coeffs[i] = in.nextDouble();
 *   				}
 *   			}
 *   		A method getDegree() that returns the degree of this polynomial.
 *   		A method toString() that returns "cnx^n+cn-1x^(n-1)+...+c1x+c0".
 *   		A method evaluate(double x) that evaluate the polynomial for the given x, by substituting the given x into the polynomial expression.
 *   		Methods add() and multiply() that adds and multiplies this polynomial with the given MyPolynomial instance another, and returns a new MyPolynomial instance that contains the result.
 *  
 * 		We are then instructed to:
 * 			Write the MyPolynomial class. Also write a test program (called TestMyPolynomial) to test all the methods defined in the class.
 * 
 * 			So we wrote the MyPolynomial class the way we were instructed and wrote TestMyPolynomial to test all the methods.
 * 
 * 		The assignment also presented us with a Question:
 * 			Do you need to keep the degree of the polynomial as an instance variable in the MyPolynomial class in Java? How about C/C++? Why?
 * 
 * 			My answer is: No, because you can use the length of the coeffs array to find out the degree of the polynomial.
 * 			
 * 		
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MyPolynomial
{
	//Private instance variable
	private double[] coeffs;
	
	//First constructor takes any number of arguments to input into the instance variable
	public MyPolynomial(double... coeffs)
	{
		this.coeffs = coeffs;
	}
	
	//First constructor reads file
	public MyPolynomial(String filename)
	{
		Scanner in = null;
		try
		{
			in = new Scanner(new File(filename));  // open file
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		int degree = in.nextInt();      // read the degree
		coeffs = new double[degree+1];  // allocate the array
		for (int i=0; i<coeffs.length; ++i)
		{
			coeffs[i] = in.nextDouble();
		}
	}
	
	//calculate degree of polynomial based on length of coefficients
	public int getDegree()
	{
		return this.coeffs.length - 1;
	}
	
	//toString in format cnx^n+cn-1x^(n-1)+...+c1x+c0
	public String toString()
	{
		//cnx^n+cn-1x^(n-1)+...+c1x+c0
		String str = "";
		for (int i = this.coeffs.length - 1; i > 1; i--)
		{
			str += coeffs[i] + "x^" + i + "+";
		}
		str += coeffs[1] + "x" + "+" + coeffs[0];
		return str;
	}
	
	//evaluate polynomial based on a given x
	public double evaluate(double x)
	{
		double eval = 0;
		for (int i = 0; i < this.coeffs.length; i++)
		{
			eval += coeffs[i] * Math.pow(x, i);
		}
		return eval;
	}
	
	//Add this polynomial to another
	public MyPolynomial add(MyPolynomial another)
	{
		MyPolynomial poly;
		double[] coeffs = new double[Math.max(this.coeffs.length, another.coeffs.length)];
		for (int i = 0; i < Math.max(this.coeffs.length, another.coeffs.length); i++)
		{
			try
			{
				coeffs[i] += this.coeffs[i];
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				
			}
			try
			{
				coeffs[i] += another.coeffs[i];
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				
			}
		}
		poly = new MyPolynomial(coeffs);
		return poly;
	}
	
	//multiply this polynomial with another
	public MyPolynomial multiply(MyPolynomial another)
	{
		MyPolynomial poly;
		double[] coeffs = new double[(this.coeffs.length - 1) + (another.coeffs.length - 1) + 1];
		for (int i = 0; i < this.coeffs.length; i++)
		{
			for (int j = 0; j < another.coeffs.length; j++)
			{
				coeffs[i + j] += this.coeffs[i] * another.coeffs[j];
			}
		}
		poly = new MyPolynomial(coeffs);
		return poly;
	}
}
