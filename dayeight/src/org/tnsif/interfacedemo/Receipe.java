//program to demonstrate functional interface
//functional interface contains exactly one abstract class
package org.tnsif.interfacedemo;

@FunctionalInterface
public interface Receipe {
	/*by default all methods inside an interface
	 *  are public abstract and variables are public static final */
	
	String displayName();
	//String print();
	

}
