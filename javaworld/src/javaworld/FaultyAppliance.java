package javaworld;

//FaultyAppliance.java
class Appliance implements Counter, DiagnoseStartStop {
	private int count;
	private String brand;
	protected boolean started;

	Appliance(String brand) {
		this.brand = brand;
	}

	String getBrand() {
		return brand;
	}

	public void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}

	public void start() {
		increment();
	}

	public void stop() {
	}

	public boolean isStarted() {
		return started;
	}
}

class WashingMachine extends Appliance {
	WashingMachine(String brand) {
		super(brand);
	}

	public void start() {
		if (isStarted()) {
			System.out.println("Washing machine already running.");
			return;
		}
		if (rnd(4) > 1) {
			System.out.println("Trying to start washing machine.");
			super.start();
		} else {
			started = true;
			System.out.println("Washing machine is running.");
		}
	}

	public void stop() {
		if (started) {
			started = false;
			System.out.println("Washing machine is stopped.");
		} else
			System.out.println("Washing machine already stopped.");
	}

	// Return a random number between 0 and limit - 1 (inclusive).
	int rnd(int limit) {
		return (int) (Math.random() * limit);
	}
}

class FaultyAppliance {
	public static void main(String[] args) {
		WashingMachine wm = new WashingMachine("Maytag");
		for (int i = 0; i < 10; i++)
			wm.start();
		if (wm.isStarted())
			wm.stop();
		System.out.println("Number of faulty start attempts: " + wm.getCount());
	}
}