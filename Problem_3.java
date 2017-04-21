/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143?
*/
import java.util.*;
public class Problem_3 //Largest prime factor
{
	public static void main(String args[])
	{
		//int a[] = new int [];
		ArrayList<Integer> a = new ArrayList<Integer>();
		int pos = 0;
		int Original_num = 13195;
	//	long Original_num = 600851475143L;
		long num = Original_num/2;

		for(int i = 2; i < num; i++)
		{
			if(isPrime(i) == true)
			{
				//a[pos]= i;
				a.add(i);
				pos++;
			}
		}
		//for(int i =0; i <= a.length-1; i++)
		int size = a.size();
	  	for(int i = 0; i < size; i++)
		{
			//if(13195%a[i] == 0)
			int z = a.get(i);
		    if((13195%z) == 0 && z!=0)
			{
				System.out.println(a.get(i) + " ");
			}
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