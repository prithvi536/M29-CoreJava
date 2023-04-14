package org.tnsif.multilevelinheritance;

public class MultiLevelInheritanceExecutor {

	public static void main(String[] args) {
		City c = new City();
		c.setCityName("Pune");
		c.setArea("Pimpri");
		c.setStateName("Maharashtra");
		c.setLanguage("Marathi");
		c.setCountryName("India");
		c.setCountryCapital("New Delhi");
		
		System.out.println(c);
	}

}
