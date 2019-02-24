/**
 * 
 */
package com.unsalan.sprindemo;

/**
 * @author can
 *
 */
public class BaseballCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor
	
	public BaseballCoach(FortuneService service) {		
		this.fortuneService = service;
	}
	
	public String getWorkOut() {
		return "spend 30 minutes on batting practice";
	}

	/* (non-Javadoc)
	 * @see com.unsalan.sprindemo.Coach#getDailyFortune()
	 */
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	@Override
	public String getEmailAdrress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTeam() {
		// TODO Auto-generated method stub
		return null;
	}
}
