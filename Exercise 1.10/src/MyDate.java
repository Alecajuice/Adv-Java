
public class MyDate
{
	private int year, month, day;
	private static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; 
	private static String[] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}; 
	private static int[] dayInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public MyDate(int year, int month, int day)
	{
		setDate(year, month, day);
	}
	
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
		int[] months = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
		int mon = months[month - 1];
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
		if (isLeapYear(year))
		{
			if (month == 1)
			{
				mon = 6;
			}
			if (month == 2)
			{
				mon = 2;
			}
		}
		return (cent + (year % 100) + ((int)(year % 100) / 4) + mon + day) % 7;
	}
	public MyDate previousDay()
	{
		try
		{
			if(day != 1)
			{
				day --;
			}
			else
			{
				previousMonth();
				setDay(getDaysInMonth(year, month));
			}
			return this;
		}
		catch(IllegalStateException e)
		{
			System.out.println("Year out of range!");
			return null;
		}
		}
	public MyDate nextDay()
	{
		try
		{
			if(day != getDaysInMonth(year, month))
			{
				day ++;
			}
			else
			{
				nextMonth();
				setDay(1);
			}
			return this;
		}
		catch(IllegalStateException e)
		{
			System.out.println("Year out of range!");
			return null;
		}
	}
	public MyDate previousMonth()
	{
			try
		{
			if(month != 1)
			{
				if(day > getDaysInMonth(year, month - 1))
				{
					month --;
					day = getDaysInMonth(year, month - 1);
				}
				else
					month --;
			}
			else
			{
				year --;
				month = 12;
			}
			return this;
		}
		catch(IllegalStateException e)
		{
			System.out.println("Year out of range!");
			return null;
		}
	}
	public MyDate nextMonth()
	{
		try
		{
			if(month != 12)
			{
				if(day > getDaysInMonth(year, month + 1))
				{
					month ++;
					day = getDaysInMonth(year, month + 1);
				}
				else
				{
					month ++;
				}
			}
			else
			{
				year ++;
				month = 1;
			}
			return this;
		}
		catch(IllegalStateException e)
		{
			System.out.println("Year out of range!");
			return null;
		}
	}
	public MyDate previousYear()
	{
		try
		{
			if(isLeapYear(year) && month == 2)
			{	
				year --;
				day --;
			}
			else
			{
				year --;
			}
			return this;
		}
		catch(IllegalStateException e)
		{
			System.out.println("Year out of range!");
			return null;
		}
	}
	public MyDate nextYear()
	{
		try
		{
			if(isLeapYear(year) && month == 2)
			{
				year ++;
				day --;
			}
			else
			{
				year ++;
			}
			return this;
		}
		catch(IllegalStateException e)
		{
			System.out.println("Year out of range!");
			return null;
		}
	}
	
	public void setDate(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public int getMonth()
	{
		return month;
	}

	public void setMonth(int month)
	{
		this.month = month;
	}

	public int getDay()
	{
		return day;
	}

	public void setDay(int day)
	{
		this.day = day;
	}
	
	public String toString()
	{
		return getDayOfWeek(year, month, day) + " " + day + " " + strMonths[month - 1] + " " + year;
	}
}
