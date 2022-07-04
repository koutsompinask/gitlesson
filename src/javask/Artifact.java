package javask;

public abstract class Artifact {
	protected final int index;
	protected final String creator;
	protected final int year;
	protected static int num=1;
	
	public Artifact(String name,int y) {
		System.out.println("Creating an instance of Artifact");
		index=num;
		num++;
		creator=name;
		year=y;
	}
	
	public void getInfo() {
		System.out.println("\n--------------INFO----------------\n"
				+ "Creator is: " + creator + "\nYear of creation is: " + year);
	}
	
	public void getIndex() {
		System.out.println("Artifact's index is: "+index);
	}

	public abstract boolean evaluate (String movement,String condition);
	public abstract boolean evaluate (String movement);
}
