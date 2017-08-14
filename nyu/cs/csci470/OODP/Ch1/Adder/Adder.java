package edu.nyu.cs.csci470.OODP.Ch1.Adder;

/** 
	Class to add command line arguments
*/ 
public class  Adder
{
	/**
		Method to make an array of doubles from an array of Strings.
		@param args data inputed as String
		@return data data outputed as double
	*/
	public double [] toDouble (String[] args)
	{
		double [] data = new double[args.length];
		for (int i = 0; i < args.length ; i++)
			data[i] = Double.parseDouble(args[i]);	
		return data;
	}

	/** 
		Method to add an array of values.
		@param data values inputted 
	*/
	public double sum(double [] data)
	{
		double sum = 0;
		for (double number : data)
			sum += number;
		return sum;
	}

	public void main(String[] args)
	{
		double [] data = new double[args.length];
		data = toDouble(args);
		double sumTotal = sum(data);
		System.out.printf("The sum is %.3f%n", sumTotal);					
	}
	
	


}
