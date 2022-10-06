package Maven.Assignment6oct;

public class Monisha extends Employee{

	@Override
	int EmpID() {
		return 105;
	}

	@Override
	void EmpName() {
	System.out.println("Monisha");
		
	}

	@Override
	void Designation() {
		System.out.println("BTech");
	}

	@Override
	float Salary() {
		return 20000;
	}

	@Override
	void Lacotion() {
		System.out.println("Pune");
	
	}

	@Override
	float Exp() {
		return 1;
	}

	@Override
	int DOB() {
	return 19/11/1999;
	}

	@Override
	void Qualification() {
		System.out.println("BE");
		
	}

	@Override
	void run() {
		System.out.println("Monisha is used in thread");
	}
	
	public static void main(String[] args) {
	     Thread t5=new Thread("employee number 5");
	     t5.start();
		}
		
	}


