import java.util.Arrays;

public class ListTotal
{
	public static void main( String args[] )
	{					
			ListSumFirst s = new ListSumFirst();
		
		System.out.println( s.go( Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,5) ) );
		System.out.println( s.go( Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99)));
		System.out.println( s.go( Arrays.asList(10,20,30,40,50,-11818,40,30,20,10)));
		System.out.println( s.go( Arrays.asList(32767)));
		System.out.println( s.go( Arrays.asList(255,255)));
		System.out.println( s.go( Arrays.asList(9,10,-88,100,-555,2)));
		System.out.println( s.go( Arrays.asList(10,10,10,11,456)));
		System.out.println( s.go( Arrays.asList(-111,1,2,3,9,11,20,1)));
		System.out.println( s.go( Arrays.asList(9,8,7,6,5,4,3,2,0,-2,-989)));
		System.out.println( s.go( Arrays.asList(12,15,18,21,23,1000)));
		System.out.println( s.go( Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,-455)));	
		System.out.println( s.go( Arrays.asList(9,10,-8,10000,-5000,1000)));										
	}
}

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
			int sum = 0;
			if (ray.size() > 1) {
				for (int i = 0; i < ray.size(); i++) {
					if (ray.get(i) > ray.get(0)) {
						sum += ray.get(i);
					}
				}
				if (sum == 0) {
					return -1;
				}
				else {
					return sum;
				}
			}
			else {
				return -1;
			}
	}
}

import java.util.ArrayList;
import java.util.List;

public class ListTotal
{
	public static int go( List<Integer> ray )
	{
		int sum=0;
      for(int item : ray )
      {
      	sum += item;
      }
		return sum;
	}
}

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolverRunner {
    public static void main(String args[]) {
        new String("test").equals("test"); // --> true

        String input1 = "3 + 5";
        String input2 = "3 * 5";
        String input3 = "3 - 5";
        String input4 = "3 / 5";
        String input5 = "5 / 5 * 2 + 8 / 2 + 5";
        String input6 = "5 * 5 + 2 / 2 - 8 + 5 * 5 â€“ 2";
        ExpressionSolver s = new ExpressionSolver();
        ExpressionSolver d = new ExpressionSolver();
        ExpressionSolver f = new ExpressionSolver();
        ExpressionSolver g = new ExpressionSolver();
        ExpressionSolver h = new ExpressionSolver();
        ExpressionSolver j = new ExpressionSolver();
        System.out.println(input1 + " = " + s.solveExpression(input1));
        System.out.println(input2 + " = " + d.solveExpression(input2));
        System.out.println(input3 + " = " + f.solveExpression(input3));
        System.out.println(input4 + " = " + g.solveExpression(input4));
        System.out.println(input5 + " = " + h.solveExpression(input5));
        System.out.println(input6 + " = " + j.solveExpression(input6));

    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;
import java.util.stream.*;

public class ExpressionSolver {
    // add in instance variables

    // List<String> list;
    // ArrayList<String> list;

    public ExpressionSolver() {

    }

    public String solveExpression(String s) {
        String[] ray = s.split(" ");

        //ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(ray));
//
//        for (int r = 0; r < ray.length; r++) {
//            list.add(ray[r]);
//        }

        for (int i = 1; i < list.size() - 1; i++) {

            if (list.get(i).toString().equals("*")) {
                list.set(i, Integer.toString(
                        Integer.parseInt(list.get(i - 1).toString()) * Integer.parseInt(list.get(i + 1).toString())));
                list.remove(i + 1);
                list.remove(i - 1);

            }
            if (i < list.size() && list.get(i).toString().equals("/")) {
                list.set(i, Integer.toString(
                        Integer.parseInt(list.get(i - 1).toString()) / Integer.parseInt(list.get(i + 1).toString())));
                list.remove(i + 1);
                list.remove(i - 1);

            }
        }
        for (int j = 1; j < list.size() - 1; j++) {
            if (list.get(j).toString().equals("+")) {
                list.set(j, Integer.toString(
                        Integer.parseInt(list.get(j - 1).toString()) + Integer.parseInt(list.get(j + 1).toString())));
                list.remove(j + 1);
                list.remove(j - 1);
            }
            if (j < list.size() && list.get(j).toString().equals("-")) {
                list.set(j, Integer.toString(
                        Integer.parseInt(list.get(j - 1).toString()) - Integer.parseInt(list.get(j + 1).toString())));
                list.remove(j + 1);
                list.remove(j - 1);
            }
        }
        return list.get(0).toString();
    }
}
