package org.tnsif.singletondesignpattern;

public class StaticInitialization {
private static StaticInitialization INSTANCE = null;
	
	private StaticInitialization() {
		
	}
	//static block
	static {
		try {
			if(INSTANCE == null) {
				INSTANCE = new StaticInitialization();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public StaticInitialization getInstance() {
		return INSTANCE;
	}

}
 