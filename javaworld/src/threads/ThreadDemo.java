package threads;

//ThreadDemo.java, I added the mt.join()
class ThreadDemo {
	public static void main(String[] args) {
		MyThread1 mt = new MyThread1();
		mt.start();
		try{
			mt.join();
		}catch(InterruptedException e){
			
		}
		for (int i = 0; i < 50; i++)
			System.out.println("i = " + i + ", i * i = " + i * i);
	}
}

class MyThread1 extends Thread {
	public void run() {
		for (int count = 1, row = 1; row < 20; row++, count++) {
			for (int i = 0; i < count; i++)
				System.out.print('*');
			System.out.print('\n');
		}
	}
}