package org.tnsif.streamapi;

import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {

		Stream<Integer> s1 = Stream.of(11,33,4,43,98);
		s1.forEach((i) -> System.out.print(i+" "));
		
	}

}
