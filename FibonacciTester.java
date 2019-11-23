/* This is a tester program for the APCSA Quarter 2 Homefun Fibonacci
  * Created by Kymberly Ayodeji
  * November 2019
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FibonacciTester
{
	public static void main(String[] args) throws FileNotFoundException
	{
		int[] ns = {12, 20, 29, 42};
		int[] ks = {9, 13, 22, 39};

		/* Take each students Fibonacci.java file location and add it to an array of Strings.
		    Run the Tester code for each students paper and print the results to a file resuts.txt
		*/



		//Construct PrintWrite objects
		String outputFile = "results.txt";
		PrintWriter out = new PrintWriter(outputFile);
		out.println(outputFile);
		out.println("This is the results from running Mrs. Ayodeji's FibonacciTester on your Fibonacci homefun.\n");

		for (int i = 0; i< ns.length; i++)
		{
			System.out.println("*********** Fibonacci Array of size n = "+ns[i] + " and k = " + ks[i]+". *******************");
			out.println("*********** Fibonacci Array of size n ="+ns[i] + " and k = " + ks[i]+". *******************");
			// Tests the students a) createFibonacci() method
			int[] Fibarray = Fibonacci.createFibonacci(ns[i]);
			out.println("\nThe Fibonacci Array of " + ns[i] + " elements has been created");
			out.println("\nThe first " + ks[i] + " elements of the Fibonacci Array is printed below");

			//Prints the students' Fibonacci array to outputFile
			for (int j=0; j< ks[i]; j++)
			{
					out.print(Fibarray[j] + ", ");
			}
			out.println("");
			 // Tests the students b) printFibonacci() method
			Fibonacci.printFibonacci(Fibarray, ks[i]);

			// Tests the students c) goldenratio() method by printing to reulsts and finding the mean and sd
			double[] GRarray = Fibonacci.goldenratio(Fibarray,ks[i]);
			out.println("\nThe Ratio Array of " + (ks[i]-1) + " elements has been created");
			out.println("\nThe first " +(ks[i]) + " elements of the Ratio Array is printed below");
			for (int j=0; j<GRarray.length; j++)
			{
				out.println(GRarray[j]);
			}
			out.printf("\nFor the Ratio array, the mean is %7.4f", theMean(GRarray));
			out.printf(" and the standard deviation is %7.4f", theSD(GRarray));
			out.println(". ");

			System.out.printf("\nFor the Ratio array, the mean is %7.4f", theMean(GRarray));
			System.out.printf(" and the standard deviation is %7.4f", theSD(GRarray));
			out.println(". ");

				// Tests the students d) compareSum() method
			out.print("\nComparing the sum of the first " + ks[i] + " elements to the result of F(" +(ks[i]+2) + ") - 1.  ");
			out.print( "The difference is  = " + Fibonacci.compareSum(Fibarray, ks[i]));
			out.println("\n\n\n");

			System.out.print("\nComparing the sum of the first " + ks[i] + " elements to the result of F(" +(ks[i]+2) + ") - 1. ");
			System.out.print( "The difference is  = " + Fibonacci.compareSum(Fibarray, ks[i]));
			System.out.println("\n");
		}
			out.println("\n\n\n");
			out.close();
	}

		public static double theMean(double[] arr)
		{
			double sum = 0;
			for (double entry : arr)
			{
					sum = sum + entry;
			}
			if (arr.length > 0)
				{
					return sum/arr.length;
				}
			else
			{
					return -99999;
			}
		}

		public static double theSD(double[] arr)
		{
				if (arr.length > 0)
				{
						double xbar = theMean(arr);
						double sum = 0;
						for (double entry : arr)
						{
								double diffsquared = Math.pow((xbar-entry),2);
								sum = sum + diffsquared;
							}
							return Math.pow(sum/(arr.length-1),0.5);
					}
				else
				{
						return -9999;
				}
		}

}
