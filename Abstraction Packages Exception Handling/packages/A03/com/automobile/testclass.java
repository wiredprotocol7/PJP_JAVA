package com.automobile;

import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class testclass {

	public static void main(String[] args) 
	{
	
		
			Hero hero = new Hero("Hero test", "111111", "Xiao", 90);
			System.out.println(hero.getModelName());
			System.out.println(hero.getOwnerName());
			System.out.println(hero.getRegistrationNumber());
			System.out.println(hero.getSpeed());
			hero.radio();
			
			System.out.print("\n");
			
			Honda honda = new Honda("Honda test", "190940", "Diluc", 110);
			System.out.println(honda.getModelName());
			System.out.println(honda.getOwnerName());
			System.out.println(honda.getRegistrationNumber());
			System.out.println(honda.getSpeed()+" kmph");
			honda.cdplayer();

	}

}
