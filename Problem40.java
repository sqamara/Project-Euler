public class Problem40
{
  public static void main(String args[])
  {
    /**
     for (int i = 0; i<7; i++)
     System.out.println(findDigitInChampernone((int)Math.pow(10,i)));
     **/
    
    int product = 1;
    for (int p = 0; p<7; p++)
      product *= findDigitInChampernone((int)Math.pow(10,p));
    System.out.println(product + " is the product of d1 x d10 x d100 x d1000 " +
                       "x d10000 x d100000 x d1000000, if dn represents the n" +
                       "th digit of the fractional part of Champernowne's con" +
                       "stant");
    
  }
  
  /** finds the dth digit in Champernowne's constant under 5,888,889
    * @param the dth digit to find
    * @return the dth digit, -1 if digit cannot be found
    * */
  private static int findDigitInChampernone(int d)
  {
    double digitFrac = 0;
    if (d < 1 || d > 5888889)
      return -1;
    else if (d < 10)
    {
      digitFrac =  (d-0)/1. + 0;
      return (int)digitFrac;
    }
    else if (d < 190)
    {
      digitFrac =  (d-9)/2. + 9 +1;
      return Integer.valueOf(String.valueOf(digitFrac)
                               .substring((int) (digitFrac%1*2-1+.5), 
                                          (int) (digitFrac%1*2+.5)));
    }
    else if (d < 2890)
    {
      digitFrac =  (d-189)/3. + 99 +1;
      return Integer.valueOf(String.valueOf(digitFrac)
                               .substring((int) (digitFrac%1*3-1+.5),
                                          (int) (digitFrac%1*3+.5)));
    }
    else if (d < 38890)
    {
      digitFrac =  (d-2889)/4. + 999+1;
      return Integer.valueOf(String.valueOf(digitFrac)
                               .substring((int) (digitFrac%1*4-1+.5),
                                          (int) (digitFrac%1*4+.5)));
    }
    else if (d < 488890)
    {
      digitFrac = (d-38889)/5. + 9999+1;
      return Integer.valueOf(String.valueOf(digitFrac)
                               .substring((int) (digitFrac%1*5-1+.5),
                                          (int) (digitFrac%1*5+.5)));
    }
    else if (d < 5888890)
    {
      digitFrac =  (d-488889)/6. + 99999+1;
      return Integer.valueOf(String.valueOf(digitFrac)
                               .substring((int) (digitFrac%1*6-1+.5),
                                          (int) (digitFrac%1*6+.5)));
    }
    return -1;
  }
}