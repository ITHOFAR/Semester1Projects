package Harris.MAIN;

import java.io.IOException;

import Harris.FILECREATION.DataGenerator;

public class HarrisAnalysis {

	public static void main(String[] args) {
		try {
			DataGenerator.buildIntergerFile(DataGenerator.DIR + "IFile", 100);
			DataGenerator.buildDecimalFile(DataGenerator.DIR + "DFile", 100);
			DataGenerator.buildCharacterFile(DataGenerator.DIR + "CFile", 100);
			DataGenerator.buildAlphaNumericFile(DataGenerator.DIR + "AFile", 100);
		}
		catch(IOException e) {
			System.out.println("Ooops");
			e.printStackTrace();
		}
	}
}
	