package com.automobile;

import com.automobile.fourwheeler.Ford;
import com.automobile.fourwheeler.Logan;

public class testclass {

	public static void main(String[] args) 
	{
	
		
			Logan hero = new Logan("Logan test", "111111", "Xiao", 90);
			System.out.println(hero.getModelName());
			System.out.println(hero.getOwnerName());
			System.out.println(hero.getRegistrationNumber());
			System.out.println(hero.getSpeed());
			hero.gps();
			
			System.out.print("\n");
			
			Ford honda = new Ford("Ford test", "190940", "Diluc", 110);
			System.out.println(honda.getModelName());
			System.out.println(honda.getOwnerName());
			System.out.println(honda.getRegistrationNumber());
			System.out.println(honda.getSpeed());
			honda.tempControl();

	}

}
