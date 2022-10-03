package Question2;

public class exceptionHandle {

	public static void main(String[] args)
{
     int a = 5;
     int b = 0;
     try { 
    	 System.out.println(a/b);
     }
     catch(ArithmeticException e) {
    	 System.out.println("Divide by Zero operation can not possible");
     }
	}

}
