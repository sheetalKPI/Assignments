package Question7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Set_IntegerTest {
 @Test
   public void Integer()
   {
	 Set_Integer i = new Set_Integer();
	 int s=i.xyz();
	 assertEquals(30,s);
   }
}
