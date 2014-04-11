/*
 * Name: Alex Tarng
 * Course: Advanced Java
 * Date: 4/11/14
 * Assignment: Exercise 1.10
 * 
 * 		The Assignment begins by instructing us to create the MyDate class that contains the following private instance variables:
 * 			year (int): Between 1 to 9999.
 * 			month (int): Between 1 (Jan) to 12 (Dec).
 * 			day (int): Between 1 to 28|29|30|31, where the last day depends on the month and whether it is a leap year for Feb (28|29).
 * 		It also contains the following private static variables (drawn with underlined in the class diagram):
 * 			strMonths (String[]), strDays (String[]), and dayInMonths (int[]): static variables, initialized as shown, which are used in the methods.
 * 		The MyDate class has the following public static methods (drawn with underlined in the class diagram):
 * 			isLeapYear(int year): returns true if the given year is a leap year. A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 * 			isValidDate(int year, int month, int day): returns true if the given year, month, and day constitute a valid date. Assume that year is between 1 and 9999, month is between 1 (Jan) to 12 (Dec) and day shall be between 1 and 28|29|30|31 depending on the month and whether it is a leap year on Feb.
 * 			getDayOfWeek(int year, int month, int day): returns the day of the week, where 0 for Sun, 1 for Mon, ..., 6 for Sat, for the given date. Assume that the date is valid. Read the earlier exercise on how to determine the day of the week (or Wiki "Determination of the day of the week").
 * 		The MyDate class has one constructor, which takes 3 parameters: year, month and day. It shall invoke setDate() method (to be described later) to set the instance variables.
 * 		The MyDate class has the following public methods:
 * 			setDate(int year, int month, int day): It shall invoke the static method isValidDate() to verify that the given year, month and day constitute a valid date.
 * 			(Advanced: Otherwise, it shall throw an IllegalArgumentException with the message "Invalid year, month, or day!".)
 * 			setYear(int year): It shall verify that the given year is between 1 and 9999.
 * 			(Advanced: Otherwise, it shall throw an IllegalArgumentException with the message "Invalid year!".)
 * 			setMonth(int month): It shall verify that the given month is between 1 and 12.
 * 			(Advanced: Otherwise, it shall throw an IllegalArgumentException with the message "Invalid month!".)
 * 			setDay(int day): It shall verify that the given day is between 1 and dayMax, where dayMax depends on the month and whether it is a leap year for Feb.
 * 			(Advanced: Otherwise, it shall throw an IllegalArgumentException with the message "Invalid month!".)
 * 			getYear(), getMonth(), getDay(): return the value for the year, month and day, respectively.
 * 			toString(): returns a date string in the format "xxxday d mmm yyyy", e.g., "Tuesday 14 Feb 2012".
 *			nextDay(): update this instance to the next day and return this instance. Take note that nextDay() for 31 Dec 2000 shall be 1 Jan 2001.
 *			nextMonth(): update this instance to the next month and return this instance. Take note that nextMonth() for 31 Oct 2012 shall be 30 Nov 2012.
 *			nextYear(): update this instance to the next year and return this instance. Take note that nextYear() for 29 Feb 2012 shall be 28 Feb 2013.
 *			(Advanced: throw an IllegalStateException with the message "Year out of range!" if year > 9999.)
 *			previousDay(), previousMonth(), previousYear(): similar to the above.
 * 		
 * 			We are then instructed to:
 * 				Write the code for the MyDate class. Use the following test statements to test the MyDate class:
 * 					MyDate d1 = new MyDate(2012, 2, 28);
 * 					System.out.println(d1);             // Tuesday 28 Feb 2012
 * 					System.out.println(d1.nextDay());   // Wednesday 29 Feb 2012
 * 					System.out.println(d1.nextDay());   // Thursday 1 Mar 2012
 * 					System.out.println(d1.nextMonth()); // Sunday 1 Apr 2012
 * 					System.out.println(d1.nextYear());  // Monday 1 Apr 2013
 * 					
 * 					MyDate d2 = new MyDate(2012, 1, 2);
 * 					System.out.println(d2);                 // Monday 2 Jan 2012
 * 					System.out.println(d2.previousDay());   // Sunday 1 Jan 2012
 * 					System.out.println(d2.previousDay());   // Saturday 31 Dec 2011
 * 					System.out.println(d2.previousMonth()); // Wednesday 30 Nov 2011
 * 					System.out.println(d2.previousYear());  // Tuesday 30 Nov 2010
 * 					
 *					MyDate d3 = new MyDate(2012, 2, 29);
 * 					System.out.println(d3.previousYear());  // Monday 28 Feb 2011
 * 					
 * 					// MyDate d4 = new MyDate(2099, 11, 31); // Invalid year, month, or day!
 *					// MyDate d5 = new MyDate(2011, 2, 29);  // Invalid year, month, or day!
 *				Write a test program that tests the nextDay() in a loop, by printing the dates from 28 Dec 2011 to 2 Mar 2012.
 *
 */

public class MyDate
{
	private int year, month, day;
	private static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; 
	private static String[] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}; 
	private static int[] dayInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	//Constructor for MyDate class, takes ints year, month, and day, and inputs them into setDate().
	public MyDate(int year, int month, int day)
	{
		setDate(year, month, day);
	}
	
	//Checks to see if the input year is a leap year, takes int year, returns true if leap year, false if not.
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
	
	//Checks to see if the date is valid, takes ints year, month, and day, returns true if valid, false if not.
	public static boolean isValidDate(int year, int month, int day)
	{
		if ((year > 0 && year < 10000 && month > 0 && month < 13 && day > 0 && day <= dayInMonths[month]) || (isLeapYear(year) && month == 2 && day == 29))
		{
			return true;
		}
		return false;
	}
	
	//Calculates the day of the week, takes ints year, month, and day, returns number representative of the day of week.
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
	
	//Sets the date to the previous day, takes no arguments, returns the instance of MyDate.
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
	
	//Sets the date to the next day, takes no arguments, returns the instance of MyDate.
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
	
	//Sets the date to the previous month, takes no arguments, returns the instance of MyDate.
	public MyDate previousMonth()
	{
			try
		{
			if(month != 1)
			{
				if(day > getDaysInMonth(year, month - 1))
				{
					day = getDaysInMonth(year, month - 1);
					month --;
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
	
	//Sets the date to the next month, takes no arguments, returns the instance of MyDate.
	public MyDate nextMonth()
	{
		try
		{
			if(month != 12)
			{
				if(day > getDaysInMonth(year, month + 1))
				{
					day = getDaysInMonth(year, month + 1);
					month ++;
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
	
	//Sets the date to the previous year, takes no arguments, returns the instance of MyDate.
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
	
	//Sets the date to the next year, takes no arguments, returns the instance of MyDate.
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
	
	//Gets the number of days in month, accounts for leap years, takes ints year and month, returns the number of days in month.
	public static int getDaysInMonth(int year, int month)
	{
		if(isLeapYear(year) && month == 2)
		{
			return 29;
		}
		else
		{
			return dayInMonths[month - 1];
		}
	}
	
	//Sets the instance of MyDate to the input, takes ints year, month, and day.
	public void setDate(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	//Getters and setters for year, month, and day
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
	
	//toString, returns in format xxxday d mmm yyyy
	public String toString()
	{
		return strDays[getDayOfWeek(year, month, day)] + " " + day + " " + strMonths[month - 1] + " " + year;
	}
	
	//Checks to see if one MyDate is less than another, takes MyDate another, returns true if this instance is less than another.
	public boolean lessThan(MyDate another)
	{
		if (this.year < another.year || this.year == another.year && this.month < another.month || this.year == another.year && this.month == another.month && this.day < another.day)
		{
			return true;
		}
		return false;
	}
}
