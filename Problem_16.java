/*
What is the sum of the digits of the number 2^1000?
*/

import java.math.*;
public class Problem_16 //Power digit sum
{
  public static void main(String args[])
  {
    BigInteger x = new BigInteger("2");
    int y = 1000;
    
    BigInteger num = x.pow(y);
    BigInteger sum = BigInteger.ZERO;
    
    while(num.compareTo(BigInteger.ZERO) > 0)
    {
      sum = sum.add(num.mod(BigInteger.TEN));
      num = num.divide(BigInteger.TEN);
    }
    System.out.println(sum);
  }
}