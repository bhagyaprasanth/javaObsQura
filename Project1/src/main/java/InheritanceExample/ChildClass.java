package InheritanceExample;

public class ChildClass extends ParentClass{
	public void getChildAge() {
		System.out.println("Child age is 11");
	}

	public static void main(String args[]) {
		ChildClass c1=new ChildClass();
		c1.getParentAge();
		c1.getChildAge();
	}
}
