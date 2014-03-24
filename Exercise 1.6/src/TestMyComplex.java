import java.util.Scanner;


public class TestMyComplex
{
	public static void main(String[] args)
	{
		System.out.println("TestMyComplex:");
		MyComplex c1 = new MyComplex(1, 2);
		System.out.println(c1);
		System.out.println(c1.isImaginary() + " " + c1.isReal() + " (should be false false)");
		c1.setValue(0, 1);
		System.out.println(c1);
		System.out.println(c1.isImaginary() + " " + c1.isReal() + " (should be true false)");
		c1.setValue(1, 0);
		System.out.println(c1);
		System.out.println(c1.isImaginary() + " " + c1.isReal() + " (should be false true)");
		System.out.println(c1.equals(new MyComplex(1, 0)) + " " + c1.equals(1, 0) + " " + c1.equals(new MyComplex(0, 1)) + " " + c1.equals(1, 0) + " (should be true true false false)");
		System.out.println(c1.magnitude() + " (should be 1)");
		c1.setValue(3, 4);
		System.out.println(c1.magnitude() + " (should be 5)");
		System.out.println(c1.argumentInRadians() + " " + c1.argumentInDegrees() + " (should be 0.9272952180016122 53)");
		System.out.println(c1.conjugate() + " (should be (3.0 + -4.0i))");
		System.out.println(c1.add(new MyComplex(3, 4)) + " " + c1.subtract(new MyComplex(1, 2)) + " " + c1.multiplyWith(new MyComplex(4, 3)) + " " + c1.divideBy(new MyComplex(2, 3)) + " (should be (6.0 + 8.0i) (2.0 + 2.0i) (0.0 + 18.0i) (1.3846153846153846 + -1.3846153846153846i))");
		System.out.println("*******************************************");
		System.out.println("*                                         *");
		System.out.println("*            MyComplexApp!!!!!            *");
		System.out.println("*                                         *");
		System.out.println("*******************************************");
//		Enter complex number 1 (real and imaginary part): 1.1 2.2
//		Enter complex number 2 (real and imaginary part): 3.3 4.4
//		  
//		Number 1 is: (1.1 + 2.2i)
//		(1.1 + 2.2i) is NOT a pure real number
//		(1.1 + 2.2i) is NOT a pure imaginary number
//		  
//		Number 2 is: (3.3 + 4.4i)
//		(3.3 + 4.4i) is NOT a pure real number
//		(3.3 + 4.4i) is NOT a pure imaginary number
//		   
//		(1.1 + 2.2i) is NOT equal to (3.3 + 4.4i)
//		(1.1 + 2.2i) + (3.3 + 4.4i) = (4.4 + 6.6000000000000005i)
//		(1.1 + 2.2i) - (3.3 + 4.4i) = (-2.1999999999999997 + -2.2i)
		System.out.println("Enter complex number 1 (real and imaginary part):");
		MyComplex num1 = input();
		System.out.println("Enter complex number 2 (real and imaginary part):");
		MyComplex num2 = input();
		System.out.println();
		System.out.println("Number 1 is: " + num1);
		if (num1.isReal())
		{
			System.out.println(num1 + " is a pure real number");
		}
		else
		{
			System.out.println(num1 + " is NOT a pure real number");
		}
		if (num1.isImaginary())
		{
			System.out.println(num1 + " is a pure imaginary number");
		}
		else
		{
			System.out.println(num1 + " is NOT a pure imaginary number");
		}
		System.out.println();
		System.out.println("Number 2 is: " + num2);
		if (num2.isReal())
		{
			System.out.println(num2 + " is a pure real number");
		}
		else
		{
			System.out.println(num2 + " is NOT a pure real number");
		}
		if (num2.isImaginary())
		{
			System.out.println(num2 + " is a pure imaginary number");
		}
		else
		{
			System.out.println(num2 + " is NOT a pure imaginary number");
		}
		if (num1.equals(num2))
		{
			System.out.println(num1 + " is equal to " + num2);
		}
		else
		{
			System.out.println(num1 + " is NOT equal to " + num2);
		}
		System.out.println();
		System.out.println(num1 + " + " + num2 + " = " + num1.add(num2));
		System.out.println(num1 + " - " + num2 + " = " + num1.subtract(num2));
	}
	
	public static MyComplex input()
	{
		Scanner sc = new Scanner(System.in);
		return new MyComplex(sc.nextDouble(), sc.nextDouble());
	}
}
