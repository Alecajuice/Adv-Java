/*
 * Name: Alex Tarng
 * Course: Advanced Java
 * Date: 3/19/14
 * Assignment: Exercise 1.8
 * 
 * 		The Assignment begins by instructing us to create the MyTime class that contains the following private instance variables:
 * 			hour: between 0 to 23.
 * 			minute: between 0 to 59.
 * 			Second: between 0 to 59.
 * 		The constructor shall invoke the setTime() method (to be described later) to set the instance variable.
 * 		It contains the following public methods:
 * 			setTime(int hour, int minute, int second): It shall check if the given hour, minute and second are valid before setting the instance variables.
 * 			(Advanced: Otherwise, it shall throw an IllegalArgumentException with the message "Invalid hour, minute, or second!".)
 * 			Setters setHour(int hour), setMinute(int minute), setSecond(int second): It shall check if the parameters are valid, similar to the above.
 * 			Getters getHour(), getMinute(), getSecond().
 * 			toString(): returns "HH:MM:SS".
 * 			nextSecond(): Update this instance to the next second and return this instance. Take note that the nextSecond() of 23:59:59 is 00:00:00.
 * 			nextMinute(), nextHour(), previousSecond(), previousMinute(), previousHour(): similar to the above.
 * 		
 * 			We are then instructed to:
 * 				Write the code for the MyTime class. Also write a test program (called TestMyTime) to test all the methods defined in the MyTime class.
 * 
 * 			
 * 		
 */
public class MyTime
{
	//Private instance variables
	private int hour = 0, minute = 0, second = 0;
	
	//MyTime constructor
	public MyTime(int hour, int minute, int second)
	{
		//Runs setTime as instructed
		setTime(hour, minute, second);
	}
	
	//Increments time to next second, if goes over 59 invokes nextMinute()
	public MyTime nextSecond()
	{
		if (this.second != 59)
		{
			this.setSecond(this.second + 1);
		}
		else
		{
			this.setSecond(0);
			this.nextMinute();
		}
		return this;
	}

	//Increments time to next minute, if goes over 59 invokes nextHour()
	public MyTime nextMinute()
	{
		if (this.minute != 59)
		{
			this.setMinute(this.minute + 1);
		}
		else
		{
			this.setMinute(0);
			this.nextHour();
		}
		return this;
	}

	//Increments time to next hour, if goes over 23 invokes sets hour to 0
	public MyTime nextHour()
	{
		if (this.hour != 23)
		{
			this.setHour(this.hour + 1);
		}
		else
		{
			this.setHour(0);
		}
		return this;
	}

	//Decrements time to previous second, if goes under 0 invokes previousMinute()
	public MyTime previousSecond()
	{
		if (this.second != 0)
		{
			this.setSecond(this.second - 1);
		}
		else
		{
			this.setSecond(59);
			this.previousMinute();
		}
		return this;
	}

	//Decrements time to previous minute, if goes under 0 invokes previousHour()
	public MyTime previousMinute()
	{
		if (this.minute != 0)
		{
			this.setMinute(this.minute - 1);
		}
		else
		{
			this.setMinute(59);
			this.previousHour();
		}
		return this;
	}

	//Decrements time to previous hour, if goes under 0 invokes sets hour to 23
	public MyTime previousHour()
	{
		if (this.hour != 0)
		{
			this.setHour(this.hour - 1);
		}
		else
		{
			this.setHour(23);
		}
		return this;
	}
	
	//set the hour, minute, and second of this
	public void setTime(int hour, int minute, int second)
	{
		if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60)
		{
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}
		else
		{
			throw new IllegalArgumentException("Invalid hour, minute, or second!");
		}
	}

	//Getters and setters, setters check to see if the value is valid
	public int getHour()
	{
		return hour;
	}

	public void setHour(int hour)
	{
		if (hour >= 0 && hour < 24)
		{
			this.hour = hour;
		}
		else
		{
			throw new IllegalArgumentException("Invalid hour!");
		}
	}

	public int getMinute()
	{
		return minute;
	}

	public void setMinute(int minute)
	{
		if (minute >= 0 && minute < 60)
		{
			this.minute = minute;
		}
		else
		{
			throw new IllegalArgumentException("Invalid minute!");
		}
	}

	public int getSecond()
	{
		return second;
	}

	public void setSecond(int second)
	{
		if (second >= 0 && second < 60)
		{
			this.second = second;
		}
		else
		{
			throw new IllegalArgumentException("Invalid second!");
		}
	}

	//toString() returns in format HH:MM:SS
	public String toString() {
		return this.hour + ":" + this.minute + ":" + this.second;
	}
}
