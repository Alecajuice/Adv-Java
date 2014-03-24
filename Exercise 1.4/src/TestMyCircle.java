
public class TestMyCircle
{
	public static void main(String[] args)
	{
		MyCircle c1 = new MyCircle(14, 27, 8);
		MyCircle c2 = new MyCircle(new MyPoint(1, 2), 3);
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getRadius());
		System.out.println(c2);
		System.out.println(c2.getArea());
		System.out.println(c2.getRadius());
	}
}
