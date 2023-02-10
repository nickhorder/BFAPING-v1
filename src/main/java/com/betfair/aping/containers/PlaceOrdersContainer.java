package com.betfair.aping.containers;


//import com.betfair.aping.entities.PlaceExecutionReport;
import com.betfair.aping.api.InstructionAndExecution;
public class PlaceOrdersContainer extends Container {

	private InstructionAndExecution result;
	
	public InstructionAndExecution getResult() {
		return result;
	}
	
	public void setResult(InstructionAndExecution result) {
		this.result = result;
	}

}
