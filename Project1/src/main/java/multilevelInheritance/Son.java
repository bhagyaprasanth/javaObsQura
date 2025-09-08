package multilevelInheritance;

public class Son extends Father{
	public static void main(String[] args) {
		Son s=new Son();
		s.getGrandFatherDetails();
		s.getFatherDetails();
		s.getSonDetails();
	}
	public void getSonDetails() {
		System.out.println("Name : Vishnu");
	}
}
