public class LC
{
	public static void main(String[] args)
	{
		// Loop through all integers from 1 to 100.
		for(int i = 1; i <= 100; i++) 
		{
			System.out.print(i);
			System.out.print(" ");
			
			// If integer is divisible by ten, print new line.
			if(i % 10 == 0)
			{
				System.out.print("\n");
			}
		}
	}
}