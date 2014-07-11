package threads;
public class ConsumerProducerPractice {
	public static void main(String[] args) {
		MiddleObject o = new MiddleObject();
		//new MyProducer(o).start();		doesn't work for Runnable
		(new Thread(new MyProducer(o))).start();
		new MyConsumer(o).start();
	}
}

class MiddleObject{
	private String msg = "initial value";
	/*
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	*/
	// adding synchronization
	private boolean meEmpty = true;
	synchronized public void setMsg(String msg){
		while(!meEmpty){
			try{
				wait();
			}catch(InterruptedException e){
				System.out.println("setMsg has been notified.");
			}
		}
		this.msg = msg;
		meEmpty = false;
		this.notifyAll();
	}
	synchronized public String getMsg(){
		while(meEmpty){
			try{
				wait();
			}catch(InterruptedException e){
				System.out.println("getMsg has been notified.");
			}
		}
		meEmpty = true;
		this.notifyAll();
		return msg;
	}	
}

class MyProducer implements Runnable{
	private MiddleObject o;
	String lockString = "";
	MyProducer(MiddleObject o){
		this.o = o;
		//this.lockString = lockString;
	}
	public void run(){
		for (int i=0; i<10; i++){
			try{
				Thread.sleep((int) (Math.random()*4000));
				//				Thread.sleep((int) (Math.random() * 4000));
			}catch(InterruptedException e){
				System.out.println("producer interrupted while sleeping");
			}
			o.setMsg("i = " + i);
			//System.out.println("producer finished");
		}
	}
}

class MyConsumer extends Thread{
	private MiddleObject o;
	String lockString = "";
	private String produce = "";
	MyConsumer(MiddleObject o) {
		this.o = o;
		//this.lockString = lockString;
	}
	public void run(){
		for (int i=0; i<10; i++){
			try{
				Thread.sleep((int) (Math.random()*4000));
			}catch(InterruptedException e){
				System.out.println("consumer interrupted while sleeping");
			}
			produce = o.getMsg();
			System.out.println("Consumer: " + produce); 
			//o.setMsg("stuff taken, if you see this then Consumer ran twice in a row");
			//System.out.println("consumer finished");
			//System.out.println(o.getMsg() + ", count is" + count + "CCCCCCCCCC");
		}
	}
	
}