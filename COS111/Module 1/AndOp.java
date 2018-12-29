public class AndOp
{
	public static void main(String[] args)
	{
		// Convert inputs from string to double.
		double input1 = Double.parseDouble(args[0]);
		double input2 = Double.parseDouble(args[1]);
		
		// Check if inputs are strictly between 0 and 1, and print result.
		if((input1 > 0 && input1 < 1) && (input2 > 0 && input2 < 1)) 
		{
			System.out.println("true");
		}
		else 
		{
			System.out.println("false");
		}
	}
}