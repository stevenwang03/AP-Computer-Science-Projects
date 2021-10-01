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


//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolver {

	private ArrayList<String> list;
	private String expression;
	

	public ExpressionSolver() {

	}

	public ExpressionSolver(String s) {
		list = new ArrayList<String>();
		expression = s;
	}

	public void setExpression(String s) {
		list = new ArrayList<String>();
		expression = s;
	}

	public String solveExpression(String a) {
		list = new ArrayList<String>(Arrays.asList(expression.split(" ")));

		for (int i = 1; i < list.size() - 1; i++) {

			if (list.get(i).toString().equals("*")) {
				list.set(i, Integer.toString(Integer.parseInt(list.get(i - 1)) * Integer.parseInt(list.get(i + 1))));
				list.remove(i + 1);
				list.remove(i - 1);

			}
			if (list.get(i).toString().equals("/")) {
				list.set(i, Integer.toString(Integer.parseInt(list.get(i - 1)) / Integer.parseInt(list.get(i + 1))));
				list.remove(i + 1);
				list.remove(i - 1);

			}
		}
		for (int j = 1; j < list.size() - 1; j++) {
			if (list.get(j).toString().equals("+")) {
				list.set(j, Integer.toString(Integer.parseInt(list.get(j - 1)) + Integer.parseInt(list.get(j + 1))));
				list.remove(j + 1);
				list.remove(j - 1);
			}
			if (list.get(j).toString().equals("-")) {
				list.set(j, Integer.toString(Integer.parseInt(list.get(j - 1)) - Integer.parseInt(list.get(j + 1))));
				list.remove(j + 1);
				list.remove(j - 1);
			}
		}
		return list.get(0).toString();
	}
}


