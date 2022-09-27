package Assignment1;

public class Vehicle implements Vehicle1,Vehicle2 {

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		int speed=distance/100;
		}
    public void distance() {
    	int distance=speed*100;
    	System.out.println("distance travelled is"+distance);
    }
}
