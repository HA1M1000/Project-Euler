/*
The sum of the squares of the first ten natural numbers is, 385
The square of the sum of the first ten natural numbers is, 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/
public class Problem_6
{
	public static void main(String args[])
	{
		int num = 100, sum_x = 0, sum_y = 0;

		for(int i = 0; i <=num ; i++)
		{
			sum_x += Math.pow(i,2);
		}

		for(int i = 0; i <=num ; i++)
		{
			sum_y += i;
		}

		double sum_z = Math.pow(sum_y,2);
		int a = (int)sum_z;
		System.out.println(a-sum_x);
	}
}
