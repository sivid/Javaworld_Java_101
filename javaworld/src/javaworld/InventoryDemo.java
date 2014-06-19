package javaworld;

//InventoryDemo.java
interface Product {
	String getName();

	double getCost();
}

class Vehicle implements Product {
	private String name;
	private double cost;

	Vehicle(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}
}

class Car extends Vehicle {
	Car(String name, double unitCost) {
		super(name, unitCost);
	}
}

class Truck extends Vehicle {
	Truck(String name, double unitCost) {
		super(name, unitCost);
	}
}

class Tool implements Product {
	private String name;
	private double cost;

	Tool(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}
}

class InventoryDemo {
	public static void main(String[] args) {
		Product[] products = { new Car("Jaguar", 100000.00),
				new Tool("JigSaw", 150.23), new Car("Neon", 17000.00),
				new Tool("JigSaw", 149.18), new Car("Jaguar", 110000.00),
				new Car("Neon", 17500.00), new Car("Neon", 17875.32),
				new Truck("RAM", 35700.00) };
		takeInventory("JigSaw", products);
		takeInventory("Neon", products);
		takeInventory("Jaguar", products);
		takeInventory("RAM", products);
	}

	static void takeInventory(String item, Product[] p) {
		int quantity = 0;
		double totalCost = 0.00;
		for (int i = 0; i < p.length; i++)
			if (p[i].getName().equals(item)) {
				quantity++;
				totalCost += p[i].getCost();
			}
		System.out.println(item + ": Quantity = " + quantity
				+ ", Total cost = " + totalCost);
	}
}