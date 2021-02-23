package harris.DECK;

public class MainDeck extends ShipDeck{
	private static String DeckType = "Top Deck";

	public MainDeck(String StarDestroyerType) {
		super(DeckType, StarDestroyerType, 0, 0, 0, 0);
		if (StarDestroyerType == "Imperial_I") {
			super.setLength(600);
			super.setHeight(50);
			super.setWidth(400);
			super.setWeight(250);
		}
		if (StarDestroyerType == "Imperial_II") {
			super.setLength(700);
			super.setHeight(56);
			super.setWidth(450);
			super.setWeight(300);
		}
	}
	public String DeckInfo() {
		String output = String.format(
				"%nMain Deck:            %d     %d      %d    %d",
				super.getLength(), super.getHeight(), super.getWidth(), super.getWeight());
		return output;
	}
	public String getDeckType() {
		return DeckType;
	}
}
