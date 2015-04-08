import java.util.*;
import java.io.*;

public class Problem22
{
  // intial starting size of names 
  private static int arraySize = 100;
  // member variable to save the scanned lines from a file of text
  private static String[] names = new String[ arraySize ];
  // member variable used when names needs to be extended
  private static String[] tempLinesOfText;
  
  public static void main(String args[])
  {
    saveNames("names.txt");

    Arrays.sort(names, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if (o1 == null && o2 == null) 
        {
          return 0;
        }
        if (o1 == null) 
        {
          return 1;
        }
        if (o2 == null) 
        {
          return -1;
        }
        return o1.compareTo(o2);
      }
    });
    
    int totalScore = 0;
    for(int i = 0; names[i] != null; i++)
    {
      totalScore += generateScoreMultiplier(names[i])*(i+1);
    }
    
    System.out.println(totalScore+" is the total of all the name scores in the file");
  }
  
  /** scans and saves each line of text of a file to the String array names
    * and removes punctuation
    * @param fileName is the name of the file scanned from
    * @return returns true if scan was successful, and false if fileName does not
    * exist in directory
    **/
  private static boolean saveNames( String fileName ) 
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
    {
      if ( i == names.length )
        extendNamesArray();
      names[ i ] = input.next();
    }
    
    return true;
    
  }
  /** prints the names 
    * */
  private static void printNames()
  {
    for(int i = 0; i<names.length; i++)
    {
      if(names[i] != null)
        System.out.println(names[i]);
    }
  }
  
  /** when the array is too small to accomodate the number of lines, this method
    * is called to is extended names 100 elements to accomodate. 
    * tempLinesOfText takes holds the array list while names is made to be 
    * a new array 100 elements larger, then all values of tempLinesOfText are 
    * placed into names
    * */
  private static void extendNamesArray()
  {
    tempLinesOfText = names;
    arraySize += 100;
    names = new String[ arraySize ];
    
    for ( int i = 0; i < tempLinesOfText.length; i++ )
      names[i] = tempLinesOfText[i];
  }
  
  
  //to obtain a name score, take the alphabetical value for each name and
  //multiply this value by its alphabetical position in the list
  private static int generateScoreMultiplier(String name)
  {
    int multiplier = 0;
    for (int i = 0; i<name.length(); i++)
    {
      multiplier += name.charAt(i)-64;
    }
    return multiplier;
  }
  
  
}