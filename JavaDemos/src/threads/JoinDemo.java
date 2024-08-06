package threads;

public class JoinDemo {
	
	public static void main(String[] args) {
		Collegue collegue1 = new Collegue();
		collegue1.setName("Pedro");
		Collegue collegue2 = new Collegue("Ana");
		Collegue collegue3 = new Collegue("Ricardo");

		collegue1.start();

		try {
			collegue1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		collegue2.start();
		collegue3.start();


	}
}
