package edu.century.project1;

public class Athlete {

	private String name;
	private Country homeCountry; //TODO change to Country object once created 
	private Sport specialty;  //TODO change to Sport object once created
	private int skill;
	private int medals ;
	
	public Athlete() {
		name = "None";
		homeCountry = Country.selectRandomCountry();
		specialty = Sport.selectRandomSport();
		skill = 0;
		medals  = 0;
	}
	
	public Athlete(String userName, Country userCountry, Sport userEvent, int level, int gold) {   
		name = userName;
		homeCountry = userCountry;
		specialty = userEvent;
		skill = level;
		medals  = gold;
	}
	
	public String getName() {
		return name;
	}
	
	public Country getHomeCountry()  { 
		return homeCountry;
	}
	
	public Sport getSpecialty() { 
		return specialty;
	}
	
	public int getSkill() {
		return skill;
	}
	
	public int getMedal() {
		return medals ;
	}
	
	public void  setName(String input) {
		name = input;
	}
	
	public void  setSpecialty(Sport input) {
		specialty = input;
	}
	
	public void  setSkill(int input) {
		skill = input;
	}
	
	public void setMedals(int input) {
		medals = input;
	} 
	
	public String toString() {
		return ""; //TODO  Finish toString Method
	}
	 
	public boolean equals(Object) {
		// TODO finish .equals method
	}
}
