package harris.ENGINE;

public class Engine_S extends ShipEngine{
	private static String EngineType = "S";

	public Engine_S(String starDestroyerType) {
		super(EngineType, starDestroyerType, 0, 0, 0, 0);
		if (starDestroyerType == "Imperial_I") {
			super.setLength(100);
			super.setHeight(50);
			super.setPower(8000000);
			super.setWeight(100);
		}
		if (starDestroyerType == "Imperial_II") {
			super.setLength(115);
			super.setHeight(60);
			super.setPower(9000000);
			super.setWeight(100);
		}
	}
	public String EngineInfo() {
		String output = String.format(
		        "________ENGINE SPECIFICATIONS"
			+ "%nDeck Number: E1"
			+ "%n                      Length  Height  Power          Weight"
			+ "%nEngine S1:            %d     %d      %,d      %d"
			+ "Engine S2:            %d     %d      %,d      %d"
			,super.getLength(), super.getHeight(), super.getPower(), super.getWeight()
			,super.getLength(), super.getHeight(), super.getPower(), super.getWeight());
	return output;
	}
	public String getEngineType() {
		return EngineType;
	}
}
