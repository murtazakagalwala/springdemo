package com.murtaza.springdemo;

public class VehicleHelper {

	
	private Vehicle v;
	
	public VehicleHelper(Vehicle v) {
		
		this.v=v;
		
	}
	
	public void vehicleRunner() {
		v.running();
	}
}
