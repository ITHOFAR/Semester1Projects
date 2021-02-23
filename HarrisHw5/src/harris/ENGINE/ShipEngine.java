package harris.ENGINE;

public abstract class ShipEngine {
	private String EngineType;
	private String StarDestroyerType;
	private int Length;
	private int Height;
	private int Power;
	private int Weight;
	
	public ShipEngine(String engineType, String starDestroyerType, int length, int height, int power, int weight) {
		this.EngineType = engineType;
		this.StarDestroyerType = starDestroyerType;
		this.Length = length;
		this.Height = height;
		this.Power = power;
		this.Weight = weight;
	}
	

	public String EngineInfo() {
		String output = String.format(
			        "________ENGINE SPECIFICATIONS"
				+ "%nDeck Number: E1"
				+ "%n                      Length  Height  Power        Weight");
		return output;
	}

	public String getEngineType() {
		return EngineType;
	}

	public void setEngineType(String engineType) {
		EngineType = engineType;
	}

	public String getStarDestroyerType() {
		return StarDestroyerType;
	}

	public void setStarDestroyerType(String starDestroyerType) {
		StarDestroyerType = starDestroyerType;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public int getPower() {
		return Power;
	}

	public void setPower(int power) {
		Power = power;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}
	
}
