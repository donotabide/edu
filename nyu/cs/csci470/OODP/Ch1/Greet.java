package edu.nyu.cs.csci470.OODP.Ch1;


import java.lang.*;
import java.util.*;


/**
	Class for creating regular greetings
*/

public class Greet{
	/**
 		 Constructs Greet for informally greeting person or entity.
		 @param nameIn name of person or entity who will be informally greeted.
	*/ 
	public Greet(String nameIn)
	{
		name = nameIn; 		
	}

	/** 
		Method that tries to copy the lenght of the name
		@para size tries to pass an integer as parameter to be changed by reference. 
	*/
	public void copyLengthTo(int size)
	{
		size = name.length();	
	}

	/** 
		Method that tries to object Greet to other.
		@param other other Greet object that is tried to be set as current Greet object.
	*/
	public void copyGreetTo(Greet other)
	{
		other =  new Greet(name);
	} 

	/**
		Greet with "Sup" message.
		@return a message containing "Sup" and the name of person or entity being greeted.
	*/
	public String greet()
	{
		return "Sup, " + name + "!";
	}
	
	/**
		Methods that uses a random generator to either say "Hello" or "Goodbye".
		@return string 
	*/	
	public String saySomething()
	{
		if (generateRandom.nextBoolean())
			return "Sup, " + name + "!";
		else 
			return "Later, " + name + "!";
	}

	/**
		Sets a new name for entity being greeted.
		@param name new name for greeter
	*/	
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
		Sets another greeter's name to current greeter's name.
		@param other is a reference to the other greeter.
	*/
	public void copyNameTo(Greet other)
	{
		other.name = this.name;
	}

	/** 
		Sets current greeter's name to another greeter name.
		@param other is a reference to the other greeter.
	*/
	public void copyName(Greet other)
	{
		this.name = other.name;
	}
		
	/**
		Says goodbye to entity.
		@param name is a reference to the name.		
	*/
	public String sayGoodbye()
	{
		return "Goodbye, "+name; 	
	}
	
	public long retLongSqrt(float number)
	{
		return Math.round(Math.sqrt(number));	
	}
	
	/**
		Method that sets Greet to null
		@param GreetObj
	*/	
	public void greetNull(Greet obj)
	{
		obj = null;
	}

	/**
		Testing Greet
	*/
	public static void main(String[] args)
	{
		Greet greet1 = new Greet(args[0]);
				
		System.out.println(greet1.greet());
		System.out.println(greet1.sayGoodbye());
		System.out.println(greet1.saySomething());
	
		Greet greet2 = greet1;
		greet2.setName(args[2]);
		System.out.println(greet2.greet());
		System.out.println(greet1.greet());			
		//greet1 = null;

		System.out.println(greet1.greet());
		
		int size = 0;
		System.out.println("Size before: "+size);
		greet1.copyLengthTo(size);
		System.out.println("Size after: "+size);
		
		Greet greet3;
		greet1.copyGreetTo(greet3);
		System.out.println("Name 3: "+greet3.saySomething()); 
	}

	private String name;
	private static Random generateRandom = new Random();
	

}
