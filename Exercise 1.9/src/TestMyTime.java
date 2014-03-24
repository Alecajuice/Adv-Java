
public class TestMyTime
{
	public static void main(String[] args)
	{
		//Tests to see if exceptions are thrown properly - commented out to run other code
		//MyTime invalidTime = new MyTime(234, 234, 234);
		//MyTime invalidTime2 = new MyTime(0, 0, 0);
		//invalidTime2.setHour(24);
		
		//Test constructor
		MyTime t1 = new MyTime(0, 0, 0);
		
		//Test toString()
		System.out.println(t1);
		
		//Test getters and setters
		t1.setTime(5, 25, 34);
		t1.setHour(3);
		t1.setMinute(42);
		System.out.println(t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond());
		
		//Test nextSecond(), nextMinute(), etc.
		System.out.println(t1.nextSecond());
		System.out.println(t1.nextMinute());
		System.out.println(t1.nextHour());
		System.out.println(t1.previousSecond());
		System.out.println(t1.previousMinute());
		System.out.println(t1.previousHour());
		
		MyTime t2 = new MyTime(23, 59, 59);
		System.out.println(t2.nextSecond());
		System.out.println(t2.previousSecond());
	}
}