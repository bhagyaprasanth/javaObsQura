package encapsulation;

class EncapsulationGetterSetter{
	private int accNumber;
	private int accBalance;
	public void setDetails(int accNumber, int accBalance) {
		this.accNumber=accNumber;
		this.accBalance=accBalance;
	}
	public int getAccountBalance() {
		return accBalance;
	}
	public int  getaccNumber() {
		return accNumber;
	}
}

public class Encapsulation {
	public static void main(String args[]) {
		EncapsulationGetterSetter obj=new EncapsulationGetterSetter();
		obj.setDetails(123456,3450);
		System.out.println(obj.getaccNumber());
		System.out.println(obj.getAccountBalance());
	}
}
