package harris.TIEWPNS;

public class ProtonBomb extends TieWeapon{
	private String Model;
	private int Yield;
	private boolean Dropped;
	
	//CONSTRUCTOR
	public ProtonBomb(String Model) {
		super(Model);
		this.Yield = 7;
		this.Dropped = false;
	}
	
	@Override
	public void Fire() {
		this.Dropped = true;
	}

	
	//GETTERS AND SETTERS
	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getYield() {
		return Yield;
	}

	public void setYield(int yield) {
		Yield = yield;
	}

	public boolean isDropped() {
		return Dropped;
	}

	public void setDropped(boolean dropped) {
		Dropped = dropped;
	}
	
	
}
