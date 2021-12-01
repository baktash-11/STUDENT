package auto_policy;

public class AutoPolicy {
	private int accountNumber; 
	private String makeAndModel; 
	private String state;
	
	
	public AutoPolicy(int accountNumber, String makeAndModel, String state) {
	
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		this.state = state;
	}
//	setters 
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public void setMakeAndModel(String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}

	public void setState(String state) {
		this.state = state;
	}

//	getters 
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getMakeAndModel() {
		return makeAndModel;
	}
	
	public String getState() {
		return state;
	}

	
	



	@Override
	public String toString() {
		return "AutoPolicy [accountNumber=" + accountNumber + ", makeAndModel=" + makeAndModel + ", state=" + state
				+ "]";
	}
	
	public boolean isNofaultState(){
		
		boolean noFaultState;
		switch (getState()) {
			case "MA": 
			case "NJ":
			case "NY":
			case "PA":
				noFaultState= true;
				break;
		
			default:
				noFaultState = false;
				break;
				
		}

		return noFaultState; 
	}
	
	

}
