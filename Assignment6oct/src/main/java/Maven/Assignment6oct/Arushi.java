package Maven.Assignment6oct;

public class Arushi extends Employee implements Runnable{

	@Override
	int EmpID() {
		return 102;
	}

	@Override
	void EmpName() {
	   System.out.println("Arushi");
		
	}

	@Override
	void Designation() {
		System.out.println("Data Engineer");
		
		
	}

	@Override
	float Salary() {
		return 20000;
	}

	@Override
	void Lacotion() {
		System.out.println("Delhi");
	}

	@Override
	float Exp() {
		return 1;
	}

	@Override
	int DOB() {
		return 6/10/1996;
	}

	@Override
	void Qualification() {
	System.out.println("BE");
		
	}

	@Override
	public void run() {
		System.out.println("Arushi is used in thread");
	}
	
	public static void main(String[] args) {
	     Thread t2=new Thread("employee number 2");
	     t2.start();
		}

}
