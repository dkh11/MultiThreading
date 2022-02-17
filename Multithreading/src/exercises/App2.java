package exercises;

// Extends the thread class

class A2Runner1 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Runner1 "+i);
			try {
				Thread.sleep(1000);
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
			System.out.println("Runner2 "+i);
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class App2 {
	public static void main(String[] args) {
		Thread t1 = new A2Runner1();		
		Thread t2 = new A2Runner2();
		
		t1.start();
		System.out.println("********************");
		t2.start();
	}
}
