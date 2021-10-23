package edu.century.project1;

import java.util.Random;

public enum Sport {
	Swimming,
	Skateboarding,
	Fencing,
	Diving,
	Hockey,
	Surfing,
	Taekwando,
	Tennis,
	BeachVolleyBall,
	Golf,
	Rowing,
	Wrestling,
	WeightLifting,
	Judo;
	
	public static Sport selectRandomSport() {
        Random rand = new Random();
        int r = rand.nextInt(Sport.values().length);
        
        return Sport.values()[r];
		}
	}
