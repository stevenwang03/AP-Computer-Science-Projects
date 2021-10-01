import static java.lang.System.*;

public class Word
{
	private String word;
	private static String vowels = "AEIOUaeiou";   //only one

	public Word()
	{
		setWord("");
	}

	public Word(String wrd)
	{
		setWord(wrd);
	}

	public void setWord(String wrd)
	{
		word = wrd;
	}

	public int getNumVowels()
	{
		int count=0;
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < vowels.length(); j++) {
				if (word.charAt(i) == vowels.charAt(j)) {
					count = count + 1;
				}
			}
		}
		return count;
	}

	public int getLength()
	{
		return word.length();
	}

	public String toString()
	{
		return word;
	}
}

import static java.lang.System.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class WordRunner
{
	public static void main(String[] args)
	{
		ArrayList<Word> myWords = new ArrayList();
		Scanner keyboard = new Scanner(in);

		out.print("How many words? ::");
		int num = keyboard.nextInt();
		for (int i = 0; i < num; i++) {

			out.print("");
			String words = keyboard.next();
			Word herd = new Word(words);
			myWords.add(herd);
			//myWords.add(herd.getNumVowels());
			//myWords.add(herd.getLength());
		}
		System.out.println(Arrays.toString(myWords.toArray()));
		int twoVowelsCount = 0, threeVowelsCount = 0, fourVowelsCount = 0;
		int twoCharsCount = 0, threeCharsCount = 0, fourCharsCount = 0, fiveCharsCount = 0;
		for (int j = 0; j < num; j++) {
			/*System.out.println(myWords.get(0));
			myWords.remove(0);
			System.out.println("num vowels == " + myWords.get(0));
			myWords.remove(0);
			System.out.println("num chars == " + myWords.get(0));
			myWords.remove(0);*/
			if (myWords.get(j).getNumVowels()== 2){
				twoVowelsCount++;
			}
			if (myWords.get(j).getNumVowels()==3){
				threeVowelsCount++;
			}
			if (myWords.get(j).getNumVowels()==4){
				fourVowelsCount++;
			}

			if (myWords.get(j).getLength()== 2){
				twoCharsCount++;
			}
			if (myWords.get(j).getLength()== 3){
				threeCharsCount++;
			}
			if (myWords.get(j).getLength()== 4){
				fourCharsCount++;
			}
			if (myWords.get(j).getLength()== 5){
				fiveCharsCount++;
			}
			/*System.out.println(myWords.get(j).toString());
			System.out.println(myWords.get(j).getNumVowels());
			System.out.println(myWords.get(j).getLength());
			*/


		}
		System.out.println("Words with 2 vowels = " + twoVowelsCount);
		System.out.println("Words with 3 vowels = " + threeVowelsCount);
		System.out.println("Words with 4 vowels = " + fourVowelsCount);

		System.out.println("Words with 2 chars = " + twoCharsCount);
		System.out.println("Words with 3 chars = " + threeCharsCount);
		System.out.println("Words with 4 chars = " + fourCharsCount);
		System.out.println("Words with 5 chars = " + fiveCharsCount);

		for(Word w: myWords){
			if (w.getLength()== 3){
				myWords.remove(w);
			}
		}

		System.out.println("After removing words with 3 chars ");
		System.out.println(Arrays.toString(myWords.toArray()));
	}
}

Word

import static java.lang.System.*;

import java.util.ArrayList;
import java.util.Scanner;

public class WordRunner
{
	public static void main(String[] args)
	{
		ArrayList myWords = new ArrayList();
		Scanner keyboard = new Scanner(in);

		out.print("How many words? ::");
		int num = keyboard.nextInt();
		for (int i = 0; i < num; i++) {

			out.print("");
			String words = keyboard.next();
			Word herd = new Word(words);
			myWords.add(herd.toString());
			myWords.add(herd.getNumVowels());
			myWords.add(herd.getLength());
		}
		for (int j = 0; j < num; j++) {
			System.out.println(myWords.get(0));
			myWords.remove(0);
			System.out.println("num vowels == " + myWords.get(0));
			myWords.remove(0);
			System.out.println("num chars == " + myWords.get(0));
			myWords.remove(0);
		}
	}
}

import static java.lang.System.*;

public class Word
{
	private String word;
	private static String vowels = "AEIOUaeiou";   //only one

	public Word()
	{
		setWord("");
	}

	public Word(String wrd)
	{
		setWord(wrd);
	}

	public void setWord(String wrd)
	{
		word = wrd;
	}

	public int getNumVowels()
	{
		int count=0;
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < vowels.length(); j++) {
				if (word.charAt(i) == vowels.charAt(j)) {
					count = count + 1;
				}
			}
		}
		return count;
	}

	public int getLength()
	{
		return word.length();
	}

	public String toString()
	{
		return word;
	}
}

Doggies

import java.util.Arrays;

public class Doggies {
    private Dog[] pups;

    public Doggies(int size) {
        //point pups at a new array of Dog
        pups = new Dog[size];
    }

    public void set(int spot, int age, String name) {
        //put a new Dog in the array at spot
        if (spot < pups.length && spot >= 0) {
            pups[spot] = new Dog(age, name);
        }
        //make sure spot is in bounds
    }

    public String getNameOfOldest() {

        int max = 0;

        int maxI = 0;
        for (int i = 0; i < pups.length - 1; i++) {
            Dog p = pups[i];

            if (p.getAge() > max) {
                max = p.getAge();
                maxI = i;
            }

        }

        return pups[maxI].getName();
    }

    public String getNameOfYoungest() {

        int min = 1000;

        int minI = 0;
        for (int i = 0; i < pups.length - 1; i++) {
            Dog p = pups[i];

            if (p.getAge() < min) {
                min = p.getAge();
                minI = i;
            }

        }

        return pups[minI].getName();
    }

    public String toString() {
        return "" + Arrays.toString(pups);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class DoggiesRunner
{
   public static void main( String[] args )
   {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many Dogs are in the pack? :: ");
		int size = keyboard.nextInt();
		Doggies pack = new Doggies(size);

		for(int i=0; i<size;i++)
		{
			System.out.print("Enter the age :: ");
			int age = keyboard.nextInt();
			System.out.print("Enter the name :: ");
			String name  = keyboard.next();
			pack.set(i, age, name);
		}		
		System.out.println("pack :: "+pack);
		System.out.println("NAME OF OLDEST :: "+pack.getNameOfOldest());
		System.out.println("NAME OF YOUNGEST :: "+pack.getNameOfYoungest());		
	}		
}

public class Dog 
{
    private int age;
    private String name;
    
    public Dog(int a, String n) 
    {
    	age = a;
    	name = n;
    } 
    	 
    public String getName()
    {
    	return name;
    }
    
    public int getAge()
    {
    	return age;
    }
    	    	
    public String toString()
    {
    	return "" + age + " " + name;
    }  
}
