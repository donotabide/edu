package edu.nyu.cs.csci470.OODP.Ch1.Ex10;

/**
	Class to test class Summer
*/
public class SummerTest
{
	public static void main(String[] args)
	{
		long start = Long.parseLong(args[0]);
		long end = Long.parseLong(args[1]);
		long step = Long.parseLong(args[2]);

		Summer aTest = new Summer();

		long sumTotal = aTest.sum(start, end, step);

		System.out.printf("\nThe sum of %d to %d skipping by %d is: %d%n%n", start, end, step, sumTotal);
	}	
}
