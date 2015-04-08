public class Problem4
{
  public static void main(String args[])
  {
    int[] highestPal = new int[3];
    //poor naming here, highestPal[0] is the actual palindrome
    //highestPal[1] is one of the multipliers
    //highestPal[2] is the other multiplier
    for (int i = 999; i>0; i--)
    {
      for (int j = 999; j>0; j--)
      {
        if ( isPalindrome(Integer.toString(i*j)) && i*j > highestPal[0])
        {
          highestPal[0] = i*j;
          highestPal[1] = i;
          highestPal[2] = j;
        }
      }
    }
    /**
    System.out.println("The largest palindrome made from the product of two 3-digit numbers");
    System.out.println("is " + highestPal[0] + " = " + highestPal[1] + " * " + highestPal[2]);
    **/
    
    System.out.println(highestPal[0] + " is the largest palindrome made from "+
                       "the product of two 3-digit numbers");
  }
  
  public static boolean isPalindrome(String s)
  {
    for (int i = 0; i< s.length()/2; i++)
    {
      if (s.charAt(i) != s.charAt(s.length()-1-i))
        return false;
    }
    return true;
  }
}