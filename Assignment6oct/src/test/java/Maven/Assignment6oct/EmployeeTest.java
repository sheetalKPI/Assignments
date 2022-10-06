package Maven.Assignment6oct;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {
    @Test
	 public void check() {
    	 
    	  Arohi a=new Arohi();
    	  int a1=a.EmpID();
    	  assertEquals(101,a1);
    	  
    	  Arushi a2=new Arushi();
    	  int a3=a2.EmpID();
    	  assertEquals(102,a3);
    	  
    	  Izaa i=new Izaa();
    	  int i1=i.EmpID();
    	  assertEquals(103,i1);
    	  
    	  Kartik k=new Kartik();
    	  int k1=k.EmpID();
    	  assertEquals(104,k1);
    	  
    	  Monisha m=new Monisha();
    	  int m1=m.EmpID();
    	  assertEquals(105,m1);
    	  
    	  Pallavi p=new Pallavi();
    	  int p1=p.EmpID();
    	  assertEquals(106,p1);
    	  
    	  Rehaan r=new Rehaan();
    	  int r1=r.EmpID();
    	  assertEquals(107,r1);
    	  
    	  Sidharth s=new Sidharth();
    	  int s1=s.EmpID();
    	  assertEquals(108,s1);
    	  
    	  Trisha t=new Trisha();
    	  int t1=t.EmpID();
    	  assertEquals(109,t1);
    	  
    	  Zoya z=new Zoya();
    	  int z1=z.EmpID();
    	  assertEquals(110,z1);
    	  
	}

}
