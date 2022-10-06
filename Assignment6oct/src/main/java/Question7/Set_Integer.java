package Question7;

import java.util.HashSet;
import java.util.Set;

public class Set_Integer {
  public int xyz() {
	Set<Integer> no = new HashSet<Integer>();
	
	no.add(10);
	no.add(20);
	no.add(30);
	no.add(40);
	no.add(50);
	no.add(60);
	no.add(70);
	no.add(80);
	no.add(90);
	no.add(100);
	no.add(10);
	no.add(20);
	no.add(30);
	no.add(40);
	no.add(50);
	no.add(60);
	no.add(70);
	no.add(80);
	no.add(90);
	no.add(100);
	System.out.println(no);
	int last = 0;
	for(int n : no)
	{
		last = n;
	}
	System.out.println("Last Element is:" +last);
	return last;
	
	
  }	public static void main(String[] args) {
	 Set_Integer s = new Set_Integer();
	 s.xyz();

	}

}
