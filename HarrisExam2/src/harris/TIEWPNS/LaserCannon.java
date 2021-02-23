package harris.TIEWPNS;

public class LaserCannon extends TieWeapon{
	private String Model;
	private int MaxRange;
	private int AmmoCapacity;
	private int CurrentAmmoCount;
	
	//CONSTRUCTOR
	public LaserCannon(String Model) {
		super(Model);
		this.MaxRange = 1000;
		this.AmmoCapacity = 500;
		this.CurrentAmmoCount= 500;
	}
	@Override
	public void Fire() {
		if (this.CurrentAmmoCount > 0) {
			this.CurrentAmmoCount -= 1;
			System.out.println("Firing Cannons");
		}
		else {System.out.println("Ammunition Expended");}
	}

	//GETTERS AND SETTERS
	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getMaxRange() {
		return MaxRange;
	}

	public void setMaxRange(int maxRange) {
		MaxRange = maxRange;
	}

	public int getAmmoCapacity() {
		return AmmoCapacity;
	}

	public void setAmmoCapacity(int ammoCapacity) {
		AmmoCapacity = ammoCapacity;
	}

	public int getCurrentAmmoCount() {
		return CurrentAmmoCount;
	}

	public void setCurrentAmmoCount(int currentAmmoCount) {
		CurrentAmmoCount = currentAmmoCount;
	}
	
	
}
