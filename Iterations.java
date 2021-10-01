Class Complete 3
class Table {    
private int upperBound;    
private int multiplier;
   public Table(int bound, int mult)    {
       setNums(bound, mult);
   }    
public void setNums(int bound, int mult)    {
       upperbound = bound;
       multiplier = muIt;
   }    
public void print()    {
       for (int x=1, x-= upperbound, x=x+1) {
       System. out. println(x + " - “ + (run * multiplier));
       }
   } 
}

Table table = new Table(10,5); 
table.print();

Output =
1 - 5
2 - 10
3 - 15
4 - 20
5 - 25
6 - 30
7 - 35
8 - 40
9 - 45
10 - 50
Class Complete 4
class StringCleaner {   
private String line;   
private char remove;
  public StringCleaner(String s, char rem)  
 {
        setCleaner(s,rem);
  }
  public void setCleaner(String s, char rem)   
{
        line  = s;
        remove = rem;
  }   
public String getClean()   {

String cleaned=line;
​int loc = cleaned.indexOf(remove);
​while(loc> -1)
​{
​  cleaned = cleaned.substring(0, loc) + cleaned.substring(loc +1); 
​  loc = cleaned.indexOf(remove);
​}
​return cleaned;
  }
  public String toString()   {
return line + " - letter to remove " + remove;
  }
 }

//code in the main of another class 
StringCleaner test = new StringCleaner("abcXabcXabc",'X'); 
out.println(test); 
out.println(test.getClean()+"\n\n");

Output = 
abcXabcXabc - letter to
remove X
abcabcabc





Digit Counter Lab
import static java.lang.System.*;

public class DigitCounter
{
   public static int go( int number )
	{
		int count = 0;
		while( number > 0 )
		{
			count = count + 1;
			number /= 10;
		}
		return count;
	}
}

Digit Average Lab
import static java.lang.System.*;

public class DigitMath
{
   public static int countDigits( int number )
	{
	   int count = 0;
	   while (number > 0 ) 
	   {
		   number = number / 10;
		   count = count + 1;
	   }
	   return count;
	}

   public static int sumDigits( int number )
	{
	   int sum = 0; 
	   while (number != 0) 
	   { 
	       sum = sum + number % 10; 
	       number = number/10; 
	   } 
	   return sum; 
	}

	public static double go( int number )
	{
		return (double)(sumDigits(number)) / (double)(countDigits(number));
	}
}
Mult Tens
import static java.lang.System.*;

public class MultTens
{
	public static String go(  int x )
	{
		if (x <= 0)
		return "aplus";
		String s = "";
		for( int i =  1; i <= x; i++)
			s += i*10;
		return s;
	}
}
Vowel
import static java.lang.System.*;

public class VowelCounter
{
	public static String getNumberString( String s)
	{
		String ret = "";
		String vowelString = "aeiouAEIOU";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (vowelString.indexOf(s.charAt(i)) > -1) {
			if (count > 9) {
			count = 0;
			}
			ret += count;
			count++;
			} else {
			ret += s.charAt(i);
			}
			}

			return ret;
	}
}








