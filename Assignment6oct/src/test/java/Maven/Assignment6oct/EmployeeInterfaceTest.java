package Maven.Assignment6oct;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeInterfaceTest {
 @Test
	public void check() {
	
	 Alia f=new Alia();
	 String F=f.F_name();
	 String L=f.L_name();
	 assertEquals("Alia",F);
	 assertEquals("Bhatt",L);
	  
	 Abhi f1=new Abhi();
	 String F1=f1.F_name();
	 String L1=f1.L_name();
	 assertEquals("Abhi",F1);
	 assertEquals("Sharma",L1);
	  
	 Isha f2=new Isha();
	 String F2=f2.F_name();
	 String L2=f2.L_name();
	 assertEquals("Isha",F2);
	 assertEquals("Gupta",L2);
	  
	 Ishaan f3=new Ishaan();
	 String F3=f3.F_name();
	 String L3=f3.L_name();
	 assertEquals("Ishaan",F3);
	 assertEquals("Khattar",L3);
	 
	 Kiara f4=new Kiara();
	 String F4=f4.F_name();
	 String L4=f4.L_name();
	 assertEquals("Kiara",F4);
	 assertEquals("Advani",L4);
	 
	 Rishi f5=new Rishi();
	 String F5=f5.F_name();
	 String L5=f5.L_name();
	 assertEquals("Rishi",F5);
	 assertEquals("Kapoor",L5);
	  
	 Shivi f6=new Shivi();
	 String F6=f6.F_name();
	 String L6=f6.L_name();
	 assertEquals("Shivi",F6);
	 assertEquals("Shinde",L6);
	 
	 Sneha f7=new Sneha();
	 String F7=f7.F_name();
	 String L7=f7.L_name();
	 assertEquals("Sneha",F7);
	 assertEquals("Thakur",L7);
	  
}
}