/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/
import java.util.*;
public class Problem_9
{
  public static void main(String args[])
  {
    int num = 0;
    int sum = 1000;
    for(int i = 0; i <= sum; i++)
    {
      for(int j = 0; j <= sum; j++)
      {
        for(int k = 0; k <= sum; k++)
        {
          if(i < j && j < k && i + j + k == sum && (k * k == i * i + j * j))
          {
            num = i*j*k;
          }
        }
      }
    }
    System.out.println(num);
  }
}