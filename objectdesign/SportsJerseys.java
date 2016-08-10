package com.objectdesign;

public class SportsJerseys extends Clothing {
	
	public String sport = null;
	public String team = null;
	public String logo = null; 
	public String size = null;
	public String fabric = null;
	public String sleeveLength = null;
	public String nameOnBack = null;
	public String primaryColor = null;
	public String secondaryColor = null;
	public String homeOrAway = null;
	public int numberOnBack = 0;

	public SportsJerseys(String sport, String team, String logo, String size, String fabric, String sleeveLength,
			String nameOnBack, String primaryColor, String secondaryColor, String homeOrAway, int numberOnBack) {
		super();
		this.sport = sport;
		this.team = team;
		this.logo = logo;
		this.size = size;
		this.fabric = fabric;
		this.sleeveLength = sleeveLength;
		this.nameOnBack = nameOnBack;
		this.primaryColor = primaryColor;
		this.secondaryColor = secondaryColor;
		this.homeOrAway = homeOrAway;
		this.numberOnBack = numberOnBack;
	}
	
	public SportsJerseys() {
	}
	
	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getFabric() {
		return fabric;
	}

	public void setFabric(String fabric) {
		this.fabric = fabric;
	}

	public String getSleeveLength() {
		return sleeveLength;
	}

	public void setSleeveLength(String sleeveLength) {
		this.sleeveLength = sleeveLength;
	}

	public String getNameOnBack() {
		return nameOnBack;
	}

	public void setNameOnBack(String nameOnBack) {
		this.nameOnBack = nameOnBack;
	}

	public String getPrimaryColor() {
		return primaryColor;
	}

	public void setPrimaryColor(String primaryColor) {
		this.primaryColor = primaryColor;
	}

	public String getSecondaryColor() {
		return secondaryColor;
	}

	public void setSecondaryColor(String secondaryColor) {
		this.secondaryColor = secondaryColor;
	}

	public String getHomeOrAway() {
		return homeOrAway;
	}

	public void setHomeOrAway(String homeOrAway) {
		this.homeOrAway = homeOrAway;
	}

	public int getNumberOnBack() {
		return numberOnBack;
	}

	public void setNumberOnBack(int numberOnBack) {
		this.numberOnBack = numberOnBack;
	}

	@Override
	public void fabricType() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void qualityLevel() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void typeOfClothing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "You have created a new sports jersey!\n"
				+ "It's a " + team + " jersey of the " + sport + ".\nIt's a "
				+ homeOrAway + " jersey that's " + primaryColor + " and " + secondaryColor
				+ " with the " + logo + " logo.\nThe name and number on the back are "
				+ nameOnBack + " and " + numberOnBack + ".\nIt's a " + size + " sized jersey, made "
				+ "of " + fabric + ", and has " + sleeveLength + " sleeves.";
	}

	
	
}