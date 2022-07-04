package javask;

public class Painting extends Masterpiece {
	private final int width,length;
	private final String technique;
	
	public Painting(String name, int y, String m, String c,int w,int l,String tech) {
		super(name, y, m, c);
		System.out.println("Creating an instance of Painting");
		width=w;
		length=l;
		technique=tech;
	}

	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("Painting's width : "+ width 
				+ " length : " + length
				+ "\nPainting's area : " + width*length 
				+ "\nTechnique : " + technique);
		
	}
	
	@Override
	public boolean evaluate (String movement,String condition){
		System.out.println("["+movement+","+condition+"]");
		if (this.movement.equalsIgnoreCase(movement)) {
			if (this.condition.equalsIgnoreCase(condition)) {
				System.out.println("Painting is accepted");
				return true;
			}
			if (this.condition.equalsIgnoreCase("excellent")
					&& condition.equalsIgnoreCase("good")) {
				System.out.println("Painting is accepted");
				return true;
			}
		}
		System.out.println("Painting is not accepted");
		return false;
	}
	
	@Override
	public boolean evaluate (String movement){
		return evaluate(movement,"good");
	}
	
	
}
