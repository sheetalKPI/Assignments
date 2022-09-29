package Question1;
   //lambda expressions to demonstrate a user defined functional interface
public interface Square {
    int calculate(int x);
}
  class Test {
	  public static void main(String args[])
	  {
		  int a = 5;
		  
		  Square s = (int x) -> x*x;
		  int ans = s.calculate(a);
		  System.out.println(ans);
	  }
  }