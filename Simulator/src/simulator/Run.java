package simulator;

/**
 * @author Tyler Davis
 * This will initiate the Simulator
 */

public class Run extends Simulator {

	public static void main(String[] args) {
		
		Simulator sim = getInstance(Simulator_Type.DISEASE_TWO);
		System.out.println("Sim type: " + sim.get_Type());
		sim.run_Simulator();
	}
}
