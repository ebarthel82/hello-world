package edu.century.project1;

import java.util.Random;

public enum Country {
	UnitedStates, 
	Canada, 
	Mexico, 
	Panama,
	Haiti, 
	Jamaica, 
	Peru,
	Cuba, 
	ElSalvador,
	PuertoRico, 
	Colombia, 
	Venezuela, 
	Honduras, 
	Guyana,
	Guatemala,
	Bolivia,
	Argentina,
	Ecuador, 
	Chile, 
	Brazil;
	
	public static Country selectRandomCountry() {
        Random rand = new Random();
        int r = rand.nextInt(Country.values().length);
        
        return Country.values()[r];
}
	}
