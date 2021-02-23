package harris.DECK;

public class Deck {
	private String IDNumber;
	private Bridge Deck_Bridge;
	private TopDeck Deck_Top;
	private MainDeck Deck_Main;
	
	public Deck(String IDNumber, String starDestroyer) {
		this.IDNumber = IDNumber;
		this.Deck_Bridge = new Bridge(starDestroyer);
		this.Deck_Top = new TopDeck(starDestroyer);
		this.Deck_Main = new MainDeck(starDestroyer);
	}
	
	public void displayDeckSpecs() {
		String output = Deck_Bridge.DeckInfo() + Deck_Top.DeckInfo() + Deck_Main.DeckInfo();
		System.out.println(output);
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public Bridge getDeck_Bridge() {
		return Deck_Bridge;
	}

	public void setDeck_Bridge(Bridge deck_Bridge) {
		Deck_Bridge = deck_Bridge;
	}

	public TopDeck getDeck_Top() {
		return Deck_Top;
	}

	public void setDeck_Top(TopDeck deck_Top) {
		Deck_Top = deck_Top;
	}

	public MainDeck getDeck_Main() {
		return Deck_Main;
	}

	public void setDeck_Main(MainDeck deck_Main) {
		Deck_Main = deck_Main;
	}
	
}
