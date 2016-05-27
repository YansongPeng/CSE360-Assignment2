package cse360assign2;

import java.util.*;

/** Ordered list of up to 10 or more integers
 * @author Yansong Peng	
 * 			Pin: 39
 * @version May 18, 2016
 * 
 */
public class OrderedIntList 
{
	private int[] array;  
	private int count;
	
	/** Create an empty list */
	OrderedIntList()
	{
		//initialization
		array = new int[10];
		count = 0;
	}
	
	/** Insert unique integer 
	 *  @param value	integer added to array
	 */
	public void insert(int value) 
	{
		//call the grow function
		if(count == array.length) 
			grow();
		
		if(count == 0)
		{
			array[0]= value;
			count = count + 1;
		}
		else 
		{
			int insertIndex = 0;
			
			//find insert location
			for (int index = 0; index < count && value > array[index]; index++)
			{
				insertIndex = insertIndex + 1;
			}
			//do nothing if insertIndex is larger than array
			if (insertIndex < array.length && array[insertIndex] != value)
			{
				//shift memory
				int startIndex = count > array.length - 1 ? array.length - 1 : count; //the largest index to shift is the last position
				for (int index = startIndex; index > insertIndex; index--)
				{
					array[index] = array[index - 1];
				}
				
				//store data
				array[insertIndex] = value;
				
				//increment count
				count = count + 1;
			}
		}
	}			
	
	/** Grow the array */
	protected void grow()
	{
		//expand the array
		int []growIndex = new int[count * 2];
		for (int index = 0; index < count; index++)
			growIndex[index] = array[index];
		array = growIndex;
	}
	
	/** Displays the list */
	public void print() 
	{
		for (int index = 0; index < count; index++) 
		{
			if (index % 5 == 0) { 
				System.out.println();
			}
			System.out.print(array[index] + "\t");	
		}
		System.out.println();
	}

	private boolean debugging()
	{
		boolean debug = true;
		if (debug) {
			return true;
		}
		return false;
	}
}