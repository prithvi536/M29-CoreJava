package org.tnsif.annotations;

import java.util.Set;
import java.util.TreeSet;

public class SuppressWarningDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Set s = new TreeSet();
		s.add(88);
		s.add(90);
		s.add("pithvi");
		System.out.println(s);
		
		
		
	}

}
