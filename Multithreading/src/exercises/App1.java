package exercises;

// Implement the Runnable interface(?)

class Runner1 implements Runnable{
	@Override
	public void run() {
		for(int i=1; i<10; i++) {
			System.out.println("Running1 "+i);			
		}
	}
}

class Runner2 implements Runnable{
	@Override
	public void run() {
		for(int i=1; i<10; i++) {
			System.out.println("Running2 "+i);			
		}
	}
}


public class App1 {
	public static void main(String[] args) {
		Runner1 r1 = new Runner1();
		Runner2 r2 = new Runner2();
		
		r1.run();
		System.out.println("******************");
		r2.run();

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		System.out.println("******************");		
		t2.start();
	}
}
