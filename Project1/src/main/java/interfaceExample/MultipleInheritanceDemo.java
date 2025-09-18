package interfaceExample;

public class MultipleInheritanceDemo implements Show,Detail {
	public void showDetails(String name, int age) {
		Detail.super.showDetails("Nanda",11);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
	public static void main(String[] args) {
		MultipleInheritanceDemo obj=new MultipleInheritanceDemo();
		obj.showDetails("Bhagya",40);
	}

}
