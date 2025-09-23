package javacollections;

import java.util.ArrayList;

public class NonGenericCollection {

	public static void main(String[] args) {
		ArrayList li = new ArrayList();
		li.add("hi");
		li.add(100);
		li.add(100.8f);
		String s1=(String)li.get(0);
		int s2=(int)li.get(1);
		float s3=(float)li.get(2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
