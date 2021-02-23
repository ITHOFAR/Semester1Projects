package harris.TIEFIGHTERS;

import harris.TIEOPS.Bombing;
import harris.TIESPT.*;
import harris.TIEWPNS.*;

public class TieFighter_H extends TieFighter implements Bombing{

	//CONSTRUCTOR
	public TieFighter_H(String IDNumber, TiePilot pilot) {
		super(IDNumber, pilot);
		setManufacturer("Sienar Fleet Systems");
		setModel("Tie Heavy Fighter");
		setFighterClass("Close Support");
		setLength(7.8);
		setWidth(8.6);
		setHeight(5.0);
		setFuelCapacity(375);
		setMaxSpeed(850);

		TieWeapon[] pewpew = new TieWeapon[10];
		for (int i = 0; i < pewpew.length; i++) {
			if (i < 2) {pewpew[i] = new LaserCannon("L2");}
			if (i >=2 ) {pewpew[i] = new ProtonBomb("P1"); }
		}
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
		this.getCurrentLocation().setY(getCurrentLocation().getY()-1);
	}
	
	@Override
	public void Ascend() {
		this.getCurrentLocation().setZ(getCurrentLocation().getZ()+1);
	}
	
	@Override
	public void Descend() {
		this.getCurrentLocation().setZ(getCurrentLocation().getZ()-1);
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
	
	//Bombing
	private int bombCount = 2;
	@Override
	public boolean bombTarget() {
		while (bombCount < getWpns().length) {
			ProtonBomb anger = (ProtonBomb) getWpns()[bombCount];
			if (anger.isDropped() == false) {
				getWpns()[bombCount].Fire();
				System.out.println("Bombs Away");
				bombCount+=1;
				return true;
			}
			else {
				System.out.println("Bombs Expended");
				return false;
			}
		}
		return false;
	}
	
	
}
