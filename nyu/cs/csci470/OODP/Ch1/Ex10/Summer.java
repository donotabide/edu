package edu.nyu.cs.csci470.OODP.Ch1.Ex10;

public class Summer
{	
	/**
		Constructor for Ex10	
	*/
	public Summer()
	{
	}

	/**
		Method to get the sum of a sequence that skips by a constant value.
		@param start number that starts sequence.
		@param end number that ends the sequence.
		@param step skip value.
		@return sumTotal sum of sequence
	*/	
	public long sum(long start, long end, long step)
	{
		long sumTotal = 0;
		if(start < end && step > 0)
		{
			for (; start <= end; start+=step)
				sumTotal += start;  
		}
		else if (start > end && step < 0)
		{
			for (; start >= end; start -= step)
				sumTotal += start;
		}
		
		return sumTotal; 			
	}
}
