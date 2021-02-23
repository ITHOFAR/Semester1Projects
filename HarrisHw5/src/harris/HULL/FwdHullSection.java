package harris.HULL;

public class FwdHullSection extends HullSection {
	
	private static String HullType = "Fwd";
	public FwdHullSection(String starDestroyerType) {
		super(HullType, starDestroyerType, 0, 0, 0, 0);
		if (starDestroyerType == "Imperial_I") {
			super.setLength(900);
			super.setHeight(100);
			super.setWidth(75);
			super.setWeight(350);
		}
		if (starDestroyerType == "Imperial_II") {
			super.setLength(900);
			super.setHeight(100);
			super.setWidth(200);
			super.setWeight(400);
		}
	}
	public String HullInfo() {
		String output = String.format(
			        "________Hull SPECIFICATIONS"
				+ "%nHull Number: H1"
				+ "%n                      Length  Height  Width  Weight"
				+ "%nForward Hull:         %3d   %5d     %-3d    %3d"
				,super.getLength(), super.getHeight(), super.getWidth(), super.getWeight());
		return output;
	}
	public String getHullType() {
		return HullType;
	}
}
