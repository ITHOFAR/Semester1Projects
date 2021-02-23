package Harris.FILECREATION;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import Harris.MAIN.Analytically;

public class DataGenerator implements Analytically{

	public static final String DIR = "/Users/ithofar/eclipse-workspace/HarrisHW7/src/";
	
	
	public static void buildIntergerFile(String fp, int count) throws IOException{
		BufferedWriter outputWriter = null;
		File outputFile = new File(fp);
		
		try {
			outputWriter = new BufferedWriter(new FileWriter(outputFile), 10);
			Random R = new Random();
			for (int i = 0; i < count; i++) {
				if (i % 10 == 0 && i != 0) {
					outputWriter.write("\n");
				}
				String temp = Integer.toString(R.nextInt(101));
				outputWriter.write(temp + " ");
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			outputWriter.close();
		}
	}
	
	public static void buildDecimalFile(String fp, int count) throws IOException{
		BufferedWriter outputWriter = null;
		File outputFile = new File(fp);
		
		try {
			outputWriter = new BufferedWriter(new FileWriter(outputFile), 10);
			Random R = new Random();
			for (int i = 0; i < count; i++) {
				if (i % 10 == 0 && i != 0) {
					outputWriter.write("\n");
				}
				double temp = (1 + (R.nextDouble() * 10000))/100;
				String sTemp = String.format("%.2f", temp);
				outputWriter.write(sTemp + " ");
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			outputWriter.close();
		}
	}
	
	public static void buildCharacterFile(String fp, int count) throws IOException{
		BufferedWriter outputWriter = null;
		File outputFile = new File(fp);
		
		try {
			outputWriter = new BufferedWriter(new FileWriter(outputFile), 10);
			Random R = new Random();
			for (int i = 0; i < count; i++) {
				if (i % 10 == 0 && i != 0) {
					outputWriter.write("\n");
				}
				char[] alpha = Analytically.ALPHABET;
				int index = R.nextInt(alpha.length);
				outputWriter.write(alpha[index]);
				outputWriter.write(" ");
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			outputWriter.close();
		}
	}
	
	public static void buildAlphaNumericFile(String fp, int count) throws IOException{
		BufferedWriter outputWriter = null;
		File outputFile = new File(fp);
		
		try {
			outputWriter = new BufferedWriter(new FileWriter(outputFile), 10);
			Random R = new Random();
			for (int i = 0; i < count; i++) {
				if (i % 10 == 0 && i != 0) {
					outputWriter.write("\n");
				}
				char[] alpha = Analytically.ALPHABET;
				int index = R.nextInt(alpha.length);
				outputWriter.write(alpha[index]);
				outputWriter.write(Integer.toString(R.nextInt(10)));
				outputWriter.write(" ");
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			outputWriter.close();
		}
	}
}
