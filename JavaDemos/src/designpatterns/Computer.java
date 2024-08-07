package designpatterns;

public class Computer {
	

	// Required Parameters
	private String HDD;
	private String RAM;
	
	// Optional Parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	public String getHDD() {
		return HDD;
	}
	
	public String getRAM() {
		return RAM;
	}
	
	public boolean isGraphicCardEnabled() {
		return isGraphicsCardEnabled;
	}
	
	public boolean isBluetoothERnabled() {
		return isBluetoothEnabled;
	}
	
	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}

	
	// Builder Class
	public static class ComputerBuilder {
		
		// Required Parameters
		public String HDD;
		public String RAM;

		// Optional Parameters
		public boolean isGraphicsCardEnabled;
		public boolean isBluetoothEnabled;
		
		public ComputerBuilder(String hdd, String ram) {
			this.HDD = hdd;
			this.RAM = ram;
		}
		
		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		public Computer build(){
			return new Computer(this);
		}
	}
}



