import java.util.Arrays;
public class Problem38
{
  private static int[] products = new int[9],
    numsUsed = new int[9];
  private static int concatenatedProductLength;
  private static String largest = "0", temp = "";
  
  public static void main(String args[])
  {
    for ( int num = 1; num <= 9999; num++) //number to multiply by 1,2,3,etc
    {
      temp = ""; //intializes reusable data space 
      concatenatedProductLength = 0;//intializes reusable data space
      for (int i = 0; i<9; i++) //intializes reusable data space 
      {
        products[i] = 0;
        numsUsed[i] = 0;
      }
      
      /** 
       * products total length <= 9
       * every digit is found in oneToNine
       * 
       * */
      int multiplier = 1;
      while(true)
      {
        products[multiplier-1] = multiplier*num;//adds new product to products[]
        //gets length of newest product and adds to total length
        concatenatedProductLength  += 
          (int)(Math.log10(products[multiplier-1]) +1); 
        // if concated products are too long to be pandigital
        if (concatenatedProductLength > 9)
          break;
        /**
         * any digit == 0
         * any digit has been repeated with any previous products
         * */
        if ( !checkForZerosAndRepeats(multiplier))
          break;
        /**
         * concatenated products length == 9
         * save pandigital num and for testing print it with products
         * */
        if(concatenatedProductLength == 9)
        {
          //makes the array into the pandigital string
          for (int i = 0; i<multiplier; i++) 
            temp += String.valueOf(products[i]);
          // compares the possible largest pandigital to the largest known
          if (temp.compareTo(largest) > 0) 
            largest = temp;
         // printProducts(num, multiplier);
          break;
        }
        multiplier++;//moves while loop to next iteration
      }
    }
    System.out.println(largest + " is the largest 1 to 9 pandigital 9-digit n" +
                       "umber that can be formed as the concatenated product " +
                       "of an integer with (1,2, ... , n) where n > 1");
  }
  /**
   * any digit == 0
   * any digit has been repeated with any previous products
   * @retrun false if there are repeats or zeros in the digits in numsUsed[]
   * @return ture if there are no repeats
   * */
  private static boolean checkForZerosAndRepeats(int multipier)
  {
    int index = multipier-1; // because multiplier was one above index
    int num = products[index], digit;
    if (num == 0)
        return false;
    //breaks the num into individual digits
    for (int i = 10, j = 1; num/j>0; i*=10, j*=10)
    {
      digit = num%i/j;
      if (digit == 0)
        return false;
      int nUIndex = 0;
      while (numsUsed[nUIndex] != 0)
      {
        if (digit == numsUsed[nUIndex])
          return false;
        nUIndex++;
      }
      numsUsed[nUIndex] = digit;
    }
    return true;
  }
  
  /** prints the concatenated products and the multiplication done to get it
    * */
  private static void printProducts(int num, int multiplier)
  {
    for (int i = 0; i<multiplier; i++)
      System.out.print(products[i]);
    System.out.println();
    for (int i = 0; i<multiplier; i++) 
      System.out.println(num + " * " + (i+1) + " = " + products[i]);
  }
  
  
}
