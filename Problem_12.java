/*
What is the value of the first triangle number to have over five hundred divisors?
*/
import java.math.*;
public class Problem_12 //Highly divisible triangular number
{
  public static void main(String args[])
  {
    int numDivisors = 0;
    int triangleNum = 0;
    int count = 0;
    
    while(numDivisors <= 500)
    {
      numDivisors = 0;
      count++;
      triangleNum += count;
      
      for(int i = 1; i <= Math.sqrt(triangleNum); i++) // find no. divisors
      {
        if(triangleNum % i == 0) // only prime no. added to divisors
        {
          numDivisors += 2;
        }
      }

    }
    	System.out.println(triangleNum);
  }
}