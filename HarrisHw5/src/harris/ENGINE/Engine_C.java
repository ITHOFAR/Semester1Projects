package harris.ENGINE;

public class Engine_C extends ShipEngine {
	private static String EngineType = "C";
	
	public Engine_C(String starDestroyerType) {
		super(EngineType, starDestroyerType, 0, 0, 0, 0);
		if (starDestroyerType == "Imperial_I") {
			super.setLength(225);
			super.setHeight(75);
			super.setPower(15000000);
			super.setWeight(125);
		}
		if (starDestroyerType == "Imperial_II") {
			super.setLength(275);
			super.setHeight(80);
			super.setPower(17000000);
			super.setWeight(125);
		}
	}
	public String EngineInfo() {
		String output = String.format(
			"%nEngine C:             %d     %d      %,d     %d"
			,super.getLength(), super.getHeight(), super.getPower(), super.getWeight());
	return output;
	}
	public String getEngineType() {
		return EngineType;
	}

}
