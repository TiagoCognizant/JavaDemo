package threads;

public class TestSynchronization {
	public static void main(String[] args) {
		Table obj = new Table(); // Only one, shared object
		MyThread t1 = new MyThread(obj);
		MySecondThread t2 = new MySecondThread(obj);
		
		t1.start();
		t2.start();
	}
}
