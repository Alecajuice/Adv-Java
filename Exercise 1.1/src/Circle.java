/*
 * Name: Alex Tarng
 * Course: Advanced Java
 * Date: 2/26/14
 * Assignment: Exercise 1.1
 * 
 * 		The Assignment begins by offering us code below.
 * 
 * 		Then the text of the assignment says:
 * 		Compile "Circle .java". ---We do this by copying the code into Eclipse.
 * 
 * 		Can you run the Circle class?
 * 			No
 * 		Why?
 * 			We get an error message that says "Selection does not contain a main type"
 * 		
 * 		The assignment actually gives a fuller answer below:
 * 
 * 		This Circle class does not have a main() method.
 * 		Hence, it cannot be run directly.
 * 		This Circle class is a "building block" and is meant to be used in another program.
 * 
 * 		The exercise presents us with more code (TestCircle.java) which we also compile in the same project as Circle.java
 * 		
 * 			We are directed to run the TestCircle.java class...
 * 
 * 				The following output occurs when we run:
 * 
 * 					The circle has radius of 1.0 and area of 3.141592653589793
 * 					The circle has radius of 2.0 and area of 12.566370614359172
 * 
 * 		The exercise then gives us Try's.
 * 		The first try asks us to: 
 * 			Constructor: Modify the class Circle to include a third constructor for constructing a Circle instance with the given radius and color.
 * 				// Construtor to construct a new instance of Circle with the given radius and color
 * 				public Circle (double r, String c) {......}
 * 			Modify the test program TestCircle to construct an instance of Circle using this constructor.
 * 
 * 			So we implemented the constructor but we cannot yet verify the color was set properly because no getColor() is defined.
 * 
 * 		The second try asks us to:
 * 			Getter: Add a getter for variable color for retrieving the color of a Circle instance.
 *				// Getter for instance variable color
 * 				public String getColor() {......}
 * 			Modify the test program to test this method.
 * 
 * 			So we implemented the getter for color and verified the constructor in the first try by using getColor() in TestCircle.java
 * 
 * 		The third try asks us to:
 * 			public vs. private: In TestCircle, can you access the instance variable radius directly (e.g., System.out.println(c1.radius)); or assign a new value to radius (e.g., c1.radius=5.0)? Try it out and explain the error messages.
 * 
 * 			System.out.println(c1.radius)); and c1.radius=5.0; does not work because radius is private
 * 
 * 		The fourth try asks us to:
 * 			Setter: Is there a need to change the values of radius and color of a Circle instance after it is constructed? If so, add two public methods called setters for changing the radius and color of a Circle instance as follows:
 * 				// Setter for instance variable radius
 * 				public void setRadius(double r) {
 * 				   radius = r;
 * 				}
 * 			
 * 				// Setter for instance variable color
 * 				public void setColor(String c) { ...... }
 * 			Modify the TestCircle to test these methods, e.g.,
 * 				Circle c3 = new Circle();   // construct an instance of Circle
 * 				c3.setRadius(5.0);          // change radius
 * 				c3.setColor(...);           // change color
 * 
 * 			So we implemented the setRadius() and setColor() setters and the tests for the setters were successful.
 * 	
 * 		The fifth try asks us to:
 * 			Keyword "this": Instead of using variable names such as r (for radius) and c (for color) in the methods' arguments, it is better to use variable names radius (for radius) and color (for color) and use the special keyword "this" to resolve the conflict between instance variables and methods' arguments. For example,
 * 				// Instance variable
 * 				private double radius;
 * 
 * 				// Setter of radius
 * 				public void setRadius(double radius) {
 * 					this.radius = radius;   // "this.radius" refers to the instance variable
 * 				                           // "radius" refers to the method's argument
 * 				}
 * 			Modify ALL the constructors and setters in the Circle class to use the keyword "this".
 * 
 * 			So we implemented the "this" keywords and everything still works fine.
 * 
 * 		The sixth try asks us to:
 * 			Method toString(): Every well-designed Java class should contain a public method called toString() that returns a short description of the instance (in a return type of String). The toString() method can be called explicitly (via instanceName.toString()) just like any other method; or implicitly through println(). If an instance is passed to the println(anInstance) method, the toString() method of that instance will be invoked implicitly. For example, include the following toString() methods to the Circle class:
 * 				public String toString() {
 * 				   return "Circle: radius=" + radius + " color=" + color;
 * 				}
 * 			Try calling toString() method explicitly, just like any other method:
 * 				Circle c1 = new Circle(5.0);
 * 				System.out.println(c1.toString());   // explicit call
 * 			toString() is called implicitly when an instance is passed to println() method, for example,
 * 				Circle c2 = new Circle(1.2);\
 * 				System.out.println(c2.toString());  // explicit call
 * 				System.out.println(c2);             // println() calls toString() implicitly, same as above
 * 				System.out.println("Operator '+' invokes toString() too: " + c2);  // '+' invokes toString() too
 * 
 * 			So we implemented the toString() method into the Circle class and the tests for toString() work perfectly.
 * 
 * 
 */
public class Circle {           // save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   private String color;
   
   // 1st constructor, which sets both radius and color to default
   public Circle() {
	   this.radius = 1.0;
	   this.color = "red";
   }
   
   // 2nd constructor with given radius, but color default
   public Circle(double radius) {
	   this.radius = radius;
	   this.color = "red";
   }
   
   // #rd constructor with given radius and color
   public Circle(double radius, String color){
	   this.radius = radius;
	   this.color = color;
   }
   
   // Convert Circle object to readable string
   public String toString() {
	   return "Circle: radius=" + radius + " color=" + color;
   }
   
   // Setter for instance variable radius
   public void setRadius(double radius) {
	   this.radius = radius;
   }
   
   // A public method for retrieving the radius
   public double getRadius() {
	   return radius; 
   }

   // Setter for instance variable color
   public void setColor(String color) {
	   this.color = color;
   }

   // A public method for retrieving the color
   public String getColor() {
	   return color;
   }

// A public method for computing the area of circle
   public double getArea() {
	   return radius*radius*Math.PI;
   }
}