public class Problem5
{
  public static final int DIVISIBLE_BY = 20; 
  public static void main(String args[])
  {
    int n = 0;
    boolean done = false;
    
    while (!done)
    {
      n += DIVISIBLE_BY;
      for (int i = DIVISIBLE_BY; i >= 0; i--)
      {
        if (i!=0 && n%i!=0)
          break;
        else if (i==0)
          done = true;
      }
    }
    System.out.println(n + " is the smallest positive number that is evenly "+
                       "divisible by all of the numbers from 1 to 20");
  }
}