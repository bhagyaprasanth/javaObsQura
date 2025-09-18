package exceptionexamples;

public class ExceptionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exception checking");
		try {
			int a[] = new int[5];
			//a[6]=50/0;
			a[6]=10;
			System.out.println(a[6]);
		} finally {
			System.out.println("executing finally block");
		}
		System.out.println("rest of the code");
	}

}
