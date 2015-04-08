

public class Problem31a
{
  final static double 
    ONE_PENCE = .01,
    TWO_PENCE = .02,
    FIVE_PENCE = .05,
    TEN_PENCE = .1,
    TWENTY_PENCE = .2,
    FIFTY_PENCE = .5,
    ONE_POUND = 1,
    TWO_POUNDS = 2;
  
  final static double TO_ACHIEVE = 2;
  
  public static void main(String args[])
  {
    System.out.println(expressionInSmallerCoin(TEN_PENCE));
  }
  
  
  
  private static int expressionInSmallerCoin( double toGet )
  {
    if ( toGet == ONE_PENCE )
      return 1;
    int toReturn = 1;
    double sum = 0;
    double coin = toGet;
    while (sum < toGet)
    {
      if (sum + nextSmallestCoin(coin) > toGet)
        coin = nextSmallestCoin(coin);
      else 
      {
        sum += nextSmallestCoin(coin);
        toReturn *= expressionInSmallerCoin(nextSmallestCoin(coin));
      }
    }
    return toReturn + 1;
  }
  
  private static double nextSmallestCoin( double coin )
  {
    if ( coin == TWO_POUNDS) 
      return ONE_POUND;
    else if ( coin ==  ONE_POUND)
      return FIFTY_PENCE;
    else if ( coin ==  FIFTY_PENCE) 
      return TWENTY_PENCE;
    else if ( coin ==  TWENTY_PENCE) 
      return TEN_PENCE;
    else if ( coin ==  TEN_PENCE) 
      return FIVE_PENCE;
    else if ( coin ==  FIVE_PENCE) 
      return TWO_PENCE;
    else if ( coin ==  TWO_PENCE) 
      return ONE_PENCE;
    else 
      return -1; //for invalid coin type 
  }
}