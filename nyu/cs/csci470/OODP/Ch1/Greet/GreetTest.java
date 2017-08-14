package edu.nyu.cs.csci470.OODP.Ch1.Greet;

public class GreetTest
{	
	/**
		@param args unused
	*/
	public static void main(String[] args)
	{
		Greet greetWorld = new Greet("World");
		String greeting = greetWorld.greet();
		System.out.println(greeting);
		
		Greet moreGreet = greetWorld;
		String moreGreeting = moreGreet.greet();
		System.out.println(moreGreeting);
		
		greetWorld.setName("Jos\u00E9 \u03A0 \u3076 \u0346 \u0743");
		System.out.println(greetWorld.greet());
		System.out.println(moreGreet.greet());
			
		Greet moreGreet2 = new Greet("Guys");
		System.out.println(moreGreet2.greet());
		System.out.println(greetWorld.greet());
		greetWorld.copyName(moreGreet2);
		System.out.println(greetWorld.greet());
		
		System.out.println(greetWorld.sayGoodbye());
		System.out.println(moreGreet.sayGoodbye());
		System.out.println(moreGreet2.sayGoodbye());
		
		// Ex17
		Greet ex17a = new Greet(args[0]);
		Greet ex17b = new Greet(args[1]);
		System.out.println(ex17a.saySomething());
		System.out.println(ex17b.saySomething());
	}
}
