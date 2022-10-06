package Maven.Assignment6oct;

public class Arohi extends Employee {

	@Override
	int EmpID() {
		return 101;
	}

	@Override
	void EmpName() {
		System.out.println("Arohi");
		
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
		System.out.println("Kolkata");
		
	}

	@Override
	float Exp() {
		return 2;
	}

	@Override
	int DOB() {
		return 20/10/1996;
	}

	@Override
	void Qualification() {
		System.out.println("B.tech");
		
	}
	@Override
	void run() {
		System.out.println("Arohi is used in thread");
	}
	
	public static void main(String[] args) {
	     Thread t1=new Thread("employee number 1");
	     t1.start();
		}
		
	}

