//(c) A+ Computer Science
//www.apluscompsci.com

//Steven
//9/17/18
//AP Comp Sci
//Input Lab

import static java.lang.System.*;
import java.util.Scanner;

public class input_lab
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;


		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();


		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();

		System.out.println();


		System.out.print("Enter a double :: ");
		doubleOne = keyboard.nextDouble();


		System.out.print("Enter a double :: ");
		doubleTwo = keyboard.nextDouble();


		System.out.println();


		System.out.print("Enter a float :: ");
		floatOne = keyboard.nextFloat();


		System.out.print("Enter a float :: ");
		floatTwo= keyboard.nextFloat();


		System.out.println();


		System.out.print("Enter a short :: ");
		shortOne = keyboard.nextShort();


		System.out.print("Enter a short :: ");
		shortTwo = keyboard.nextShort();



		//add in input for all variables


		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );
		System.out.println();
		System.out.println("double one = " + doubleOne );
		System.out.println("double two = " + doubleTwo );
		System.out.println();
		System.out.println("float one = " + floatOne );
		System.out.println("float two = " + floatTwo );
		System.out.println();
		System.out.println("short one = " + shortOne );
		System.out.println("short two = " + shortTwo );



		//add in output for all variables


	}
}
