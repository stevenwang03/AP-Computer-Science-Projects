import static java.lang.System.*;

public class BiggestDouble {
	private double one, two, three, four;

	public BiggestDouble() {
		this(0, 0, 0, 0);
	}

	public BiggestDouble(double a, double b, double c, double d) {
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public void setDoubles(double a, double b, double c, double d) {
		a = 0;
		b = 0;
		c = 0;
		d = 0;
	}

	public double getBiggest() {
		double biggestnumber = 0;
		if (one > two) {
			biggestnumber = one;
		} else {
			biggestnumber = two;
		}

		if (biggestnumber < three) {
			biggestnumber = three;
		}

		if (biggestnumber < four) {
			biggestnumber = four;
		}

		return biggestnumber;
	}

	public String toString() {
		return Double.toString(one) + " " + Double.toString(two) + " " + Double.toString(three) + " " + Double.toString(four);
	}
}

import static java.lang.System.*;

public class DoubleRunner {
	public static void main(String[] args) {
		BiggestDouble run = new BiggestDouble(4.5, 6.7, 7.8, 9.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");

		BiggestDouble run2 = new BiggestDouble(14.51, 6.17, 71.8, 1.0);
		System.out.println(run2);
		System.out.println("biggest = " + run2.getBiggest() + "\n");

		BiggestDouble run3 = new BiggestDouble(41.15, 816.7, 17.8, 19.0);
		System.out.println(run3);
		System.out.println("biggest = " + run3.getBiggest() + "\n");

		BiggestDouble run4 = new BiggestDouble(884.5, 16.7, 7.8, 9.0);
		System.out.println(run4);
		System.out.println("biggest = " + run4.getBiggest() + "\n");

		BiggestDouble run5 = new BiggestDouble(4.5, -456.7, 677.8, 9.0);
		System.out.println(run5);
		System.out.println("biggest = " + run5.getBiggest() + "\n");

		BiggestDouble run6 = new BiggestDouble(4.5, 16.7, -7.8, -9.0);
		System.out.println(run6);
		System.out.println("biggest = " + run6.getBiggest() + "\n");
	}
}

import static java.lang.System.*;

public class TriangleTwo {
	private int size;
	private String letter;

	public TriangleTwo() {
		size = 0;
		letter = "";
	}

	public TriangleTwo(String let, int sz) {
		letter = let;
		size = sz;
	}

	public void setTriangle(int count, String let) {
		size = count;
		letter = let;
	}

	public String getLetter() {
		return letter;
	}

	public String toString() {
		String output = "";
		for (int i = size; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(letter);
			}
			System.out.println();
		}
		return output + "\n";
	}
}

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleTwoRunner {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		String choice = "";
		do {
			out.print("Enter the size of the triangle : ");
			int big = keyboard.nextInt();
			out.print("Enter a letter : ");
			String value = keyboard.next();

			// instantiate a TriangleTwo object
			TriangleTwo tw = new TriangleTwo(value, big);
			// call the toString method to print the triangle
			System.out.println(tw);

			System.out.print("Do you want to enter more data? ");
			choice = keyboard.next();
		} while (choice.equals("Y") || choice.equals("y"));
	}
}
