package javacollections;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaArrayList {
	 public static void main(String args[]) {
		 ArrayList<String> cars=new ArrayList<String>();
		 cars.add("Volvo");
		 cars.add("BMW");
		 cars.add("Ford");
		 cars.add("Nano");
		 System.out.println(cars);
		 System.out.println(cars.get(3));
		 cars.set(0,"Opel");
		 System.out.println(cars);
		 cars.remove(0);
		 System.out.println(cars.get(0));
		 System.out.println(cars);
		 System.out.println(cars.size());
		 System.out.println("Array List printing with For Loop");
		 for(int i=0;i<cars.size();i++) {
			 System.out.println(cars.get(i));
		 }
		 System.out.println("Array List printing with For each Loop");
		 for(String carinc : cars) {
			 System.out.println(carinc);
		 }
		 System.out.println("Array List printing with Itertor");
		 Iterator<String> it= cars.iterator();
		 while(it.hasNext()) {
			 String car=it.next();
			 System.out.println(car);
		 }
	 }
}
