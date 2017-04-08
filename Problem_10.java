//Find the sum of all the primes below two million.
//Summation of primes
public class Problem_10
{
	public static void main(String args[])
	{
		Long max = 2000000L; //max being the limit number to go to 
		Long aneswer = 2L; //the number to check
	
		for(Long i = 2L; i< max; i++)
		{
			if(isPrime(i) == true)
			{
				aneswer = aneswer + i;
			}
		}
		System.out.println(aneswer);
	}
	
	public static boolean isPrime(Long n)
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