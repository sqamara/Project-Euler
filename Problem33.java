public class Problem33
{
  public static void main(String args[])
  {
    String numerator = "", denominator = "";
    double fraction;
    int finalNum = 1, finalDenom = 1;
    for ( int i = 1; i<=9; i++ )
    {
      for ( int a = 1; a <=9 ; a++ )
      {
        for ( int b = 1; b <= 9; b++ )
        {
          if ( a == b )
            continue;
          //for fractions ai/ib
          numerator = String.valueOf(a) + String.valueOf(i);
          denominator = String.valueOf(i) + String.valueOf(b);
          fraction = (double) Integer.valueOf(numerator) / Integer.valueOf(denominator);
          if ( fraction == (double) a/b )
          {
            //System.out.println(numerator + "/" + denominator + " == " + a + "/" + b);
            finalNum *= Integer.valueOf(numerator);
            finalDenom *= Integer.valueOf(denominator);
          }
          //for fractions ia/bi ?????
          /** not part of problem
            numerator = String.valueOf(i) + String.valueOf(a);
            denominator = String.valueOf(b) + String.valueOf(i);
            fraction = (double) Integer.valueOf(numerator) / Integer.valueOf(denominator);
            if ( fraction == (double) a/b )
            System.out.println(numerator + "/" + denominator + " == " + a + "/" + b);
            **/
        }
      }
    }
    //System.out.println(finalNum + "/" + finalDenom);
    System.out.println( finalDenom/gcd(finalNum, finalDenom) + " is the value" +
                       " of the denominator, of the product of non-trivialy r" +
                       "educed fractions, less than one in value, and contain" +
                       "ing two digits in the numerator and denominator, in i" +
                       "ts lowest common terms");  
  }
  
  private static int gcd(int m, int n)
  {
    int remainder = 0;
    while (n != 0)
    {
      remainder = m%n;
      m = n;
      n = remainder;
    }
    return m;
  }
}