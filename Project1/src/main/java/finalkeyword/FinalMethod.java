package finalkeyword;

class Bike {
	public final void run() {
		System.out.println("running");
	}
}

public class FinalMethod extends Bike {
	/*
	 * will give error as run method is final public void run() {
	 * System.out.println("running successfully"); }
	 */
	public static void main(String[] args) {
		FinalMethod obj = new FinalMethod();
		obj.run();
	}
}
