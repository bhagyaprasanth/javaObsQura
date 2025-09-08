package AccessModifiers;

public class PrivateAM {
	private int data=90;
	private void mesg() {
		System.out.println("Hello");
	}
	public static void main (String args[]) {
		PrivateAM obj=new PrivateAM();
		obj.mesg();
		System.out.println(obj.data);
	}
}
