public class Problem39
{
  public static void main(String args[])
  {
    //{a,b,c} a^2+b^2=c^2
    //solutions {a,b,c} == {b,a,c}
    
    double c;
    //the current found max number and number of solutions
    int maxVal = 0, maxSol = 0,
      //temporary counter used when any solutions are found
      tempCount = 0; 
    for ( int p=1; p<=1000; p++)//checks every possible peremeter within bounds
    {
      //cycles through possible a's
      for ( int a = 1; a< p/3; a++)
      {
        //cycles through possible b's
        for ( int b=p; b>=a; b--)
        {
          c = Math.sqrt(a*a+b*b);
          if (a+b+c == p)//if pythorean triple summed equals permiter count it
            tempCount++;
        }
      }
      if (tempCount > maxSol)//compare the counted and saved
      {
        maxVal = p;
        maxSol = tempCount;
      }
      tempCount = 0;
    }
    System.out.println(maxVal + " is the value of p <= 1000, for which the num" +
                       "ber of solutions is maximised if p is the perimeter o" +
                       "f a right angle triangle with integral length sides");
  }
}
