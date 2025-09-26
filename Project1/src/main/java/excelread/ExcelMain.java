package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		String s1=ExcelCode.readStringData(0, 0);
		String s2=ExcelCode.readStringData(0, 1);
		String s3=ExcelCode.readStringData(1, 0);
		String s4=ExcelCode.readIntegerData(1, 1);		
		String s5=ExcelCode.readStringData(2, 0);
		String s6=ExcelCode.readIntegerData(2, 1);
		String s7=ExcelCode.readStringData(3, 0);
		String s8=ExcelCode.readIntegerData(3, 1);
		System.out.println(s1+" "+s2);
		System.out.println(s3+" "+s4);
		System.out.println(s5+" "+s6);
		System.out.println(s7+" "+s8);
	}

}

