//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolver
{
	//add in instance variables

	public ExpressionSolver(String s)
	{
		String[] ray = s.split(" ");
		List<String> list = Arrays.asList(ray);
		for (int i = 0; i < list.size()-1; i++) {
			if ( ray[i] == "*") {
				list.remove(i + 1);
				list.remove(i - 1);
				list.set(i,Integer.parseInt(list.get(i-1)) * Integer.parseInt(list.get(i+1)) );
			}
			if ( ray[i] == "/") {
				list.remove(i + 1);
				list.remove(i - 1);
				list.set(i,Integer.parseInt(list.get(i-1)) * Integer.parseInt(list.get(i+1)) );
			}
		}
		for (int j = 0; j < list.size()-1; j++) {
			if (ray[j] == "+") {
				list.remove(j + 1);
				list.remove(j - 1);
				list.set(j,Integer.parseInt(list.get(j-1)) * Integer.parseInt(list.get(j+1)) );
			}
			if ( ray[j] == "-") {
				list.remove(j + 1);
				list.remove(j - 1);
				list.set(j,Integer.parseInt(list.get(j-1)) * Integer.parseInt(list.get(j+1)) );
			}
		}
	}

	public void setExpression(String s)
	{
	}

	public void solveExpression()
	{
	}

	public String toString( )
	{
		return "";
	}
}

