import java.util.*;
import java.io.*;
public class Problem8
{
  
  final static int NUM_OF_DIGITS = 13;
  public static void main(String args[]) throws IOException
  {
   File in = new File("1000nums.txt");
   Scanner input = new Scanner(in);
   
   String s = "";
   
   while (input.hasNext())
   {
     s += input.next();
   }

   long product, largest = 0;
   for (int i = 0; i<1000-NUM_OF_DIGITS+1; i++)
   {
     product = 1;
     for (int j = 0; j< NUM_OF_DIGITS; j++)
       product *= (s.charAt(i+j)-48);
    
     //-48 is needed because it is used to convert the character value of the
     //digit to its actual numerical value

     if (product > largest)
       largest = product;
   }
   System.out.println(largest + " is the greatest product produced by thirtee" +
                      "n adjacent digits in the 1000-digit number");
  }
}