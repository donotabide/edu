package edu.nyu.cs.csci470.OODP.Ch1;

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
		Greet with "Sup" message.
		@return a message containing "Sup" and the name of person or entity being greeted.
	*/
	public String greet()
	{
		return "Sup, " + name + "!";
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
	
	/**
		Testing Greet
	*/
	public static void main(String[] args)
	{
		Greet greet1 = new Greet(args[0]);
		System.out.println(greet1.greet());
		System.out.println(greet1.sayGoodbye());
	}
	private String name;

}
