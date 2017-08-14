package edu.nyu.cs.csci470.OODP.Ch1.Range;

/**
	Class that assists in the creation of random strings
*/
public class Range
{
	/**
		Method that gives the unicode of a character
		@param inChar character inputted
		@return uniInt integer as unicode
	*/
	public int toUnicode(char ch)
	{
		int uniInt = (int) ch;
		return	uniInt;
	}
	
	/** 
		Method that includes a range of character from unicode.
		@param a character one.
		@param b character two.
	
	*/
	public char [] range(char a, char b)
	{
		int length = Integer.toHexString(b)-Integer.toHexString(a);
		char [] giveRange = new char[length];
		for(int i = 0; i <= length; i++)
			giveRange[i] = Integer.toHexString(a)+i+FIX_TO_CHAR;					
		System.out.println(giveRange[0]+giveRange[3]);	
	}
	
	public static void main(String[] args)
	{
		addRange('a', 'b');
	}
	
	int FIX_TO_CHAR = 48;
}
