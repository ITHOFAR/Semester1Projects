package harris.DECK;

public class TopDeck extends ShipDeck{
	private static String DeckType = "Top Deck";
	
	public TopDeck(String StarDestroyerType) {
		super(DeckType, StarDestroyerType, 0, 0, 0, 0);
		if (StarDestroyerType == "Imperial_I") {
			super.setLength(300);
			super.setHeight(30);
			super.setWidth(250);
			super.setWeight(125);
		}
		if (StarDestroyerType == "Imperial_II") {
			super.setLength(350);
			super.setHeight(34);
			super.setWidth(300);
			super.setWeight(150);
		}
	}
	public String DeckInfo() {
		String output = String.format(
				"%nTop Deck:             %d     %d      %d    %d"
				,super.getLength(), super.getHeight(), super.getWidth(), super.getWeight());
		return output;
	}
	public String getDeckType() {
		return DeckType;
	}
}
