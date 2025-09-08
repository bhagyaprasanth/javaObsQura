package superkeyword;

class Parent {
	void display() {
		System.out.println("Parent method");
	}
}

public class CallParentClassMethid extends Parent {
	void display() {
		System.out.println("Same name method from child");
	}

	void work() {
		super.display();
		display();
		System.out.println("child method");
	}

	public static void main(String[] args) {
		CallParentClassMethid obj=new CallParentClassMethid();
		obj.work();
	}

}
