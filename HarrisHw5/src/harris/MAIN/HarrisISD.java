package harris.MAIN;

import harris.STARDESTROYER.Imperial_I;
import harris.STARDESTROYER.Imperial_II;

public class HarrisISD {

	public static void main(String[] args) {
		Imperial_I ISD1 = new Imperial_I("ISD-001", "Avenger");
		Imperial_II ISD2 = new Imperial_II("ISD-002", "Devastator");
		
		ISD1.displayShipInfo();
		System.out.println();
		ISD2.displayShipInfo(); 
		
		
	}

}
