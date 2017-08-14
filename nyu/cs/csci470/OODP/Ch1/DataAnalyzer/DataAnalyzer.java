package edu.nyu.cs.csci470.OODP.Ch1.DataAnalyzer;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import edu.nyu.cs.csci470.OODP.Ch1.Adder.*;

/**
	Class that takes data as a string and stores it
*/
public class DataAnalyzer
{

	/**
		Constructor with arguments
	*/
	public DataAnalyzer(int control)
	{
		data = new ArrayList<Data>();
		BufferedReader bufferedReader = null;
		FileReader fileReader = null;

		try
		{
			fileReader = new FileReader(FILENAME);
			bufferedReader = new BufferedReader(fileReader);

			bufferedReader.readLine();

			String currentLine;

			while ((currentLine = bufferedReader.readLine())
					!= null)
			{
				String[] splitString = currentLine.split("\\s");

				Data dataIn = new Data();
				dataIn.setType1("period");
				dataIn.setData1(splitString[2]);
				dataIn.setType2("year");
				dataIn.setData2(splitString[3]);
				dataIn.setType3("temperature");
				dataIn.setData3(splitString[5]);

				data.add(dataIn);
			}

			for(Data dt: data){
				System.out.printf("%s: %s, %s: %d, %s: %f%n", dt.type1, dt.data1, dt.type2, dt.data2, dt.type3, dt.data3);
			}
//			length = args.length;
//			data = new double[length];
//			for (int i = 0; i < length; i++)
//				data[i] = Double.parseDouble(args[i]);
		}
		catch (IOException exception)
		{
			exception.printStackTrace();
		}
		finally
		{
			try
			{
				if (bufferedReader != null)
					bufferedReader.close();
				if (fileReader != null)
					fileReader.close();
			}
			catch (IOException exception)
			{
				exception.printStackTrace();
			}
		}

	}


	/**
		Method to find index of minimum value in data
		@return index.
	*/
	public int minimumIndex ()
	{
		double min = data.get(0).data3;
		int index = 0;
		for(int i = 1; i < data.size(); i++)
		{
			if (min > data.get(i).data3)
			{
				min = data.get(i).data3;
				index = i;
			}
		}
		return index;
	}
	
	/**
		Method to find the index of maximum value in data
		@return index.
	*/
	public int maximumIndex ()
	{
		double max = data.get(0).data3;
		int index = 0;
		for(int i = 1; i < data.size(); i++)
		{
			if (max < data.get(i).data3)
			{
				max = data.get(i).data3;
				index = i;
			}
		}
		return index;
	}
	
	/**
		Method that constructs an Adder object to take
		the average of a set of values		
	*/
	public double average ()
	{
		Adder addData = new Adder();

		double[] dataToArray = new double[data.size()];

		for(int i = 0; i < data.size(); i++)
			dataToArray[i] = data.get(i).data3;
		return addData.sum(dataToArray)/data.size();
	}

	public void minimumStats()
	{
		int index = minimumIndex();
		Data dt = data.get(index);
		System.out.printf("The minimum %s, happened in the %s of %s of the %s %d, and it was recorded as %.3f%n", dt.type3, dt.type1, dt.data1, dt.type2, dt.data2, dt.data3);
	}

	public void maximumStats()
	{
		int index = maximumIndex();
		Data dt = data.get(index);
		System.out.printf("The maximum %s, happened in the %s of %s of the %s %d, and it was recorded as %.3f%n", dt.type3, dt.type1, dt.data1, dt.type2, dt.data2, dt.data3);
	}


	private static final String FILENAME = "/Users/ricardodossantosalmei/Desktop/Development/DataFiles/oceansTemp.txt";

	ArrayList<Data> data;
}

/**
 *  Class to structure data that will be inputted through
 *	DataAnalyser
 */
class Data
{
	String type1;
	String type2;
	String type3;
	String data1;
	int data2;
	double data3;

	public void setType1(String in)
	{
		type1 = in;
	}

	public void setData1(String in)
	{
		data1 = in;
	}

	public void setType2(String in)
	{
		type2 = in;
	}

	public void setData2(String in)
	{
		data2 = Integer.parseInt(in);
	}

	public void setType3(String in)
	{
		type3 = in;
	}

	public void setData3(String in)
	{
		data3 = Double.parseDouble(in);
	}


}