package harris.STARDESTROYER;

import harris.DECK.Deck;
import harris.ENGINE.Engine;
import harris.HULL.Hull;

public class Imperial_II extends StarDestroyer{
	private static String ShpClass = "Imperial_II";
	private int ShpCrew = 12000;

	public Imperial_II(String ShpNumber, String ShpName) {
		super(ShpNumber, ShpName);
		super.setShpCrew(this.ShpCrew);
		super.setShpClass(ShpClass);
		super.setShpHulls(new Hull("H1", ShpClass));
		super.setShpDecks(new Deck("D1", ShpClass));
		super.setShpEngines(new Engine("E1", ShpClass));
	}

	public void displayShipInfo() {
		String output = String.format(
				"________IMPERIAL STAR DESTROYER %s"
						+ "%nShip Number %s"
						+ "%nShip Class %s"
						+ "%nCrew: %,d"
						,super.getShpName(), super.getShpNumber(), super.getShpClass(), super.getShpCrew());
		System.out.println(output);
		System.out.println();
		super.getShpHulls().displayHullSpecs();
		System.out.println();
		super.getShpDecks().displayDeckSpecs();
		System.out.println();
		super.getShpEngines().displayEngineSpecs();
		System.out.println();
	}

	@Override
	public void navigatesToPosistion(String p) {
		System.out.println("Navigating to Posistion " + p);
	}

	public String getShpClass() {
		return ShpClass;
	}

	public int getShpCrew() {
		return ShpCrew;
	}

	public void setShpCrew(int shpCrew) {
		ShpCrew = shpCrew;
	}


}
