
	/**
	 * @author Moshiur Rahman
	 * @Date 28-10-2017
	 * @Topic Java MultiThread by extend Thread
	 */
public class MultiThreadEx {

	public static void main(String[] args) {
		First first = new First();
		Second second = new Second();
		Third third = new Third();
		
		first.start();
		second.start();
		third.start();

	}
	

}

class First extends Thread{
	
	public void run(){
		for(int i=0; i<5; i++){
			System.out.println("Class First "+i);
		}
	}
	
}

class Second extends Thread{
	
	public void run(){
		for(int i=0; i<5; i++){
			System.out.println("Class Second "+i);
		}
	}
	
}

class Third extends Thread{
	
	public void run(){
		for(int i=0; i<5; i++){
			System.out.println("Class Third "+i);
		}
	}
	
}
