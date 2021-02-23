package Harris.ANALYSIS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StatAnalysis {
	
	public static final String DIR = "/Users/ithofar/eclipse-workspace/HarrisHW7/src";
	
	
	public static int countValues(String fp) throws IOException{
		BufferedReader inputReader = null;
		File inputFile = new File(fp);
		int numValues = 0;
		
		try {
			 inputReader = new BufferedReader(new FileReader(inputFile));
			 String line;
			 while((line = inputReader.readLine()) != null) {
				 for (char value: line.toCharArray()) {
					 if (value != ' ') {
						 numValues +=1;
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
		 return numValues;
		
	}
	
	public static double sumValues(String fp) throws IOException{
		BufferedReader inputReader = null;
		File inputFile = new File(fp);
		double sumValue = 0;
		
		try {
			 inputReader = new BufferedReader(new FileReader(inputFile));
			 String line;
			 while((line = inputReader.readLine()) != null) {
				 for (char value: line.toCharArray()) {
					 if (value != ' ') {
						 sumValue += (double) value;;
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
		 return sumValue;
	}
	
	public static double muValue(String fp) throws IOException{
		BufferedReader inputReader = null;
		File inputFile = new File(fp);
		double sumValue = 0;
		double valueCount = 0;
		
		try {
			 inputReader = new BufferedReader(new FileReader(inputFile));
			 String line;
			 while((line = inputReader.readLine()) != null) {
				 for (char value: line.toCharArray()) {
					 if (value != ' ') {
						 sumValue += (double) value;;
						 valueCount +=1;
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
		 return (sumValue/valueCount);
	}
	
	//CHECK LATER IF VARIENCE IS THE SAME AS SIGMA
	public static double sigma2(String fp) throws IOException{
		BufferedReader inputReader = null;
		File inputFile = new File(fp);
		ArrayList<Double> values = new ArrayList<>();
		double sigmaOutput = 0;
		
		try {
			 inputReader = new BufferedReader(new FileReader(inputFile));
			 String line;
			 while((line = inputReader.readLine()) != null) {
				 for (char value: line.toCharArray()) {
					 if (value != ' ') {
						 values.add((double)value);
					 }
				 }
				 sigmaOutput = variance(values);
			 }
			 
		 }
		 catch (FileNotFoundException e) {
			 e.printStackTrace();
		 }
		 finally {
			 inputReader.close();
		 }
		 return sigmaOutput;
	}
	
	public static double sigma(String fp) throws IOException{
		BufferedReader inputReader = null;
		File inputFile = new File(fp);
		ArrayList<Double> values = new ArrayList<>();
		double sigmaOutput = 0;
		
		try {
			 inputReader = new BufferedReader(new FileReader(inputFile));
			 String line;
			 while((line = inputReader.readLine()) != null) {
				 for (char value: line.toCharArray()) {
					 if (value != ' ') {
						 values.add((double)value);
					 }
				 }
				 sigmaOutput = variance(values);
			 }
			 
		 }
		 catch (FileNotFoundException e) {
			 e.printStackTrace();
		 }
		 finally {
			 inputReader.close();
		 }
		 return Math.sqrt(sigmaOutput);
	}
	
	public static double maxValue(String fp) throws IOException{
		BufferedReader inputReader = null;
		File inputFile = new File(fp);
		double max = 0;
		
		try {
			 inputReader = new BufferedReader(new FileReader(inputFile));
			 String line;
			 while((line = inputReader.readLine()) != null) {
				 for (char value: line.toCharArray()) {
					 if (value != ' ' && (double) value > max) {
						 max = (double) value;;
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
		 return max;
	}
	
	public static double minValue(String fp) throws IOException {
		BufferedReader inputReader = null;
		File inputFile = new File(fp);
		double min = 100;

		try {
			inputReader = new BufferedReader(new FileReader(inputFile));
			String line;
			while((line = inputReader.readLine()) != null) {
				for (char value: line.toCharArray()) {
					if (value != ' ' && (double) value < min) {
						min = (double) value;;
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
		return min;
	}

	public static double rangeValues(String fp) throws IOException{
		BufferedReader inputReader = null;
		File inputFile = new File(fp);
		double max = 0;
		double min = 100;
		
		try {
			 inputReader = new BufferedReader(new FileReader(inputFile));
			 String line;
			 while((line = inputReader.readLine()) != null) {
				 for (char value: line.toCharArray()) {
					 if (value != ' ' && ((double) value > max || (double) value < min)) {
						 if ((double) value > max) {
							 max = (double) value;
						 }
						 else {
							 min = (double) value;
						 }
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
		 return max - min;
	} 

	//HELPER METHODS SINCE I AM LAZY
	private static double variance(ArrayList<Double> num) {
		double currentVar = 0;
		ArrayList<Double> currentSum = new ArrayList<>();
		for (double value: num) {
			currentSum.add(Math.pow((double)value - mean(num), 2));
		}
		currentVar = sum(currentSum)/((double) num.size());
		return currentVar;
	}
	
	private static double sum(ArrayList<Double> num) {
		double currentSum = 0;
		for (double value: num) {
			currentSum += (double) value;
		}
		return currentSum;
	}
	private static double mean(ArrayList<Double> num) {
		double currentMean = 0;
		for (double value: num) {
			currentMean += value;
		}
		currentMean = currentMean/((double)num.size());
		return currentMean;
	}
}
