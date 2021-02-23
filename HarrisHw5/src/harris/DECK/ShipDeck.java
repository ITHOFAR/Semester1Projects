package harris.DECK;

public abstract class ShipDeck {
	private String DeckType;
	private String StarDestroyerType;
	private int Length;
	private int Height;
	private int Width;
	private int Weight;
	
	public ShipDeck(String deckType, String starDestroyerType, int length, int height, int width, int weight) {
		this.DeckType = deckType;
		this.StarDestroyerType = starDestroyerType;
		this.Length = length;
		this.Height = height;
		this.Width = width;
		this.Weight = weight;
	}
	
	public ShipDeck() {}
	
	public String DeckInfo() {
		String output = String.format(
			        "________DECK SPECIFICATIONS"
				+ "%nDeck Number: D1"
				+ "%n                      Length  Height  Width  Weight");
		return output;
	}

	public String getDeckType() {
		return DeckType;
	}

	public void setDeckType(String deckType) {
		DeckType = deckType;
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

	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}
	
	
}
