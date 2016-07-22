package com.vishnu;

/**
 * @author Bhanu 7/22/2016
 */
public class Car {

	private Engine engine;
	private String warningMessage;

	public String getWarningMessage() {
		return warningMessage;
	}
	
	public void accelerate(){
		
		engine.increaseRpm();
		if(engine.getRpm()>5000){
			warningMessage= "Slow Down";
		}
	}

	public void setWarningMessage(String warningMessage) {
		this.warningMessage = warningMessage;
	}

	public Car(Engine engine) {
		this.engine = engine;
	}
	
	

}
