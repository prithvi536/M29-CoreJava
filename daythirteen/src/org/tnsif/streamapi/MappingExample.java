package org.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;

public class MappingExample {

	public static void main(String[] args) {

		//using cpllections
		List<String>obj = Arrays.asList("Prithvi","Pranita","Prabal","Pratik");
		obj.stream().map(i->i.length()).forEach((i)->
		System.out.print(i+" "));
	}

}
