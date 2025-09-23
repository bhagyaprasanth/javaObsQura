package javacollections;

import java.util.ArrayList;
import java.util.Iterator;

public class JavArrayListIntEg {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.add(40);
		Iterator<Integer> itr = intList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
