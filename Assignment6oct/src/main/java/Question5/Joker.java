package Question5;

public class Joker extends Polymorphism{
     String name;
     String dance;
     Joker()
     {
    	 
     }
     Joker(String name, String dance)
     {
    	 this.name=name;
    	 this.dance=dance;
     }


	@Override
	String Dance() {
		return "Every joker dance in a different way";
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Joker n1 = new Joker();
		Joker n2 = new Joker();
		Joker n3 = new Joker();
		Joker n4 = new Joker();
		Joker n5 = new Joker();
		Joker n6 = new Joker();
		Joker n7 = new Joker();
		Joker n8= new Joker();
		Joker n9 = new Joker("Joker1","Kathak");
		Joker n10 = new Joker("Joker2","Kuchipudi");
		Joker n11 = new Joker("Joker3","Odissi");
		Joker n12 = new Joker("Joker4","Bhangra");
		Joker n13 = new Joker("Joker5","Garba");
		Joker n14 = new Joker("Joker6","Ghoomar");
		Joker n15 = new Joker("Joker7","Bihu");
		Joker n16 = new Joker("Joker8","Lavani");
		
		System.out.println(n1.name+" is dancing "+n1.dance);
		System.out.println(n2.name+" is dancing "+n2.dance);
		System.out.println(n3.name+" is dancing "+n3.dance);
		System.out.println(n4.name+" is dancing "+n4.dance);
		System.out.println(n5.name+" is dancing "+n5.dance);
		System.out.println(n6.name+" is dancing "+n6.dance);
		System.out.println(n7.name+" is dancing "+n7.dance);
		System.out.println(n8.name+" is dancing "+n8.dance);
		System.out.println(n9.name+" is dancing "+n9.dance);
		System.out.println(n10.name+" is dancing "+n10.dance);
		System.out.println(n11.name+" is dancing "+n11.dance);
		System.out.println(n12.name+" is dancing "+n12.dance);
		System.out.println(n13.name+" is dancing "+n13.dance);
		System.out.println(n14.name+" is dancing "+n14.dance);
		System.out.println(n15.name+" is dancing "+n15.dance);
		System.out.println(n16.name+" is dancing "+n16.dance);
	}
}
