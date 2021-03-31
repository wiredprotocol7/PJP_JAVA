package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle
{
	protected String modelName;
	protected String registrationNumber;
	protected String ownerName;
	protected int speed;
	
	public Ford(String modelName, String registrationNumber, String ownerName, int speed) {
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
	}

	public int getSpeed()
	{
		return speed;
	}
	
	@SuppressWarnings("null")
	public int tempControl() 
	{
		System.out.print("Controlling the air conditioning device.\n");
		return 0;
	}

	@Override
	public String getModelName() {
		
		return modelName ;
	}

	@Override
	public String getRegistrationNumber() {

		return registrationNumber;
	}

	@Override
	public String getOwnerName() {

		return ownerName;
	}

}
