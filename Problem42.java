import java.util.*;
import java.io.*;

public class Problem42
{
  //given that the amount of words was <2000
  private static String[] words = new String[2000];
  public static void main(String args[])
  {
    saveWords( "p042_words.txt");
    int count = 0;
    for (int i = 0; words[i] != null; i++)
    {
      if (isTriangleNumber(generateWordValue(words[i])))
        count++;
    }
    System.out.println(count + " is the amount of triangle words in the text" +
                       " file p042_words.txt");
  }
  
  /** scans and saves each line of text of a file to the String array words
    * and removes punctuation
    * @param fileName is the name of the file scanned from
    * @return returns true if scan was successful, false if fileName does not
    * exist in directory
    **/
  private static boolean saveWords( String fileName ) 
  {
    File in = new File( fileName );
    Scanner input = null;
    try
    {
      input = new Scanner( in );
    }
    catch ( IOException e )
    {
      System.out.println("File Not Found");
      return false;
    }
    input.useDelimiter("\",\"|\"");
    
    for ( int i = 0; input.hasNext(); i++ )
      words[ i ] = input.next();
    
    return true;
    
  }
  
  private static int generateWordValue(String word)
  {
    int value = 0;
    for (int i = 0; i<word.length(); i++)
      value += word.charAt(i)-64;
    return value;
  }
  
  
  private static boolean isTriangleNumber(int t)
  {
    if ( .5*(Math.sqrt(8*t+1)-1) % 1 == 0)
      return true;
    return false;
  }
}