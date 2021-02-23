package harris.TIEWPNS;

public abstract class TieWeapon {
	private String Model;
	
	//CONSTRUCTOR
	public TieWeapon(String Model) {
		this.Model = Model;
	}
	
	public abstract void Fire();

	//GETTERS AND SETTERS
	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}
	
	
}
