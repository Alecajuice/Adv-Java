public class TestCircle {        // save as "TestCircle.java"
   public static void main(String[] args) {
      // Declare and allocate an instance of class Circle called c1
      //  with default radius and color
      Circle c1 = new Circle();
      // Use the dot operator to invoke methods of instance c1.
      System.out.println("The circle has radius of " 
         + c1.getRadius() + " and area of " + c1.getArea());
   
      // Declare and allocate an instance of class circle called c2
      //  with the given radius and default color
      Circle c2 = new Circle(2.0);
      // Use the dot operator to invoke methods of instance c2.
      System.out.println("The circle has radius of " 
         + c2.getRadius() + " and area of " + c2.getArea());
      
      //Try 1: New constructor works perfectly
      Circle c3 = new Circle(3.0, "Yellow");

      System.out.println("The circle has radius of " 
    	         + c3.getRadius() + " and area of " + c3.getArea());
      
      //Try 2: Getter for color works perfectly
      System.out.println(c3.getColor());
      
      //Try 3: System.out.println(c1.radius)); does not work because radius is private
      
      //Try 4: Setters work perfectly
      Circle c4 = new Circle();   // construct an instance of Circle
      c4.setRadius(5.0);          // change radius
      c4.setColor("yellow");           // change color
      System.out.println("Color is " + c4.getColor() + " and radius is " + c4.getRadius());
      
      //Try 5: Changed all constructors to include "this"
      
      //Try 6: toString() method works perfectly
      System.out.println(c1.toString());
      System.out.println(c2.toString());  // explicit call
      System.out.println(c2);             // println() calls toString() implicitly, same as above
      System.out.println("Operator '+' invokes toString() too: " + c2);  // '+' invokes toString() too
   }
}