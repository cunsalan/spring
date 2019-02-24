package com.unsalan.sprindemo;

public class CricketCoach implements Coach {

	//define a private field for the dependency
	private FortuneService fortuneService;	
	private String emailAddress;	
	private String team;
	
	public CricketCoach() {
		super();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public void setEmailAddress(String emailAddres) {
		System.out.println("inside setter method for email");
		this.emailAddress = emailAddres;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("inside setter method for team");
		this.team = team;
	}

	@Override
	public String getWorkOut() {
		// TODO Auto-generated method stub
		return "work hard for better fetch";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "you are in for a luck";
	}

	@Override
	public String getEmailAdrress() {
		return emailAddress;
	}

	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// add an destroy method
	public void doMyCleanUpStuff() {
		System.out.println("TrackCoach: inside method doMyCleanUpStuff");
	}
}
