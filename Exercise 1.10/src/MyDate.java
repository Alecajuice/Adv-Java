
public class MyDate
{
	private int year, month, day;
	private static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; 
	private static String[] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}; 
	private static int[] dayInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static boolean isLeapYear(int year)
	{
		if (year % 4 == 0)
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
				{
					return true;
				}
				return false;
			}
			return true;
		}
		return false;
	}
	
	public static boolean isValidDate(int year, int month, int day)
	{
		if (year > 0 && year < 10000 && month > 0 && month < 13 && day > 0 && day <= dayInMonths[month])
		{
			return true;
		}
		return false;
	}
	
	public static int getDayOfWeek(int year, int month, int day)
	{
		int cent;
		if (((year - (year % 100)) % 4 == 0))
		{
			cent = 6;
		}
		else if (((year - (year % 100)) % 4 == 1))
		{
			cent = 4;
		}
		else if (((year - (year % 100)) % 4 == 2))
		{
			cent = 2;
		}
		else if (((year - (year % 100)) % 4 == 3))
		{
			cent = 0;
		}
		else
		{
			cent = 2134981902;
		}
		return cent + (year % 100);
	}
}
