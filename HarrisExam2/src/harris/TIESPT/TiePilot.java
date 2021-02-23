package harris.TIESPT;

public class TiePilot {
	private String IDNumber;
	private String Rank;
	private String PilotRating;
	
	//CONSTRUCTOR
	public TiePilot(String IDNumber, String Rank, String PilotRating) {
		this.IDNumber = IDNumber;
		this.Rank = Rank;
		this.PilotRating = PilotRating;
	}
	
	public void displaysInfo() {
		System.out.printf(
			       "Imperial Pilot**********"
				+"%nID: %s"
				+"%nRANK: %s"
				+"%nRATING: %s %n",
				this.IDNumber, this.Rank, this.PilotRating);
	}

	//GETTERS AND SETTERS
	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public String getRank() {
		return Rank;
	}

	public void setRank(String rank) {
		Rank = rank;
	}

	public String getPilotRating() {
		return PilotRating;
	}

	public void setPilotRating(String pilotRating) {
		PilotRating = pilotRating;
	}
	
	
}
