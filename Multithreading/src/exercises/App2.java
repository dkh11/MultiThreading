package exercises;

// Extends the thread class

class A2Runner1 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Runner1 "+i);
			try {
				Thread.sleep(1000);
				System.out.println("******** Sleeping Runner1. State = " + Thread.currentThread().getState());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class A2Runner2 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("	Runner2 "+i);
			try {
				Thread.sleep(800);
				System.out.println("########## Sleeping Runner2. State = " + Thread.currentThread().getState());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class App2 {
	public static void main(String[] args) {
		Thread t1 = new A2Runner1();		
		System.out.println("Created new thread t1 using Runner1. State = " + t1.getState());
		Thread t2 = new A2Runner2();
		System.out.println("	Created new thread t2 using Runner2. State = " + t2.getState());
		
		t1.start();
		System.out.println("Started thread 1. State = "+ t1.getState());
		//System.out.println("********************");
		t2.start();
		System.out.println("	Started thread 2. State = "+ t2.getState());
		
	}
}
