package org.tnsif.annotations;

public class DeprecatedAnnotationExample {
	@Deprecated
	public void print() {
		System.out.println("Welcome to Java Annotation");
	}
	
	public static void main(String[] args) {
		
		DeprecatedAnnotationExample d = new DeprecatedAnnotationExample();
		d.print();
	}
}
