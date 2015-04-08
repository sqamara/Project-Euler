public class Problem45
{
  public static void main(String args[])
  {
    long hn;
    for (int n = 144; ; n++)
    {
      hn = n*(2*n-1);
      if (isPentagonal( hn ) )
      {
        System.out.println( hn + " is the next triangle number that is also p" +
                           "entagonal and hexagonal beyond 40755");
        break;
      }
    }
  }
  private static boolean isPentagonal( long z )
  {
    double h = (1 + Math.sqrt(24*z+1)) / 6;
    if (h%1 == 0)
      return true;
    return false;
  }
}