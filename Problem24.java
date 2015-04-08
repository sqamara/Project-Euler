public class Problem24
{
  final static int TO_FIND = 1000000;
  public static void main(String args[])
  {
    String toReturn = "";
    int start = 1;
    int[] remainingNums = new int[10];
    for (int i = 0; i<10; i++)
      remainingNums[i] = i;
      
    //cycles through each of the place holders
    for (int places = 0; places<10; places++)
    {
      int toAdd = factorial(9 - places);
      //cycles through the potential nums to fill the place
      for ( int i = 0; i < 10; i++ )
      {
        if ( remainingNums[i] < 0 )
          continue;
        else if ( start + toAdd > TO_FIND)
        {
          toReturn += String.valueOf( remainingNums[i] );
          remainingNums[i] = -1;
          break;
        }
        else
          start += toAdd;
      }
    }
    System.out.println(toReturn + " is the millionth lexicographic permutation"+
                       " of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9");
  }
  
  private static int factorial(int i)
  {
    if ( i == 1 || i == 0)
      return 1;
    return i*factorial(i-1);
  }
  

  
}