package com.objectdesign;

import java.util.Scanner;

public class ClothingStore {

	public static void main(String[] args) {

		Scanner cs = new Scanner(System.in);
		String userInput = null;
		int number = 0;
		boolean fail = false;
		
		SportsJerseys newJersey = new SportsJerseys();
		
		System.out.println("Welcome to the sports jersey store, where you can build your customized jersey.");
		
		System.out.println("What sport type do you want for your jersey?");
		userInput = cs.nextLine();
		newJersey.setSport(userInput);
		
		System.out.println("What is the name of the team?\nCity and mascot");
		userInput = cs.nextLine();
		newJersey.setTeam(userInput);
		
		System.out.println("What is the variation of team logo do you want?");
		userInput = cs.nextLine();
		newJersey.setLogo(userInput);
		
		System.out.println("What is the primary color of the team that"
					+ " you want to use for the jersey?");
		userInput = cs.nextLine();
		newJersey.setPrimaryColor(userInput);
		
		System.out.println("What is the secondary color of the team that"
					+ " you want to use for the jersey?");
		userInput = cs.nextLine();
		newJersey.setSecondaryColor(userInput);
		
		System.out.println("Would you like a home, away, or alternate style of your team for the jersey?");
		userInput = cs.nextLine();
		newJersey.setHomeOrAway(userInput);
		
		do {
			System.out.println("What number would you like on the back of the jersey?");
			userInput = cs.nextLine();
			fail = isNumber(userInput);	
		} while (fail);
		number = Integer.parseInt(userInput);
		newJersey.setNumberOnBack(number);
		
		System.out.println("What name would you like to have printed on the back of the jersey?");
		userInput = cs.nextLine();
		newJersey.setNameOnBack(userInput);
	
		System.out.println("What size would you like to have for your jersey?\n"
					+ "ex: small, medium, large, x-large");
		userInput = cs.nextLine();
		newJersey.setSize(userInput);
		
		System.out.println("What fabric type would you like for the jersey?");
		userInput = cs.nextLine();
		newJersey.setFabric(userInput);
		
		System.out.println("What length sleeve would you like for the jersey?\n"
				+ "ex: short, half, long");
		userInput =cs.nextLine();
		newJersey.setSleeveLength(userInput);
		
		System.out.println(newJersey.toString());
	}
	
	public static boolean isNumber(String inputToNumber) {
		try {
			int userNumber = Integer.parseInt(inputToNumber);
			return false;
		} catch (NumberFormatException e) {
			return true;
		}
	}
}
