package javaworld;

//ClassInfoDemo1.java
/*			// commented out to help ClassInfoDemo3 compile.  does not affect ClassInfoDemo1 because they're the same Employee
class Employee {							// I just randomly picked one
	private String name;					// actually I didn't, it wasn't random
											// but w/e
	Employee(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
}
*/

class ClassInfoDemo1 {
	public static void main(String[] args) {
		ClassInfoDemo1 cid = new ClassInfoDemo1();
		Class c = cid.getClass();
		System.out.println(c.getName());
		Employee e = new Employee("John Doe");
		c = e.getClass();
		System.out.println(c.getName());
	}
}