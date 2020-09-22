package io.anusha.model;

public class Computer {

	// required parameters
	private String RAM;
	private String HDD;
	private String CPU;

	// optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	private Computer(Builder builder) {
		// TODO Auto-generated constructor stub
		this.RAM = builder.RAM;
		this.HDD = builder.HDD;
		this.CPU = builder.CPU;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;

	}

	public String getRAM() {
		return RAM;
	}

	public String getHDD() {
		return HDD;
	}

	public String getCPU() {
		return CPU;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public static class Builder {

		// required parameters
		private String RAM;
		private String HDD;
		private String CPU;

		// optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;

		public Builder(String ram, String hdd, String cpu) {
			super();
			this.RAM = ram;
			this.HDD = hdd;
			this.CPU = cpu;
		}

		// change return type from void to builder
		public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}
	}

}
