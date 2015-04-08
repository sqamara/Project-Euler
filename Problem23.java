import java.util.Arrays;
public class Problem23
{
  // intial starting size of names 
  private static int arraySize = 100;
  // member variable to save the scanned lines from a file of text
  private static int[] abundantNums = new int[ arraySize ];
  // member variable used when names needs to be extended
  private static int[] tempLinesOfText;
  
  public static void main(String args[])
  {
    
    int nextAbunNum = 0;
    boolean sumOfAbundant = false;
    //all the positive integers which cannot be written 
    //as the sum of two abundant numbers
    int sum = 0;
    // all integers greater than 28123 can be written as 
    // the sum of two abundant numbers
    for(int i = 0; i<=28123; i++)
    {
      
      if(sumProperDivisors(i) > 0)
      {
        if(nextAbunNum == arraySize)
          extendNumsArray();
        abundantNums[nextAbunNum] = i;
        nextAbunNum++;
      }
      sumOfAbundant = false;
      search: for (int a1 = 0; a1<nextAbunNum; a1++)
      {
        for (int a2 = 0; a2<nextAbunNum; a2++)
        {
          if (abundantNums[a1]+abundantNums[a2] == i)
          {
            sumOfAbundant = true;
            break search;
          }   
        }
      }
      if(sumOfAbundant == false)
        sum+=i;
    }
    System.out.println(sum + " is the sum of all the positive integers which "+
                       "cannot be written as the sum of two abundant numbers");
  }
  /** returns a number that represents if a number is perfect,
    * deficient or abundant
    * @param the number in question
    * @return 0 if perfect 
    * @return a negative int if deficient
    * @return a positive if abundant
    * */
  public static int sumProperDivisors(int i)
  {
    int sum = 0;
    for(int n = 1; n <= (int)(Math.sqrt(i)); n++)
    {
      if (i%n == 0)
      {
        sum+=n;
        if(i/n != i && i/n != n)
          sum+=i/n;
      }
    }
    return sum-i;   
  }
  
  private static void extendNumsArray()
  {
    tempLinesOfText = abundantNums;
    arraySize += 100;
    abundantNums = new int[ arraySize ];
    
    for ( int i = 0; i < tempLinesOfText.length; i++ )
      abundantNums[i] = tempLinesOfText[i];
  }
}