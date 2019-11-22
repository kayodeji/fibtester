/* This is a tester program for the APCSA Quarter 2 Homefun Fibonacci 
  * Created by Kymberly Ayodeji
  * November 2019
 */

public class FibonacciTester
{
	public static void main(String[] args)
	{
		int[] ns = {12, 20, 29, 42};
		int[] ks = {9, 13, 22, 39};

		for (int i = 0; i< ns.length; i++)
		{
			int[] Fibarray = Fibonacci.createFibonacci(ns[i]);
			System.out.println("\nThe Fibonacci Array of " + ns[i] + " elements has been created");
			System.out.println("\nThe first " + ks[i] + " elements of the Fibonacci Array is printed below");
			Fibonacci.printFibonacci(Fibarray, ks[i]);
			double[] GRarray = Fibonacci.goldenratio(Fibarray,ks[i]);
			System.out.println("\nThe Ratio Array of " + (ks[i]-1) + " elements has been created");
			System.out.println("\nThe first " +(ks[i]-1) + " elements of the Ratio Array is printed below");
			for (int j=0; j<GRarray.length; j++)
			{
				System.out.println(GRarray[j]);
			}
			System.out.println("\nComparing the sum of the first " + ks[i] + " elements to the result of " +(ks[i]-1) + " - 1.");
			System.out.print( " = " + Fibonacci.compareSum(Fibarray, ks[i]));
			System.out.println("\n\n\n");
		}
	}
	
}
			
		     
			
		