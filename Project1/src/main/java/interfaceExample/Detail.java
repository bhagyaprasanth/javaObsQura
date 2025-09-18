package interfaceExample;

public interface Detail {
	default void showDetails(String name, int age) {
		System.out.println("Name : "+name+", Age : "+age);
	}
}
