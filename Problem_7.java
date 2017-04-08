/*
10001st prime

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
*/

public class Problem_7
{	
	public static void main(String... args) 
	{
		int num = 2; //the number to check
		int counter = 1; //counter of numbers have been found so far

		while (true) 
		{

		   if(isPrime(num))
		   {
			   counter++;
		   }

			//if counter == 10001 we have found the 10001
			if (counter == 10001) 
			{
				System.out.println(num);
				break;
			}
			num++;
		}
	}
	
	public static boolean isPrime(int n)
	{
		//check if n is a multiple of 2
    	if (n%2==0) return false;
    	//if not, then just check the odds
    	for(int i=3;i*i<=n;i+=2)
    	{
        	if(n%i==0)
            return false;
    	}
    	return true;
	}
}
