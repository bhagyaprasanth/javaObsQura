package superkeyword;

class ParentClass{
	public ParentClass() {
		System.out.println("Animal is created");
	}
}
public class InvokeParentClassConstructor extends ParentClass{
	InvokeParentClassConstructor(){
		super();
		System.out.println("Dog is created");
	}
	public static void main(String args[]) {
		InvokeParentClassConstructor obj= new InvokeParentClassConstructor();
	}
}
