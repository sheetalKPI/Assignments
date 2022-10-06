package Maven.Assignment6oct;

public class Kartik extends Employee{

	@Override
	int EmpID() {
		return 104;
	}

	@Override
	void EmpName() {
		System.out.println("Kartik");
		
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
		System.out.println("Mumbai");
		
		
	}

	@Override
	float Exp() {
		return 4;
	}

	@Override
	int DOB() {
		return 18/10/1995;
	}

	@Override
	void Qualification() {
		System.out.println("Btech");
		
	}
	
	public void run() {
		System.out.println("Kartik is used in thread");
	}
	
	public static void main(String[] args) {
	     Thread t4=new Thread("employee number 4");
	     t4.start();
		}
}
