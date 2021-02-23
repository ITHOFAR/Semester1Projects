package harris.TIEFIGHTERS;

import harris.TIESPT.*;
import harris.TIEWPNS.*;

public class TieFighter_S extends TieFighter{

	//CONSTRUCTOR
	public TieFighter_S(String IDNumber, TiePilot pilot) {
		super(IDNumber, pilot);
		setManufacturer("Sienar Fleet Systems");
		setModel("Tie Standard");
		setFighterClass("Superiority");
		setLength(6.3);
		setWidth(6.4);
		setHeight(7.4);
		setFuelCapacity(200);
		setMaxSpeed(1200);

		TieWeapon[] pewpew = new TieWeapon[2];
		pewpew[0] = new LaserCannon("L1");
		pewpew[1] = new LaserCannon("L1");

		setWpns(pewpew);
		setCurrentLocation(new Location(10, 12, 0));
	}
	
	@Override 
	public void FiresCannons() {
		getWpns()[0].Fire();
		getWpns()[1].Fire();
	}
	
	//Maneuvering 
	@Override
	public void MoveLeft() {
		getCurrentLocation().setX(getCurrentLocation().getX()-1);
	}
	
	@Override
	public void MoveRight() {
		getCurrentLocation().setX(getCurrentLocation().getX()+1);
	}
	
	@Override
	public void MoveForward() {
		getCurrentLocation().setY(getCurrentLocation().getY()+1);
	}
	
	@Override
	public void MoveBackward() {
		getCurrentLocation().setY(getCurrentLocation().getY()-1);
	}
	
	@Override
	public void Ascend() {
		getCurrentLocation().setZ(getCurrentLocation().getZ()+1);
	}
	
	@Override
	public void Descend() {
		getCurrentLocation().setZ(getCurrentLocation().getZ()-1);
	}
	
	@Override
	public void Land() {
		getCurrentLocation().setZ(0);
		setLanded(true);
		setSpaceborne(false);
	}
	
	@Override
	public void Takeoff() {
		getCurrentLocation().setZ(10);
		setLanded(false);
		setSpaceborne(true);
	}
	//Scanning
	@Override
	public void scanTarget() {
		System.out.println(getIDNumber() + " is scanning for targets");
	}
}
