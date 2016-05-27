package cse360assign2;

public class Analytics extends OrderedIntList 
{
	/** Calculator the mean of the array */
	public double mean()
	{
		// create the mean value
		double meanOfList = 0;
		// set the mean value to 0 if the array is empty
		if (count == 0) 
		{
			meanOfList = 0;
		}
		else
		{
			double sum = 0;
			for (int index = 0; index < count; index++)
			{
				sum += array[index];
			}
			// mean value is sum divided by the number of elements in the array
			meanOfList = sum / count;
		}
		// return the mean value
		return meanOfList;
	}
	
	/** Calculator the median value of the array */
	public int median()
	{
		// create the median value
		int medianOfList = 0;
		// set the median value to 0 if the array is empty
		if (count == 0) 
		{
			medianOfList = 0;
		}
		else
		{
			// create a middle value
			int middle = count / 2;
			if (count % 2 == 1) {
				medianOfList = array[middle];
			}
			else {
				medianOfList = (array[middle - 1] + array[middle]) / 2;
			}
		}
		// return the mean value
		return medianOfList;
	}
	
	/** Calculator the maximum value of the array */
	public int high()
	{
		// create the maximum value
		int maxOfList = 0;
		// set the maximum value to 0 if the array is empty
		if (count == 0) 
		{
			maxOfList = 0;
		}
		else
		{
			// set the maximum value as the first element of the array
			maxOfList = array[0];
			for (int index = 0; index < count; index++)
			{
				if (array[index] > maxOfList) {
					maxOfList = array[index];
				}
			}
		}
		//return the maximum value
		return maxOfList;
	}
	
	/** Calculator the minimum value of the array */
	public int low()
	{
		// create the minimum value
		int minOfList = 0;
		// set the minimum value to 0 if the array is empty
		if (count == 0) 
		{
			minOfList = 0;
		}
		else
		{
			// set the minimum value as the first element of the array
			minOfList = array[0];
			for (int index = 0; index < count; index++)
			{
				if (array[index] < minOfList) {
					minOfList = array[index];
				}
			}
		}
		//return the minimum value
		return minOfList;
	}
	
	/** Calculator the number of the integers in the array */
	public int numInts()
	{
		// create the number of the integers
		int numOfIntegers = 0;
		// set the number of integers to 0 if the array is empty
		if (count == 0) 
		{
			numOfIntegers = 0;
		}
		else
		{
			for (int index = 0; index < count; index++)
			{
				if (array[index] % 1 == 0) {
					numOfIntegers = numOfIntegers + 1;
				}
			}
		}
		// return the number of integers
		return numOfIntegers;
	}
}
