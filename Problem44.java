public class Problem44
{

  private static int[] pentagonalNumbers = new int[ 3000 ];
  
  
  public static void main(String args[])
  {
    for (int i = 1; i< 3000; i++)
      pentagonalNumbers[i] = i*(3*i-1)/2;
    
    for (int i = 1; i<3000; i++)
    {
      for (int j = i; j>0; j--)
      {
        
        if  (((1+Math.sqrt(1+24*(pentagonalNumbers[i]+pentagonalNumbers[j])))/6) % 1 == 0 && 
             ((1+Math.sqrt(1+24*(Math.abs(pentagonalNumbers[i]-pentagonalNumbers[j]))))/6) % 1 == 0 )
        {
          /**
          System.out.println("P(" + i + ") + P(" + j + ") = P(" + (1+Math.sqrt(1+24*(pentagonalNumbers[i]+pentagonalNumbers[j])))/6 + ")");
          System.out.println("P(" + i + ") - P(" + j + ") = P(" + (1+Math.sqrt(1+24*(Math.abs(pentagonalNumbers[i]-pentagonalNumbers[j]))))/6 + ")");
          **/
          System.out.println(Math.abs(pentagonalNumbers[i] - pentagonalNumbers[j]) + " is the minimised value of D, defined by D = |P(k) - P(j)| where P(k) and P(j) are pentagonal and thier their sum and difference are pentagonal"); 
          return;
        }
      }
    }
  }
}