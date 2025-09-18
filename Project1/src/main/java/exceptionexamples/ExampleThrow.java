package exceptionexamples;

public class ExampleThrow {
	public static void validate(int age) {
		if (age > 18) {
			throw new ArithmeticException("Person not eligible to vote");
		} else {
			System.out.println("Person eligible to vote");
		}
	}

	public static void main(String[] args) {
		validate(5);
		validate(25);
	}
}
