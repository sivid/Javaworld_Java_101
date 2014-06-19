package javaworld;

//ClassInfoDemo3.java
import java.lang.reflect.Field;

class Employee {
	private String name;

	Employee(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
}

class Credentials {
}

class Accountant extends Employee {
	private Credentials credentials;

	Accountant(String name, Credentials credentials) {
		super(name);
		this.credentials = credentials;
	}

	Credentials getCredentials() {
		return credentials;
	}
}

class ClassInfoDemo3 {
	public static void main(String[] args) {
		Accountant jim = new Accountant("Jim Smith", new Credentials());
		Class c = jim.getClass();
		do {
			try {
				Field f = c.getDeclaredField("name");
				System.out.println(f.getType().getName());
				return;
			} catch (NoSuchFieldException e) {
			}

			c = c.getSuperclass();
		} while (c != null);
	}
}