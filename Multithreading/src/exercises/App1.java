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
			System.out.println("	Running2 "+i);			
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
		System.out.println("Created new thread t1 using Runner1. State = " + t1.getState());
		Thread t2 = new Thread(r2);
		System.out.println("	Created new thread t2 using Runner2. State = " + t2.getState());

		t1.start();
		System.out.println("Started thread 1. State = "+ t1.getState());
		//System.out.println("******************");		
		t2.start();
		System.out.println("	Started thread 2. State = "+ t2.getState());
	}
}
