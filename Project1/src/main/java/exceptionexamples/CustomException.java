package exceptionexamples;

class InvalidAgeException extends Exception {

	public InvalidAgeException(String param) {
		super(param);
	}

}

public class CustomException {
	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 0) {
			throw new InvalidAgeException("Invalid Age");
		} else if (age < 18) {
			throw new InvalidAgeException("Person not eligible to vote");
		} else if (age < 120) {
			System.out.println("Person eligible to vote");
		} else {
			throw new InvalidAgeException("Invalid Age");
		}
	}

	public static void main(String[] args) {
		try {
			validateAge(2);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		} finally {
			System.out.println("End of Code");
		}
	}

}
