package finalkeyword;

final class MyFinalClass {
	void run() {
		System.out.println("Running");
	}
}

// public class FinalClass extends MyFinalClass{ gives error
public class FinalClass {
	public static void main(String[] args) {
		MyFinalClass obj = new MyFinalClass();
		obj.run();
	}

}
