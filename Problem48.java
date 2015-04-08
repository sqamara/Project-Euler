import java.math.BigInteger;
public class Problem48
{
  public static void main(String[] args)
  {
    BigInteger n = new BigInteger("0");
    for (int i = 1; i<=1000; i++)
    {
      BigInteger toAdd = new BigInteger(Integer.toString(i));
      toAdd = toAdd.pow(i);
      n = n.add(toAdd);
    }
    String ans = String.valueOf(n);
    System .out.println(ans.substring(ans.length()-10) + " are the last ten d" +
                        "igits of the serries 1^1 + 2^2 + 3^3 + ... + 1000^10" +                        "00");
  }
}
