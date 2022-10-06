package Question6;

import java.util.ArrayList;

public class ArrayLists {
	public int xyz(){
	 
		 
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("x");
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("x");
		list2.add("i");
		list2.add("j");
		list2.add("k");
		list2.add("l");

		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("x");
		list3.add("p");
		list3.add("q");
		list3.add("r");

		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("x");
		list4.add("s");
		list4.add("t");

		ArrayList<String> list5 = new ArrayList<String>();
		list5.add("x");
		list5.add("y");
		list5.add("z");

		list1.retainAll(list2);
		list1.retainAll(list3);
		list1.retainAll(list4);
		list1.retainAll(list5);
		
		System.out.println("Content of ArrayList "+list1+""+list2+""+""+list3+""+list4+""+list5);
		System.out.println("Comman Element is "+list1);
		String x = list1.get(0);
		int index = list5.indexOf(x);
		System.out.println("Index of Element in list5 is "+index);
		return index;
}
}