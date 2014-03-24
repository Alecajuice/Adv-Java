/*
 * Name: Alex Tarng
 * Course: Advanced Java
 * Date: 3/5/14
 * Assignment: Exercise 1.3
 * 
 * 		The Assignment begins by instructing us to create the MyPoint class that contains:
 * 			Two instance variables x (int) and y (int).
 * 			A "no-argument" (or "no-arg") constructor that construct a point at (0, 0).
 * 			A constructor that constructs a point with the given x and y coordinates.
 * 			Getter and setter for the instance variables x and y.
 * 			A method setXY() to set both x and y.
 * 			A toString() method that returns a string description of the instance in the format "(x, y)".
 * 			A method called distance(int x, int y) that returns the distance from this point to another point at the given (x, y) coordinates.
 * 			An overloaded distance(MyPoint another) that returns the distance from this point to the given MyPoint instance another.
 * 
 * 		We are then instructed to:
 * 			1. Write the code for the class MyPoint. Also write a test program (called TestMyPoint) to test all the methods defined in the class.
 * 				Hints:
 * 					// Overloading method distance()
 * 					public double distance(int x, int y) {   // this version takes two ints as arguments
 * 						int xDiff = this.x – x;
 * 						int yDiff = ......
 * 						return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
 * 					}
 * 
 * 					public double distance(MyPoint another) { // this version takes a MyPoint instance as argument
 * 						int xDiff = this.x – another.x;
 * 						.......
 * 					}
 * 
 * 					// Test program
 * 					MyPoint p1 = new MyPoint(3, 0);
 * 					MyPoint p2 = new MyPoint(0, 4);
 * 					......
 * 					// Testing the overloaded method distance()
 * 					System.out.println(p1.distance(p2));    // which version?
 * 					System.out.println(p1.distance(5, 6));  // which version?
 * 					.....
 * 
 * 				So we wrote the class and the test program to test the MyPoint class.
 * 
 * 			2. Write a program that allocates 10 points in an array of MyPoint, and initializes to (1, 1), (2, 2), ... (10, 10).
 * 				Hints: You need to allocate the array, as well as each of the ten MyPoint instances.
 * 					MyPoint[] points = new MyPoint[10]; // Declare and allocate an array of MyPoint
 * 					for (......) {
 * 						points[i] = new MyPoint(...);    // Allocate each of MyPoint instances
 * 					}
 * 
 * 				So we added the code to the test program.
 * 
 * 
 */
public class MyPoint
{
	private int x = 0;
	private int y = 0;
	
	public MyPoint()
	{
		
	}
	
	public MyPoint(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public double distance(int x, int y)
	{
		int xDiff = this.x - x;
		int yDiff = this.y - y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	public double distance(MyPoint another)
	{
		int xDiff = this.x - another.x;
		int yDiff = this.y - another.y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	public int getX()
	{
		return x;
	}

	public void setX(int x)
	{
		this.x = x;
	}

	public int getY()
	{
		return y;
	}

	public void setY(int y)
	{
		this.y = y;
	}
	
	public void setXY(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}
}
