
public class TestMyPolynomial
{

	public static void main(String[] args)
	{
		MyPolynomial p1 = new MyPolynomial(3.0, 4.0, 5.0);
		System.out.println(p1);
		System.out.println(p1.getDegree());
		System.out.println(p1.evaluate(5));
		System.out.println(p1.add(new MyPolynomial(3.0, 4.0, 5.0)));
		System.out.println(p1.multiply(new MyPolynomial(3.0, 4.0, 5.0)));
	}

}
