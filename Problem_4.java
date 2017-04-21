/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
*/

public class Problem_4
{
  public static void main(String args[])
  {
    int max = 100001;
    for (int i = 999 ; i >= 100 ; i--) 
    {
      if ( max >= i*999 )
      { 
		break;
      }
    
      for (int j = 999 ; j >= 100 ; j-- )
      {
        int p = i * j;
        if (max < p && PalindromeNumber(p) ) 
        {
          max = p;
        }
      }
    }
    System.out.println(max);
    
  }
  
  public static boolean PalindromeNumber(int x)
  {
    int num = x;
    int reverse = 0;

    // Compute the reverse
    while (num != 0) 
    {
        int y = num % 10;
        reverse = reverse * 10 + y;
        num = num / 10;
    }
    // The integer is palindrome if integer and reverse are equal
    return x == reverse; 
  }

}