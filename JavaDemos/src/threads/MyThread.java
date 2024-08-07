package threads;

public class MyThread extends Thread {
	Table table;
	
	public MyThread(Table table) {
		this.table = table;
	}
	
	@Override
	public void run() {
		super.run();
		table.printTable(5);
	}
}

class MySecondThread extends Thread{
	Table table;
	
	public MySecondThread(Table table) {
		this.table = table;
	}
	
	@Override
	public void run() {
		super.run();
		table.printTable(100);
	}
}
