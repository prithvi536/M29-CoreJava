package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class JunitAnnotationDemo {

	@Test
	void display() {
		System.out.println("First Junit5 Test Case");
	}
	
	@Test
	@BeforeAll
	void print() {
		System.out.println("Performing BeforeAll annotation");
	}
	
}
