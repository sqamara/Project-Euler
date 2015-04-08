public class Problem2
{
  public static void main(String args[])
  {
    int sum = 0;
    int next = 0, first = 1, second = 1;
    while((next = first+second) <=4000000)
    {
      if ( (next)%2 == 0 )
        sum += next;
      second = first;
      first = next;
    }
    
    System.out.println(sum + " is the sum of the even-valued terms in the "+
                       "Fibonacci sequence whose values do not exceed four "+
                       "million");
  }
}