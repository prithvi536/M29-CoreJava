package org.tnsif.statickeyword;

public class StaticKeywordExecutor {

	public static void main(String[] args) {
		/*without creating a object
		 *  we will get the value of static variable
		 */
		System.out.println(Employee.companyName);
		
		Employee e = new Employee(190,"Prithviraj");
		System.out.println(e);
		
		Employee e1 = new Employee(192,"Raj");
		System.out.println(e1);
		
		Customer.display();
		Customer c = new Customer();
		System.out.println(c);

	}

}
