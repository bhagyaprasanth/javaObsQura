package javacollections;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class JavaHashSet {

	public static void main(String[] args) {
		
		Set<String> fruits=new HashSet<>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("apple");
		Iterator<String> itr=fruits.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(fruits.contains("orange"));
		System.out.println(fruits.size());
		fruits.remove("apple");
		System.out.println(fruits);
		Set<String> moreFruits=new HashSet<>();
		moreFruits.add("grapes");
		moreFruits.add("banana");
		fruits.addAll(moreFruits);
		System.out.println(fruits);
		System.out.println(moreFruits);
		fruits.retainAll(moreFruits);
		System.out.println(fruits);
		fruits.clear();
		System.out.println(fruits.isEmpty());
		
		
		
	}

}
