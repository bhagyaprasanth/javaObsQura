package interfaceExample;

class Cat implements InterfaceExample {
	public void test() {
		System.out.println("Interface method from cat");
	}
}

class Dog implements InterfaceExample {
	public void test() {
		System.out.println("Interface method");
	}

	public static void main(String args[]) {
		Dog obj = new Dog();
		obj.test();
		InterfaceExample obj1 = new Dog();
		obj1.test();
		obj1 = new Cat();
		obj1.test();
	}
}
