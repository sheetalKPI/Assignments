package Question5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JokerTest {

 @Test
 public void Dance()
 {
	 Joker j1=new Joker("Joker1","Kathak");
	 Joker j2=new Joker("Joker2","Kuchipudi");
	 Joker j3=new Joker("Joker3","Odissi");
	 Joker j4=new Joker("Joker4","Bhangra");
	 Joker j5=new Joker("Joker5","Garba");
	 Joker j6=new Joker("Joker6","Ghoomar");
	 Joker j7=new Joker("Joker7","Bihu");
	 Joker j8=new Joker("Joker8","Lavani");
 
	 assertEquals("Kathak",j1.dance);
	 assertEquals("Kuchipudi",j2.dance);
	 assertEquals("Odissi",j3.dance);
	 assertEquals("Bhangra",j4.dance);
	 assertEquals("Garba",j5.dance);
	 assertEquals("Ghoomar",j6.dance);
	 assertEquals("Bihu",j7.dance);
	 assertEquals("Lavani",j8.dance);
 }
}
