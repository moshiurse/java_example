	/**
	 * @author Moshiur Rahman
	 * @Date 28-10-2017
	 * @Topic Java MultiThread by Implement Runnable
	 */
public class MultiThreadImp {
	
	public static void main(String[] args) {
		Four four = new Four();
		Five five = new Five();
		Six six = new Six();
		
		Thread t1 = new Thread(four);
		Thread t2 = new Thread(five);
		Thread t3 = new Thread(six);
		
		t1.start();
		t2.start();
		t3.start();
	}

}

class Four implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5; i++){
			System.out.println("Class Four "+i);
		}
		
	}
	
}

class Five implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5; i++){
			System.out.println("Class Five "+i);
		}
		
	}
	
}

class Six implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5; i++){
			System.out.println("Class Six "+i);
		}
		
	}
	
}