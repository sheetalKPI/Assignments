package Question1;

public class FunctionalInterface implements sayable{

	@Override
	public void say(String msg) 
	{
		 System.out.println(msg);
	}
	public static void main(String[] args) {
	
   FunctionalInterface file = new FunctionalInterface();
   file.say("Hello there");
	}
	

	
	}


