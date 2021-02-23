package harris.CLASSES;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Decoder_1 extends ImperialDecoder{
	private String decoderType = "Imperial 1";
	
	public Decoder_1(String decoderID) {
		super(decoderID);
	}
	//using interface
	@Override
	public void analyzeFile(String filename) throws IOException {
		BufferedReader inputReader = null;
		ArrayList<Character> num1 = new ArrayList<>();
		ArrayList<Character> num2 = new ArrayList<>();
		ArrayList<Character> num3 = new ArrayList<>();
		ArrayList<Character> letterA = new ArrayList<>();
		ArrayList<Character> letterB = new ArrayList<>();
		ArrayList<Character> letterC = new ArrayList<>();
		
		try {
			inputReader = new BufferedReader(new FileReader(filename));
			String text;
			while ((text = inputReader.readLine())!= null) {
				for (char value: text.toCharArray()) {
					if (value == '1') {
						num1.add(value);
					}
					if (value == '2') {
						num2.add(value);
					}
					if (value == '3') {
						num3.add(value);
					}
					if (value == 'A') {
						letterA.add(value);
					}
					if (value == 'B') {
						letterB.add(value);
					}
					if (value == 'C') {
						letterC.add(value);
					}
				}
			}
			int totalSyms = num1.size() + num2.size() + num3.size() + letterA.size() + letterB.size() + letterC.size();
			int totalNums = num1.size() + num2.size() + num3.size();
			int totalLetters = letterA.size() + letterB.size() + letterC.size();
			int totalSum = (num1.size() * 1) + (num2.size() * 2) + (num3.size() * 3);
			double totalAverage = (double)totalSum / totalNums;
			double AtoB = (double)letterA.size()/letterB.size();
			double AtoC = (double)letterA.size()/letterC.size();
			double BtoC = (double)letterB.size()/letterC.size();
			String output = String.format(
					 "%nDecoder Type: %s"
					+"%nFile: %s"
					+"%nTotal Symbols in File: %d"
					+"%n        Total Numbers in File: %d"
					+"%n        Total Letters in File: %d"
					+"%n*****************SYMBOL COUNTS*****************"
					+"%nSYMBOL           SYMBOL COUNT"
					+"%n1                %d"
					+"%n2                %d"
					+"%n3                %d"
					+"%nA                %d"
					+"%nB                %d"
					+"%nC                %d"
					+"%n*****************SYMBOL STATS*****************"
					+"%nSum of ALL Numbers in File: %d"
					+"%nAverage of ALL Numbers in File: %.4f"
					+"%nA to B Ratio: %.3f"
					+"%nA to C Ratio: %.3f"
					+"%nB to C Ratio: %.3f"
					+"%n_________________Decoded by Isaac Harris_________"
					,decoderType, filename, totalSyms, totalNums, totalLetters, num1.size(), num2.size(), num3.size(), letterA.size(), letterB.size()
					, letterC.size(), totalSum, totalAverage, AtoB, AtoC, BtoC);
			System.out.println(output);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			inputReader.close();
		}
	}
	public String getDecoderType() {
		return decoderType;
	}
	public void setDecoderType(String decoderType) {
		this.decoderType = decoderType;
	}
	
}
