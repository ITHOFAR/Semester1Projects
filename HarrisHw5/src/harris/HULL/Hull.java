package harris.HULL;


public class Hull {
	private String IDNumber;
	private FwdHullSection SectionFWD;
	private AftHullSection SectionAFT;
	
	public Hull(String IDNumber, String starDestroyer) {
		this.IDNumber = IDNumber;
		this.SectionFWD = new FwdHullSection(starDestroyer);
		this.SectionAFT = new AftHullSection(starDestroyer);
	}
	
	public void displayHullSpecs() {
		String output = SectionFWD.HullInfo() + SectionAFT.HullInfo();
		System.out.println(output);
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public FwdHullSection getSectionFWD() {
		return SectionFWD;
	}

	public void setSectionFWD(FwdHullSection sectionFWD) {
		SectionFWD = sectionFWD;
	}

	public AftHullSection getSectionAFT() {
		return SectionAFT;
	}

	public void setSectionAFT(AftHullSection sectionAFT) {
		SectionAFT = sectionAFT;
	}
	
}
