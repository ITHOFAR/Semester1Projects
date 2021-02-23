package harris.MAIN;

import java.io.IOException;

import harris.CLASSES.Decoder_1;
import harris.CLASSES.ImperialDecoder;

//Main Class
public class harrisDecoder {

	public static void main(String[] args) throws IOException{
		Decoder_1 dc = new Decoder_1("DHarris-1");
		dc.analyzeFile(ImperialDecoder.getMsgDirectory() + "CodeFile1.txt");
		System.out.println();
		dc.analyzeFile(ImperialDecoder.getMsgDirectory() + "CodeFile2.txt");
	}

}
