import java.math.BigInteger;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class Problem13
{
  public static void main(String[] args) throws IOException
  {
    java.io.File inFile = new java.io.File("oneHundred50DigitNums.txt");
    Scanner input = new Scanner(inFile);
    ArrayList<BigInteger> nums = new ArrayList<BigInteger>();
    BigInteger sum = new BigInteger(input.nextLine());
    for (int i = 1; i<100; i++)
      sum = sum.add(new BigInteger(input.nextLine()));
    
    System.out.println(sum.toString().substring(0,10) + " is first ten digits" +
                       " of the sum of the provided one-hundred 50-digit numb" +
                       "ers");
  }
}