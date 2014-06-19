package javaworld;

//EqualityDemo.java
class Employee1 {
	String name;
	double salary;
}

class Employee2 {
	String name;
	double salary;

	public boolean equals(Object o) {
		if (!(o instanceof Employee2))
			return false;
		Employee2 e = (Employee2) o;
		return (e.name.equals(name) && e.salary == salary);
	}
}

class EqualityDemo {
	public static void main(String[] args) {
		int i = 15;
		int j = 15;
		System.out.println("i == j: " + (i == j));
		Employee1 e11 = new Employee1();
		e11.name = "John Doe";
		e11.salary = 50000.0;
		Employee1 e12 = new Employee1();
		e12.name = "John Doe";
		e12.salary = 50000.0;
		System.out.println("e11 == e12: " + (e11 == e12));
		System.out.println("e11.equals (e12): " + e11.equals(e12));
		Employee2 e21 = new Employee2();
		e21.name = "John Doe";
		e21.salary = 50000.0;
		Employee2 e22 = new Employee2();
		e22.name = "John Doe";
		e22.salary = 50000.0;
		System.out.println("e21 == e22: " + (e21 == e22));
		System.out.println("e21.equals (e22): " + e21.equals(e22));
	}
}