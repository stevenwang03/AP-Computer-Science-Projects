//(c) A+ Computer Science
//www.apluscompsci.com

//Steven Wang
//10/5/18
//CompSci
//OOP Lab

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist, hrs, mins);
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins; 
	}

	public void calcMPH()
	{
		mph = distance / (hours + minutes / 60);
	}

	public void print()
	{
		out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + mph + "MPH");
	}
	
	//create a print or toString or both
	
}

