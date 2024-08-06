package threads;

public class Collegue extends Thread {
	
	public Collegue() {}
	
	public Collegue(String threadName) {
		super(threadName);
	}
	
	@Override
	public void run() {
		super.run();
		
		for(int i=0;i < 5 ;i++) {
			try {
				Thread.sleep(300);
				System.out.println(Thread.currentThread().getName()+ i);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
