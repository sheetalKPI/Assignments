package Maven.Assignment6oct;

public class Trisha extends Employee {

	@Override
	int EmpID() {
		return 109;
	}

	@Override
	void EmpName() {
		System.out.println("Trisha");
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
		System.out.println("Hydrabad");
	}

	@Override
	float Exp() {
		return 4;
	}

	@Override
	int DOB() {
		return 19/9/1994;
	}

	@Override
	void Qualification() {
		System.out.println("BTech");
		
	}

	@Override
	void run() {
		System.out.println("Trisha is used in thread");
		}
		
		public static void main(String[] args) {
		     Thread t9=new Thread("employee number 9");
		     t9.start();
			}
		
	}

