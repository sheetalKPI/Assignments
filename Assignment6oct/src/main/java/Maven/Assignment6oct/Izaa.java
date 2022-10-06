package Maven.Assignment6oct;

public class Izaa extends Employee implements Runnable{

	@Override
	int EmpID() {
		return 103;
	}

	@Override
	void EmpName() {
		System.out.println("Izaa");
		
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
		System.out.println("Indore");
	}

	@Override
	float Exp() {
		return 2;
	}

	@Override
	int DOB() {
		return 19/03/1998;
	}

	@Override
	void Qualification() {
		System.out.println("MBA");
	}

	@Override
	public void run() {
		System.out.println("Izaa is used in thread");
		
	}
	public static void main(String[] args) {
	     Thread t3=new Thread("employee number 3");
	     t3.start();
		}

}
