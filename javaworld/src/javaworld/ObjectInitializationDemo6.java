package javaworld;

//ObjectInitializationDemo6.java
//http://www.javaworld.com/article/2075796/java-platform/java-101--class-and-object-initialization.html?page=3

/* It might surprise you to realize that a superclass object field/block initializer can access a field in a subclass. 
 * However, allowing that behavior is not a good idea because superclass initialization occurs before 
 * subclass initialization -- and the subclass fields thus contain only default values. Therefore, superclass 
 * initializer access to subclass fields produces incorrect results.
 */
class Parent6 {
	{
		System.out.println("a = " + ((ObjectInitializationDemo6) this).a);
	}
}

class ObjectInitializationDemo6 extends Parent6 {
	int a = 2;

	public static void main(String[] args) {
		new ObjectInitializationDemo6();
	}
}