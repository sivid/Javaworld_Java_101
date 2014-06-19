package javaworld;
//http://www.javaworld.com/article/2075459/java-platform/java-101--object-oriented-language-basics--part-5--object-and-its-methods.html?page=2
//CloneDemo1.java
class CloneDemo1 implements Cloneable {
	int instanceField = 3;

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneDemo1 cd1 = new CloneDemo1();
		CloneDemo1 x = (CloneDemo1) cd1.clone();
		System.out.println(x.instanceField);
		AnotherClass ac = new AnotherClass();
		// AnotherClass y = (AnotherClass) ac.clone ();
	}
}

class AnotherClass {
	int anotherInstanceField = 2;
}