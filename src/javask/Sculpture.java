package javask;

public class Sculpture extends Masterpiece {
	private final int volume;
	private final String material;
	
	public Sculpture(String name, int y, String m, String c,int vol,String mat) {
		super(name, y, m, c);
		System.out.println("Creating an instance of Sculpture");
		volume=vol;
		material=mat;
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("Sculpture's volume is :" + volume
				+"\nSculpture's material is : " + material);
	}
	
	@Override
	public boolean evaluate (String movement,String condition){
		System.out.println("["+movement+","+condition+"]");
		if (this.movement.equalsIgnoreCase(movement) && this.condition.equalsIgnoreCase(condition)) {
			System.out.println("Sculpture is accepted");
			return true;			
		}
		System.out.println("Sculpture is not accepted");
		return false;
	}
	
	public boolean evaluate (String movement){
		return evaluate(movement,"excellent");
	}

}
