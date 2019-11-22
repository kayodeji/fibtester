/** This is a solution to the Fibonacci HF writted by Mrs. Ayodeji */
public class Fibonacci
{
/*	
	public static void main(String[] args)
	{
		int[] ns = {12, 20, 29, 42};
		int[] ks = {9, 13, 22, 39};

		for (int i = 0; i< ns.length; i++)
		{
			int[] Fibarray = createFibonacci(ns[i]);
			System.out.println("\nThe Fibonacci Array of " + ns[i] + " elements has been created");
			System.out.println("\nThe first " + ks[i] + " elements of the Fibonacci Array is printed below");
			printFibonacci(Fibarray, ks[i]);
			double[] GRarray = goldenratio(Fibarray,ks[i]);
			System.out.println("\nThe Ratio Array of " + (ks[i]-1) + " elements has been created");
			System.out.println("\nThe first " + (ks[i]-1) + " elements of the Ratio Array is printed below");
			for (int j=0; j< GRarray.length; j++)
			{
				System.out.println(GRarray[j]);
			}
			System.out.println("\nComparing the sum of the first " + ks[i] + " elements to the result of " + (ks[i]+2) + " - 1.");
			System.out.print( " = " + compareSum(Fibarray, ks[i]));
			System.out.println("\n\n\n");
		}
	}
	*/
	
	/* Creates a array of the first n elements of the fibonacci sequence 
	@param n the size of the array and the number of elements of the Fibonacci sequence
	@result an array of the first n elements of the Fibonacci sequence
	*/
	public static int[] createFibonacci(int n)
	{
		if (n>5)
		{
			int[] arr = new int[n];
			arr[0] = 1;
			arr[1] = 1;
			
			for (int i = 2; i < n; i++)
			{	
				arr[i] = arr[i-1] + arr[i-2];
			}
			
			return arr;
		}
		else 
		{
			int[] arr = {0};
			return arr;
		}
	}
	/* Prints the first k elements of the Fibonacci Sequence
	@param a An array of Fibonacci elements
	@param k the number of elements to be printed (must be less than the length of a)
	*/
	public static void printFibonacci(int[] a, int k)
	{
		if (k <a.length){
			for (int i = 0; i < k; i++)
			{
				System.out.print(a[i]+", ");
			}
		}
		else 
		{
			System.out.println("The inputted " + k + " is larger than the size of the Fiboncci array.");
		}
	}
	
	/* Gives a ratio of consecutive Fibonacci numbers 
	@param a an array of integers from the Fibonacci sequence
	@param k the number of ratios to compute
	@return an array of the results of k consecutive Fibonacci number ratios
	*/
	public static double[] goldenratio(int[] a, int k)
	{
		if (k < a.length)
		{
			double[] ratios = new double[k];
			for (int i=0; i<k; i++)
			{
				double temp1 = a[i];
				double temp2 = a[i+1];
				ratios[i] = temp2/temp1;
			}
			return ratios;
		}
		else
		{
			double[] empty = {0.0};
			return empty;
		}
	}
	
	/* Compares the sum of the first k terms of the Fibonacci Sequence to f(k+2)-1
	@param a an array of integers from the Fibonacci sequence
	@param k the number of Fibonacci numbers to sum
	@return the result of taking the difference of the sum of the first k+1 elements of the Fibonacci sequence and the k+2 elements
	*/
	public static int compareSum(int[] a, int k)
	{
		if (k < a.length)
		{
			int sum = 0;
			for (int i = 0; i<=k; i++)
			{
				sum = sum + a[i];
			}
			
			return a[k+2]-1 - sum;
		}
		else
		{
			return -999;
		}
	}
	
	
	
}		
			