package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestDemo {

	@ParameterizedTest
	@ValueSource(strings= {"Prithviraj","Prabal","Om"})
	void test() {
		System.out.println("Demonstration on parameterized"
				+ "Test");
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"Raj","Pratik","Omkar"})
	void accept(String str) {
		assertNotNull(str);
	}
	
	
}
