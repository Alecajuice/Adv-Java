/*
 * Name: Alex Tarng
 * Course: Advanced Java
 * Date: 3/12/14
 * Assignment: Exercise 1.5
 * 
 * 		The Assignment begins by instructing us to create the MyTriangle class that contains:
 * 			Three private instance variables v1, v2, v3 (instances of MyPoint), for the three vertices.
 * 			A constructor that constructs a MyTriangle with three points v1=(x1, y1), v2=(x2, y2), v3=(x3, y3).
 * 			An overloaded constructor that constructs a MyTriangle given three instances of MyPoint.
 * 			A toString() method that returns a string description of the instance in the format "Triangle @ (x1, y1), (x2, y2), (x3, y3)".
 * 			A getPerimeter() method that returns the length of the perimeter in double. You should use the distance() method of MyPoint to compute the perimeter.
 * 			A method printType(), which prints "equilateral" if all the three sides are equal, "isosceles" if any two of the three sides are equal, or "scalene" if the three sides are different.
 * 
 * 		We are then instructed to:
 * 			Write the MyTriangle class. Also write a test program (called TestMyTriangle) to test all the methods defined in the class.
 * 
 * 			So we wrote the MyTriangle class the way we were instructed and wrote TestMyTriangle to test all the methods.
 */
public class MyTriangle
{
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3)
	{
		this.v1 = new MyPoint(x1, y1);
		this.v2 = new MyPoint(x2, y2);
		this.v3 = new MyPoint(x3, y3);
	}
	
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3)
	{
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	public double getPerimeter()
	{
		return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
	}
	
	public void printType()
	{
		if (v1.distance(v2) == v2.distance(v3) && v2.distance(v3) == v3.distance(v1))
		{
			System.out.println("equilateral");
		}
		else if (v1.distance(v2) == v2.distance(v3) || v2.distance(v3) == v3.distance(v1) || v3.distance(v1) == v1.distance(v2))
		{
			System.out.println("isosceles");
		}
		else
		{
			System.out.println("scalene");
		}
	}
	
	public String toString()
	{
		return "Triangle @ ("+ v1.getX() + ", " + v1.getY() + "), (" + v2.getX() + ", " + v2.getY() + "), (" + v3.getX() + ", " + v3.getY() + ")";
	}
}
