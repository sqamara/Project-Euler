public class Problem6
{
  public static void main(String[] args)
  {
    int nTerms = 100;
    int sumOfSquares = 0,sum = 0;
    for (int i = 1; i<=nTerms; i++)
    {
      sumOfSquares += i*i;
      sum += i;
    }
    
    int squareOfSum = sum*sum;
    int difference = squareOfSum-sumOfSquares;
    /**
    System.out.println("the difference between the sum of the squares of the first");
    System.out.println( nTerms +" natural numbers and the square of the sum is:");
    System.out.println(squareOfSum + " - " + sumOfSquares + " = " + difference);
    **/
    System.out.println(difference + " is the difference between the sum of the" +
                       " squares of the first one hundred natural numbers and" +
                       " the square of the sum");
  }
}
    
    
    