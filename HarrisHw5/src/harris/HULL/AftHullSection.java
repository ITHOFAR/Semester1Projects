package harris.HULL;

public class AftHullSection extends HullSection{
	
	private static String HullType = "Aft";
	public AftHullSection(String starDestroyerType) {
		super(HullType, starDestroyerType, 0, 0, 0, 0);
		if (starDestroyerType == "Imperial_I") {
			super.setLength(700);
			super.setHeight(200);
			super.setWidth(325);
			super.setWeight(550);
		}
		if (starDestroyerType == "Imperial_II") {
			super.setLength(900);
			super.setHeight(275);
			super.setWidth(300);
			super.setWeight(700);
		}
	}
	public String HullInfo() {
		String output = String.format(
				"%nAft Hull:             %d     %d     %d    %d"
				,super.getLength(), super.getHeight(), super.getWidth(), super.getWeight());
		return output;
	}
	public String getHullType() {
		return HullType;
	}
}
