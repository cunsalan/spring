/**
 * 
 */
package com.unsalan.sprindemo;

/**
 * @author can
 *
 */
public class TrackCoach implements Coach {

	/* (non-Javadoc)
	 * @see com.unsalan.sprindemo.Coach#getWorkOut()
	 */
	@Override
	public String getWorkOut() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	/* (non-Javadoc)
	 * @see com.unsalan.sprindemo.Coach#getDailyFortune()
	 */
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
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
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// add an destroy method
	public void doMyCleanUpStuff() {
		System.out.println("TrackCoach: inside method doMyCleanUpStuff");
	}
	
	

}
