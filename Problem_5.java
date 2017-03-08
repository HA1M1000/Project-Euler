/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/
public class Problem_5
{
	public static void main(String args[])
	{
		int x = 1;
		int smallest = 0;
		boolean run = true;
		do
		{
			if(x%1 ==0 && x%2 ==0 && x%3 ==0 && x%4 ==0 && x%5 ==0 && x%6 ==0 && x%7 ==0 && x%8 ==0 && x%9 ==0 && x%10 ==0 && x%11 ==0 && x%12 ==0 && x%13 ==0 && x%14 ==0 && x%15 ==0 && x%16 ==0 && x%17 ==0 && x%18 ==0 && x%19 ==0)     //.... x%20 ==0)
			{
				smallest = x;
				run = false;
			}
			x++;
		}
		while(run);
		System.out.println(smallest);
	}
}