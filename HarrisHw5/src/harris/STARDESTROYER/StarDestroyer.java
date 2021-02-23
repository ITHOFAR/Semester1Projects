package harris.STARDESTROYER;

import harris.INTERFACES.Maneuvers;
import harris.DECK.*;
import harris.HULL.*;
import harris.ENGINE.*;

public abstract class StarDestroyer implements Maneuvers{
	private String ShpNumber;
	private String ShpType = "Star Destroyer";
	private String ShpName;
	private String ShpClass;
	private int ShpCrew;
	private Hull ShpHulls;
	private Deck ShpDecks;
	private Engine ShpEngines;
	
	public StarDestroyer() {}

	public StarDestroyer(String ShpNumber, String ShpName) {
		this.ShpNumber = ShpNumber;
		this.ShpName = ShpName;
	}

	public void displayShipInfo() {}
	

	public String getShpNumber() {
		return ShpNumber;
	}

	public void setShpNumber(String shpNumber) {
		ShpNumber = shpNumber;
	}

	public String getShpType() {
		return ShpType;
	}

	public void setShpType(String shyType) {
		ShpType = shyType;
	}

	public String getShpName() {
		return ShpName;
	}

	public void setShpName(String shpName) {
		ShpName = shpName;
	}

	public String getShpClass() {
		return ShpClass;
	}

	public void setShpClass(String shpClass) {
		ShpClass = shpClass;
	}

	public int getShpCrew() {
		return ShpCrew;
	}

	public void setShpCrew(int shpCrew) {
		ShpCrew = shpCrew;
	}

	public Hull getShpHulls() {
		return ShpHulls;
	}

	public void setShpHulls(Hull shpHulls) {
		ShpHulls = shpHulls;
	}

	public Deck getShpDecks() {
		return ShpDecks;
	}

	public void setShpDecks(Deck shpDecks) {
		ShpDecks = shpDecks;
	}

	public Engine getShpEngines() {
		return ShpEngines;
	}

	public void setShpEngines(Engine shpEngines) {
		ShpEngines = shpEngines;
	}

	
}
