package superkeyword;

class Animal {
	String color = "White";
}

public class AccessParentFromChild extends Animal {
	String color = "black";

	void printColor() {
		System.out.println("color from child - " + color);
		System.out.println("color from parent - " + super.color);
	}

	public static void main(String args[]) {
		AccessParentFromChild obj=new AccessParentFromChild();
		obj.printColor();
	}
}
