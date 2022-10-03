package Question2;

public class DisplayOverlaoding
{
     int add(int a, int b)
     {
    	 int sum = a+b;
         return sum;
     }
     
     int add(int a, int b, int c)
     {
    	 int sum = a+b+c;
         return sum;
     }
}
