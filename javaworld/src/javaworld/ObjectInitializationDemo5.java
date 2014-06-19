package javaworld;

//ObjectInitializationDemo5.java
//http://www.javaworld.com/article/2075796/java-platform/java-101--class-and-object-initialization.html?page=3
class Parent {
	int x = 1;
	{
		System.out.println("x = " + ++x);
	}

	Parent() {
		System.out.println("Executing superclass constructor");
	}
}

class ObjectInitializationDemo5 extends Parent {
	int a = 2;
	{
		System.out.println("a = " + ++a);
	}

	ObjectInitializationDemo5() {
		System.out.println("Executing subclass constructor");
	}

	ObjectInitializationDemo5(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		ObjectInitializationDemo5 oid51 = new ObjectInitializationDemo5();
		ObjectInitializationDemo5 oid52 = new ObjectInitializationDemo5("Executing other subclass constructor");
	}
}