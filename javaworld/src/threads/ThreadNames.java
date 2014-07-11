package threads;
public class ThreadNames {
	public static void main(String[] args) {
		NameThisThread ntt;
		if (args.length == 0)
			ntt = new NameThisThread();
		else
			ntt = new NameThisThread(args [0]);
		ntt.start();
	}
}

class NameThisThread extends Thread {	
	NameThisThread(){
	}	
	NameThisThread(String name){
		super(name);
	}
	public void run(){
		System.out.println("THread name is " + getName());
	}
}