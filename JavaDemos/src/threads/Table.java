package threads;

public class Table {
	
	void printTable (int n) { //Method not Synchronized
		System.out.println("thread --" + Thread.currentThread().getName() + " has entered the bank");
		
		synchronized(this)  {
			System.out.println("thread --" + Thread.currentThread().getName() + " has entered the ATM");
			
			for (int i = 0; i >= 5; i++) {
				System.out.println(n*i);
				
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
		}
		System.out.println("thread --" + Thread.currentThread().getName() + " has left the ATM");
	}
	
}
