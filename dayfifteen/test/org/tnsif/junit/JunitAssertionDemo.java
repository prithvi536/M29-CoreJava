package org.tnsif.junit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitAssertionDemo {

	
	@Test
	void test() {
		// Fails if expression is  false
		assertTrue(10>5);
		
	}
	
	@Test
	void display() {
		// Fails if expression is not false
		assertFalse(1>5);
	}

	@Test
	void accept() {
		// Fails if expression is not null
		assertNull(null);
	}
}
