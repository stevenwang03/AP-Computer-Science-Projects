//(c) A+ Computer Science
//www.apluscompsci.com
//Names - Priscilla Bunday, Meili Gong, Steven Wang


import java.util.Scanner;
import static java.lang.System.*;

public class Main
{
 private String name;
 private int howBig;

 public Monster()
 {
       name = "";
   howBig = 0;
 }

 public Monster(String n, int size)
 {
   name = n;
   howBig = size;
 }

 public String getName()
 {
   return name;
 }

 public int getHowBig()
 {
   return howBig;
 }

 public boolean isBigger(Monster other)
 {
   return howBig > other.getHowBig;
 }

 public boolean isSmaller(Monster other)
 {
   return howBig < other.getHowBig;
 }

 public boolean namesTheSame(Monster other)
  {
    return name.equals(other.getName());
  }

 public String toString()
 {
   return name + " " + howBig;
 }
   public static void main( String args[] )
  {
    Scanner kb = new Scanner(System.in);
    private String M1;
   private String M2;
   private int m1;
   private int m2;
   System.out.println("Enter a name for the first monster :: ");
   M1 = kb.next();

   System.out.println("Enter a name for the second monster :: ");
   M2 = kb.next();

   System.out.println("Enter a size for the first monster :: ");
   m1 = kb.nextInt();
  
   System.out.println("Enter a size for the second monster :: ");
   m2 = kb.nextInt();

    public MonsterOne()
   {

   }

   public MonsterTwo()
  
    //ask for name and size
    
    //instantiate monster two
  }
}

