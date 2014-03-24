/*
 * Name: Alex Tarng
 * Course: Advanced Java
 * Date: 3/12/14
 * Assignment: Exercise 1.4
 * 
 * 		The Assignment begins by instructing us to create the MyCircle class that contains:
 * 			Two private instance variables: center (an instance of MyPoint) and radius (int).
 *			A constructor that constructs a circle with the given center's (x, y) and radius.
 * 			An overloaded constructor that constructs a MyCircle given a MyPoint instance as center, and radius.
 * 			Various getters and setters.
 * 			A toString() method that returns a string description of this instance in the format "Circle @ (x, y) radius=r".
 * 			A getArea() method that returns the area of the circle in double.
 * 
 * 		We are then instructed to:
 * 			Write the MyCircle class. Also write a test program (called TestMyCircle) to test all the methods defined in the class.
 * 
 * 			So we wrote the MyCircle class the way we were instructed and wrote TestMyCircle to test all the methods.
 */
public class MyCircle
{	
	private MyPoint center;
	private int radius;
	
	public MyCircle(int x, int y, int radius)
	{
		this.center = new MyPoint(x, y);
		this.radius = radius;
	}
	
	public MyCircle(MyPoint center, int radius)
	{
		this.center = center;
		this.radius = radius;
	}

	public double getArea()
	{
		return Math.PI * radius * radius;
	}
	
	public MyPoint getCenter()
	{
		return center;
	}

	public void setCenter(MyPoint center)
	{
		this.center = center;
	}

	public int getRadius()
	{
		return radius;
	}

	public void setRadius(int radius)
	{
		this.radius = radius;
	}

	public String toString() 
	{
		return "Circle @ (" + center.getX() + ", " + center.getY() + ") radius=" + radius;
	}
}