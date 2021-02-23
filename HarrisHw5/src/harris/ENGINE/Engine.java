package harris.ENGINE;

import java.util.ArrayList;

public class Engine {
	private String IDNumber;
	private ArrayList<ShipEngine> Engines = new ArrayList<>();
	
	public Engine(String IDNumber, String starDestroyer) {
		super();
		this.IDNumber = IDNumber;
		ShipEngine s1 = new Engine_S(starDestroyer);
		ShipEngine s2 = new Engine_S(starDestroyer);
		ShipEngine c1 = new Engine_C(starDestroyer);
		Engines.add(s1);
		Engines.add(c1);
		Engines.add(s2);
	}
	public void displayEngineSpecs() {
		String output = Engines.get(0).EngineInfo(); 
		String[] halves = output.split("Engine S2");
		output = halves[0] + Engines.get(1).EngineInfo() + "\nEngine S2" + halves[1];
		System.out.println(output);
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public ArrayList<ShipEngine> getEngines() {
		return Engines;
	}

	public void setEngines(ArrayList<ShipEngine> engines) {
		Engines = engines;
	}
	
}
