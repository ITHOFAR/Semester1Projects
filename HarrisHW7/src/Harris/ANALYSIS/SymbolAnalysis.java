package Harris.ANALYSIS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SymbolAnalysis {

	public static final String DIR = "/Users/ithofar/eclipse-workspace/HarrisHW7/src";
	
	
	public static int characterCount(String fp) throws IOException {
		BufferedReader inputReader = null;
		File inputFile = new File(fp);
		int numChar = 0;
		
		 try {
			 inputReader = new BufferedReader(new FileReader(inputFile));
			 String line;
			 while((line = inputReader.readLine()) != null) {
				 for (char value: line.toCharArray()) {
					 if (value != ' ') {
						 numChar +=1;
					 }
				 }
			 }
			 
		 }
		 catch (FileNotFoundException e) {
			 e.printStackTrace();
		 }
		 finally {
			 inputReader.close();
		 }
		 return numChar;
	}
	
	public static int countSpecifiedCharacter(String fp, char c) throws IOException{
		BufferedReader inputReader = null;
		File inputFile = new File(fp);
		int numChar = 0;
		
		 try {
			 inputReader = new BufferedReader(new FileReader(inputFile));
			 String line;
			 while((line = inputReader.readLine()) != null) {
				 for (char value: line.toCharArray()) {
					 if (value == c) {
						 numChar +=1;
					 }
				 }
			 }
			 
		 }
		 catch (FileNotFoundException e) {
			 e.printStackTrace();
		 }
		 finally {
			 inputReader.close();
		 }
		 return numChar;
	}
	
	public static int wordCount(String fp) throws IOException{
		BufferedReader inputReader = null;
		File inputFile = new File(fp);
		int numWord = 0;
		
		 try {
			 inputReader = new BufferedReader(new FileReader(inputFile));
			 String line;
			 while((line = inputReader.readLine()) != null) {
				 String[] lineArray = line.split(" ");
				 numWord += lineArray.length;
			 }
		 }
		 catch (FileNotFoundException e) {
			 e.printStackTrace();
		 }
		 finally {
			 inputReader.close();
		 }
		 return numWord;
	}
	
	public static int countSpecifiedWord(String fp, String wrd) throws IOException{
		BufferedReader inputReader = null;
		File inputFile = new File(fp);
		int numWord = 0;
		
		 try {
			 inputReader = new BufferedReader(new FileReader(inputFile));
			 String line;
			 while((line = inputReader.readLine()) != null) {
				 String[] lineArray = line.split(" ");
				 for (String value: lineArray) {
					 if (value == wrd) {
						 numWord +=1;
					 }
				 }
			 }
		 }
		 catch (FileNotFoundException e) {
			 e.printStackTrace();
		 }
		 finally {
			 inputReader.close();
		 }
		 return numWord;
	}
}
