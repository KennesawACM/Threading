package simulator;

/**
 * @author Tyler Davis
 * @param Parameters: enum Simulator_Type
 * Only use getInstance(type) to instantiate. 
 * This will help maintain uniformity with the constructors.
 */

public class Simulator {

	public enum Simulator_Type {
		DISEASE_ONE, DISEASE_TWO, DISEASE_THREE, DISEASE_FOUR, DEFAULT;
	}
	
	Simulator_Type type;
	
	public Simulator() {
		
	}
	
	public Simulator(Simulator_Type type) {
		
		this.type = type;
	}
	
	public static Simulator getInstance(Simulator_Type type) {
		
		//use this: Simulator simulator = Simulator.getInstance(type);
		//instead of: Simulator simulator = new Simulator(type);
		return new Simulator(type);
	}
	
	public void run_Simulator() {
		
		//each case will end up allowing us to run_Simulator() using a given instance
		//this will be the method that actually starts the simulation
		//println for place holding at the moment, eventually change for logs
		switch(type) {
		case DISEASE_ONE: 
			System.out.println("Run simulation for DISEASE_ONE");
			break;
		case DISEASE_TWO: 
			System.out.println("Run simulation for DISEASE_TWO");
			break;
		case DISEASE_THREE: 
			System.out.println("Run simulation for DISEASE_THREE");
			break;
		case DISEASE_FOUR: 
			System.out.println("Run simulation for DISEASE_FOUR");
			break;
		case DEFAULT: 
			System.out.println("Run a DEFAULT simulation");
			break;
		default:
			System.out.println("Invalid Simulation Type");
			System.exit(0);
		}
	}
	
	public Simulator_Type get_Type() {
		
		return type;
	}
}
