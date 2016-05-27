package cse360assign2;

import java.util.*;

public class TestAnalytics 
{
	public static void main(String arg[])
	{
		// create a scan value to read the user input
		Scanner scan = new Scanner(System.in);
		// create a object analytics
		Analytics analytics = new Analytics();
		
		System.out.println("**********Simple Calculator of data***********");
		
		do
		{
			System.out.print("Enter an value: ");
			// read the user input
			int input = scan.nextInt();
			// store the input to the array list
			analytics.insert(input);
		} while(scan.hasNextInt());
		// loop will end if user not input an integer
		
		// print all the inputs
		analytics.print();
		// print the mean of the inputs
		System.out.print("\nMean Value of the Array: " + analytics.mean());
		// print the median of the inputs
		System.out.print("\nMedian Value of the Array: " + analytics.median());
		// print the high value of the inputs
		System.out.print("\nHigh Value of the Array: " + analytics.high());
		// print the low value of the inputs
		System.out.print("\nLow Value of the Array: " + analytics.low());
		// print the number of integers in the array
		System.out.print("\nNumber of the Integers in the Array: " + analytics.numInts());
	}
}
