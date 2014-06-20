package threads;
//http://www.javaworld.com/article/2074217/java-concurrency/java-101--understanding-java-threads--part-1--introducing-threads-and-runnables.html?page=2
//Census.java
class Census {
	public static void main(String[] args) {
		Thread[] threads = new Thread[Thread.activeCount()];
		int n = Thread.enumerate(threads);
		for (int i = 0; i < n; i++){
			System.out.println(threads[i].toString());
			threads[i].dumpStack();
		}
		
		System.out.println("Thread.activeCount() = " + Thread.activeCount());
	}
}