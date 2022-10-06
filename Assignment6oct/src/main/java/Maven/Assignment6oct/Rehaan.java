package Maven.Assignment6oct;

public class Rehaan extends Employee implements Runnable{

	@Override
	int EmpID() {
		return 107;
	}

	@Override
	void EmpName() {
    System.out.println("Rehaan");
		
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
		return 2;
	}

	@Override
	int DOB() {
		return 10/8/1996;
	}

	@Override
	void Qualification() {
		 System.out.println("BE");
	}

	@Override
	public void run() {
		System.out.println("Rehaan is used in thread");
		}
		
		public static void main(String[] args) {
		     Thread t7=new Thread("employee number 7");
		     t7.start();
			}
		
	}


