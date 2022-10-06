package Maven.Assignment6oct;

public class Sidharth extends Employee{

	@Override
	int EmpID() {
		return 108;
	}

	@Override
	void EmpName() {
		System.out.println("Sidharth");
		
	}

	@Override
	void Designation() {
		System.out.println("MCA");
		
	}

	@Override
	float Salary() {
		return 20000;
	}

	@Override
	void Lacotion() {
		System.out.println("Mumbai");
	}

	@Override
	float Exp() {
		return 5;
	}

	@Override
	int DOB() {
		return 12/12/1992;
	}

	@Override
	void Qualification() {
		System.out.println("BTech");
		
	}

	@Override
	void run() {
		System.out.println("Sidharth is used in thread");
	}
	
	public static void main(String[] args) {
	     Thread t8=new Thread("employee number 8");
	     t8.start();
		}
	}
