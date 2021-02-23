package harris.DECK;

public class Bridge extends ShipDeck{
	private static String DeckType = "Bridge";
	
	public Bridge(String StarDestroyerType) {
		super(DeckType, StarDestroyerType, 0, 0, 0, 0);
		if (StarDestroyerType == "Imperial_I") {
			super.setLength(150);
			super.setHeight(20);
			super.setWidth(100);
			super.setWeight(75);
		}
		if (StarDestroyerType == "Imperial_II") {
			super.setLength(200);
			super.setHeight(22);
			super.setWidth(150);
			super.setWeight(100);
		}
	}
	public String DeckInfo() {
		String output = String.format(
			        "________DECK SPECIFICATIONS"
				+ "%nDeck Number: D1"
				+ "%n                      Length  Height  Width  Weight"
				
				+ "%nBridge:               %d     %d      %d    %d"
				, super.getLength(), super.getHeight(), super.getWidth(), super.getWeight());
		return output;
	}
	public String getDeckType() {
		return DeckType;
	}
}
