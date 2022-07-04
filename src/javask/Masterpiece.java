package javask;

public abstract class Masterpiece extends Artifact {
	protected final String movement;
	protected final String condition;
	
	public Masterpiece(String name, int y, String m ,String c) {
		super(name, y);
		System.out.println("Creating an instance of Masterpiece");
		movement = m;
		condition = c;
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("Masterpiece movement is " + movement 
					+"\nMasterpiece condition is " + condition);
	}
}
