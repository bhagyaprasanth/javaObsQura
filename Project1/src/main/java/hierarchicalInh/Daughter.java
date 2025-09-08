package hierarchicalInh;

public class Daughter extends Father{
	public static void main(String[] args) {
		Daughter d1=new Daughter();
		d1.getDaugherName();
		d1.getFatherName(); 
		Son s1=new Son();
		s1.getSonAge();
		s1.getFatherName();
	}
	public void getDaugherName() {
		System.out.println("Rekha");
	}
}
