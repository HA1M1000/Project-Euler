/*
Find the sum of the digits in the number 100!
*/

import java.math.*;
public class Problem_20 //Factorial digit sum
{
  public static void main(String args[])
  {
    int num = 100;
    
    BigInteger factorial = recursive(num);
    BigInteger sum = BigInteger.ZERO;
 
    while(factorial.compareTo(BigInteger.ZERO) > 0)
    {
		sum = sum.add(factorial.mod(BigInteger.TEN));
		factorial = factorial.divide(BigInteger.TEN);
	}
	System.out.println(sum);
    
  }
  
  public static BigInteger recursive(int x)
  {
    if(x == 1)
    {
      return BigInteger.ONE;
    }
    else
    {
      return recursive(x-1).multiply(BigInteger.valueOf(x));
    }
  }
}