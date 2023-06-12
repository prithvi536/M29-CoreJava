//program to demonstrate on generics class example
package org.tnsif.generics;

class GenericClass<T> {

	T x;
	void print(T x) {
		this.x = x;
	}
	T accept() {
		return x;
	}
}

public class GenericsClassExample{
	
	public static void main(String[] args) {
		GenericClass<String>obj = new GenericClass<>();
		obj.print("Prithvi");
		System.out.println(obj.accept());
		
	}
}

