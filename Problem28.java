public class Problem28
{
  public static void main(String args[])
  {
    int sum = 1;
    int f,g,h,l;
    for (int n = 2; n<=501; n++)
    {
      f = (2*n-1)*(2*n-1);
      g = f - 6*(n-1);
      h = g + 2*(n-1);
      l = f - 2*(n-1);
      
      sum = sum + f + g + h + l;
    }
    
    System.out.println(sum + " is the sum of the numbers on the diagonals in " +
                       "a 1001 by 1001 spiral formed with in array with incre" +
                       "asing values in a clockwise direction");
  }
}
