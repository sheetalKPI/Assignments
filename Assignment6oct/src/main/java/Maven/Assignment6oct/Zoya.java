package Maven.Assignment6oct;

public class Zoya extends Employee{

	@Override
	int EmpID() {
		return 110;
	}

	@Override
	void EmpName() {
		System.out.println("Zoya");
		
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
		System.out.println("Nainital");
		
	}

	@Override
	float Exp() {
		return 2;
	}

	@Override
	int DOB() {
		return 16/8/1998;
	}

	@Override
	void Qualification() {
		System.out.println("BE");
	}

	@Override
	void run() {
		System.out.println("Trisha is used in thread");
	}
	
	public static void main(String[] args) {
	     Thread t10=new Thread("employee number 10");
	     t10.start();
		}
		
	}

