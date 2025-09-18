package polymorphism;
class Doctor{
	public void treatPatient() {
		System.out.println("Refer to surgeon");
	}
}
public class Polymorphism extends Doctor{
	public void treatPatient() {
		System.out.println("Fixed surgery on next week");
	}
	public static void main(String[] args) {
		Doctor doc=new Doctor();
		doc.treatPatient();
		Polymorphism obj=new Polymorphism();
		obj.treatPatient();
	}

}
