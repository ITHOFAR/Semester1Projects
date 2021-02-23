package harris.TIEFIGHTERS;

import harris.TIEOPS.*;
import harris.TIESPT.*;
import harris.TIEWPNS.*;

public abstract class TieFighter implements Maneuvering, Scanning{
	private String manufacturer;
	private String IDNumber;
	private String model;
	private TieWeapon[] wpns;
	private TiePilot pilot;
	private String fighterClass;
	private double length;
	private double width;
	private double height;
	private int fuelCapacity;
	private int maxSpeed;
	private boolean isLanded;
	private boolean isSpaceborne;
	private Location currentLocation;

	//CONSTRUCTOR 
	public TieFighter(String IDNumber, TiePilot pilot) {
		this.IDNumber = IDNumber;
		this.pilot = pilot;

	}

	public void displayFighterData() {
		System.out.printf(
				"MODEL: %s"
				+ "%nID Number: %s"
				+ "%nPILOT ID Number: %s"
				+ "%nPILOT RANK: %s %n",
				this.model, this.IDNumber, this.pilot.getIDNumber(), this.pilot.getRank());
	}

	public abstract void FiresCannons();

	//GETTERS AND SETTERS
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public TieWeapon[] getWpns() {
		return wpns;
	}

	public void setWpns(TieWeapon[] wpns) {
		this.wpns = wpns;
	}

	public TiePilot getPilot() {
		return pilot;
	}

	public void setPilot(TiePilot pilot) {
		this.pilot = pilot;
	}

	public String getFighterClass() {
		return fighterClass;
	}

	public void setFighterClass(String fighterClass) {
		this.fighterClass = fighterClass;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public boolean isLanded() {
		return isLanded;
	}

	public void setLanded(boolean isLanded) {
		this.isLanded = isLanded;
	}

	public boolean isSpaceborne() {
		return isSpaceborne;
	}

	public void setSpaceborne(boolean isSpaceborne) {
		this.isSpaceborne = isSpaceborne;
	}

	public Location getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(Location currentLocation) {
		this.currentLocation = currentLocation;
	}
}
