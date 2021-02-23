package harris.MAIN;

import java.util.Collections;
import java.util.Iterator;

import harris.CLASSES.STBuilder;
import harris.CLASSES.StormTrooper;

public class StormTrooperBuilder {

	public static void main(String[] args) {
		STBuilder b = new STBuilder("Stormy", 5);
		b.buildTrooper(3);
		Collections.sort(b.getStorage(), new StormTrooper.sortByHeight());
		for (StormTrooper s: b.getStorage()) {
			
		}
		
		Iterator<StormTrooper> sIT = b.getStorage().iterator();
		while(sIT.hasNext()) {
			//sIT.next().displayStormtrooper();
		}
	}

}
