package Question1;

public class Pizza extends Food{

	@Override
	public void healthy() {
		System.out.println("No");
	}

	@Override
	public void unhealthy() {
      System.out.println("Pizza is unhealthy");
		
	}

}
