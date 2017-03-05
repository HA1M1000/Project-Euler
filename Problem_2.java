public class Problem_2
{
    public static void main(String[] args)
    {
    	int sum = 2;
    	int i = 2;

    	int array[] = new int[50];
		array[0] = 1;
		array[1] = 2;

		while(true)
		{
			array[i] = array[i-1] + array[i-2];
			if(array[i]>4000000)break;
			if(array[i]%2==0)
			{
				sum+=array[i];
			}
			i++;
		}
		System.out.println(sum);

    }
}