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