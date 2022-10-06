package Maven.Assignment6oct;

public class Pallavi extends Employee implements Runnable {

	@Override
	int EmpID() {
		return 106;
	}

	@Override
	void EmpName() {
		System.out.println("Pallavi");
		
	}

	@Override
	void Designation() {
		System.out.println("MBA");
		
	}

	@Override
	float Salary() {
	
		return 20000;
	}

	@Override
	void Lacotion() {
		System.out.println("Chennai");
	}

	@Override
	float Exp() {
		return 3;
	}

	@Override
	int DOB() {
	
		return 9/05/1997;
	}

	@Override
	void Qualification() {		
		System.out.println("MBA");
		
	}

	@Override
	public void run() {
		System.out.println("Pallavi is used in thread");
		}
		
		public static void main(String[] args) {
		     Thread t6=new Thread("employee number 6");
		     t6.start();
			}
		
	}


