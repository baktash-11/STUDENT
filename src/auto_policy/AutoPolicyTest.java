package auto_policy;

public class AutoPolicyTest {

	public static void main(String[] args) {
		// create two auto policy objects
		
		AutoPolicy policy1 = new AutoPolicy(121, "Toyota Camry 2018", "NJ");
		AutoPolicy policy2 = new AutoPolicy(123, "Honda Accord 2020", "ME");


		// display whether each policy is in a no-fault state
		policyInNofaultState(policy1);
		policyInNofaultState(policy2);




	}
	// method that display wethere an AutoPolicy is in a state no fault auto insurace 
	public static void policyInNofaultState(AutoPolicy policy){
		
		System.out.println("The auto Policy:");

		System.out.printf("Acount#: %d Car: %s%n State %s  %s a no-fault state.%n" , 
				policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(), 
				policy.isNofaultState()?"is":"is not");
	}


}
