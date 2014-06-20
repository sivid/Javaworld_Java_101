package threads;

public class TrySleep {
	public static void main(String[] arr){
		System.out.println("Sleeping test :)");
		for (int i=0; i<9;i++){
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e){
			}
			System.out.println("i = " + i);
		}
		System.out.println("Sleeping test done");
	}
}
