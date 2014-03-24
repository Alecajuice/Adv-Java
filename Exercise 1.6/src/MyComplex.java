/*
 * Name: Alex Tarng
 * Course: Advanced Java
 * Date: 3/12/14
 * Assignment: Exercise 1.6
 * 
 * 		The Assignment begins by instructing us to create the MyComplex class that contains:
 * 			Two instance variable named real(double) and imag(double) which stores the real and imaginary parts of the complex number respectively.
 * 			A constructor that creates a MyComplex instance with the given real and imaginary values.
 * 			Getters and setters for instance variables real and imag.
 * 			A method setValue() to set the value of the complex number.
 * 			A toString() that returns "(x + yi)" where x and y are the real and imaginary parts respectively.
 * 			Methods isReal() and isImaginary() that returns true if this complex number is real or imaginary, respectively. Hint:
 * 				return (imag == 0);   // isReal()
 * 			A method equals(double real, double imag) that returns true if this complex number is equal to the given complex number of (real, imag).
 * 			An overloaded equals(MyComplex another) that returns true if this complex number is equal to the given MyComplex instance another.
 * 			A method magnitude()that returns the magnitude of this complex number.
 * 				magnitude(x+yi) = Math.sqrt(x2 + y2)
 * 			Methods argumentInRadians() and argumentInDegrees() that returns the argument of this complex number in radians (in double) and degrees (in int) respectively.
 * 				arg(x+yi) = Math.atan2(y, x) (in radians)
 * 				Note: The Math library has two arc-tangent methods, Math.atan(double) and Math.atan2(double, double). We commonly use the Math.atan2(y, x) instead of Math.atan(y/x) to avoid division by zero. Read the documentation of Math class in package java.lang.
 * 			A method conjugate() that returns a new MyComplex instance containing the complex conjugate of this instance.
 * 				conjugate(x+yi) = x - yi
 * 				Hint:
 * 				return new MyComplex(real, -imag);  // construct a new instance and return the constructed instance
 * 			Methods add(MyComplex another) and subtract(MyComplex another) that adds and subtract this instance with the given MyComplex instance another, and returns a new MyComplex instance containing the result.
 * 				(a + bi) + (c + di) = (a+c) + (b+d)i
 * 				(a + bi) - (c + di) = (a-c) + (b-d)i
 * 			Methods multiplyWith(MyComplex another) and divideBy(MyComplex another) that multiplies and divides this instance with the given MyComplex instance another, keep the result in this instance, and returns this instance.
 * 				(a + bi) * (c + di) = (ac - bd) + (ad + bc)i
 * 				(a + bi) / (c + di) = [(a + bi) * (c – di)] / (c2 + d2)
 * 				Hint:
 * 				return this;  // return "this" instance
 *  
 * 		We are then instructed to:
 * 			1. Write the MyComplex class.
 * 			2. Write a test program to test all the methods defined in the class.
 * 			3. Write an application called MyComplexApp that uses the MyComplex class. The application shall prompt the user for two complex numbers, print their values, check for real, imaginary and equality, and carry out all the arithmetic operations.
 * 				Enter complex number 1 (real and imaginary part): 1.1 2.2
 * 				Enter complex number 2 (real and imaginary part): 3.3 4.4
 * 			
 * 				Number 1 is: (1.1 + 2.2i)
 * 				(1.1 + 2.2i) is NOT a pure real number
 * 				(1.1 + 2.2i) is NOT a pure imaginary number
 * 
 * 				Number 2 is: (3.3 + 4.4i)
 * 				(3.3 + 4.4i) is NOT a pure real number
 * 				(3.3 + 4.4i) is NOT a pure imaginary number
 * 				
 * 				(1.1 + 2.2i) is NOT equal to (3.3 + 4.4i)
 * 				(1.1 + 2.2i) + (3.3 + 4.4i) = (4.4 + 6.6000000000000005i)
 * 				(1.1 + 2.2i) - (3.3 + 4.4i) = (-2.1999999999999997 + -2.2i)
 * 
 * 			So we wrote the MyComplex class the way we were instructed and wrote TestMyComplex to test all the methods. We then wrote MyComplexApp to complete the requirements.
 * 			Note: MyComplexApp is in TestMyComplex.java
 */
public class MyComplex
{
	private double real;
	private double imag;
	
	public MyComplex(double real, double imag)
	{
		this.real = real;
		this.imag = imag;
	}
	
	public boolean isReal()
	{
		return (imag == 0);
	}
	
	public boolean isImaginary()
	{
		return (real == 0);
	}
	
	public double magnitude()
	{
		return Math.sqrt((this.real * this.real) + (this.imag * this.imag));
	}
	
	public double argumentInRadians()
	{
		return Math.atan2(this.imag, this.real);
	}
	
	public int argumentInDegrees()
	{
		return (int)(this.argumentInRadians()*180/Math.PI + 0.5);
	}

	public MyComplex conjugate()
	{
		return new MyComplex(this.real, -this.imag);
	}
	
	public MyComplex add(MyComplex another)
	{
		return new MyComplex(this.real + another.real, this.imag + another.imag);
	}
	
	public MyComplex subtract(MyComplex another)
	{
		return new MyComplex(this.real - another.real, this.imag - another.imag);
	}	
	
	public MyComplex multiplyWith(MyComplex another)
	{
		return new MyComplex((this.real * another.real) - (this.imag * another.imag), (this.real * another.imag) + (this.real * another.imag));
	}
	
	public MyComplex divideBy(MyComplex another)
	{
		return new MyComplex(this.multiplyWith(another.conjugate()).getReal() / (Math.pow(another.getReal(), 2) + Math.pow(another.getImag(), 2)), this.multiplyWith(another.conjugate()).getImag() / (Math.pow(another.getReal(), 2) + Math.pow(another.getImag(), 2)));
	}

	public double getReal()
	{
		return real;
	}

	public void setReal(double real)
	{
		this.real = real;
	}

	public double getImag()
	{
		return imag;
	}

	public void setImag(double imag)
	{
		this.imag = imag;
	}
	
	public void setValue(double real, double imag)
	{
		this.real = real;
		this.imag = imag;
	}

	public String toString()
	{
		return "(" + real + " + " + imag + "i)";
	}
	
	public boolean equals(double real, double imag)
	{
		return (this.real == real && this.imag == imag);
	}
	
	public boolean equals(MyComplex another)
	{
		return (this.real == another.real && this.imag == another.imag);
	}
}
