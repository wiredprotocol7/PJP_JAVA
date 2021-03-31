package com.automobile.twowheeler;



public class Hero extends com.automobile.Vehicle 
{
	protected String modelName;
	protected String registrationNumber;
	protected String ownerName;
	protected int speed;
	
	public Hero(String modelName, String registrationNumber, String ownerName, int speed) {
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
	}

	public int getSpeed()
	{
		return speed;
	}
	
	public void radio() 
	{
		System.out.print("Controlling the Radio\n");
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
