package finalkeyword;

public class FinalVariable {
	final int speed_limit = 50;

	void run(int current_speed) {
		// speed_limit=90; error
		if (current_speed > speed_limit) {
			System.out.println("You are overspeeding");
		}
	}

	public static void main(String[] args) {
		FinalVariable obj = new FinalVariable();
		obj.run(70);

	}

}
