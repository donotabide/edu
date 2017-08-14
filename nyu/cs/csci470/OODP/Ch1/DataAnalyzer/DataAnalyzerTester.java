package edu.nyu.cs.csci470.OODP.Ch1.DataAnalyzer;

/**
	Class to test DataAnalyzer
*/

public class DataAnalyzerTester
{
	public static void main(String[] args)
	{
		DataAnalyzer dataTest = new DataAnalyzer(Integer.parseInt(args[0]));
		double average = dataTest.average();
		dataTest.minimumStats();
		dataTest.maximumStats();
		System.out.printf("Average: %.3f%n", average);
	}


}


