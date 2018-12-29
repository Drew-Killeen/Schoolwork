public class RanNumGen
{
	public static void main(String[] args)
	{
		// Declare variables, and convert input from string to integer.
		int num = Integer.parseInt(args[0]);
		int rand = 0;
		int min = 100;
		int max = 1;
		
		// For loop to generate the correct amount of random numbers.
		for(int i = 0; i < num; i++) {
			rand = (int)(Math.random() * 100) + 1;
			
			// Check if random number is new min.
			if(rand < min) {
				min = rand;
			}
			
			// Check if random number is new max.
			if(rand > max) {
				max = rand;
			}
			
			// If it is last random number, print number and then new line. Otherwise print number and then three spaces.
			if(i + 1 == num) {
				System.out.println(rand);
			}
			else {
				System.out.print(rand);
				System.out.print("   ");
			}
		}
		
		// Print min value.
		System.out.print("The minimum value is ");
		System.out.print(min);
		System.out.println(".");
		
		// Print max value.
		System.out.print("The maximum value is ");
		System.out.print(max);
		System.out.println(".");
	}
}