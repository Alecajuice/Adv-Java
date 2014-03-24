
public class TestMyTriangle
{

	public static void main(String[] args)
	{
		MyTriangle t1 = new MyTriangle(1, 2, 3, 4, 2, 1);
		MyTriangle t2 = new MyTriangle(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(-1, -1));
		System.out.println(t1);
		System.out.println(t1.getPerimeter());
		t1.printType();
		System.out.println(t2);
		System.out.println(t2.getPerimeter());
		t2.printType();
	}
}
