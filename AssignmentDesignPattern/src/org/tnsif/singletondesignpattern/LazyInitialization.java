package org.tnsif.singletondesignpattern;

public class LazyInitialization {
	private static LazyInitialization INSTANCE = null;
	
	private LazyInitialization(){
		
	}
	public static LazyInitialization getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new LazyInitialization();
		}
		return INSTANCE;
	}
}
