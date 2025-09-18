package exceptionexamples;

import java.io.FileNotFoundException;

public class ExampleThrows {
	public static void validate(int age) throws FileNotFoundException, ArithmeticException,ArrayIndexOutOfBoundsException{
		if (age < 18) {
			throw new ArithmeticException("Person not eligible to vote");
		} else {
			System.out.println("Person eligible to vote");
		}
	}
	public static void main(String[] args) {
		
		try {
			validate(5);
		}catch(FileNotFoundException ae){
			ae.printStackTrace();
		}catch(ArithmeticException ae){
			ae.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException ae){
			ae.printStackTrace();
		}
	}
}
