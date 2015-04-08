public class Problem47
{
  public static void main(String args[])
  {
    int factorCount = 0, consecutive = 0, prevFactor;
    for (int i = 0; ; i++)
    {
      //System.out.println( i + " ");
      prevFactor = 0;
      int fn;
      for (int n = i; (fn = factor(n))!=0; n/=fn)
      {
        
        //System.out.print(n + "/" +factor(n) + " ");
        if (fn != prevFactor)
          factorCount++;
        prevFactor = fn;
      }
      //System.out.println();
      
      if (factorCount == 4)
        consecutive++;
      else
        consecutive = 0;
      
      factorCount = 0;
      
      if (consecutive == 4)
      {
        System.out.println( (i-3) + " is the first of the first four consecut" +
                           "ive integers to have four distinct prime factors");
        break;
      }
    }
  }
  
  /** returns the lowest factor of n
    * @param the number in question
    * @retrun the lowest factor
    * */
  private static int factor(int n)
  {
    if (n == 1)
      return 0;
    for (int i=2; i<n; i++)
    {
      if (n%i==0)
        return i;
    }
    return n;
  }
}
