
public class HarrisHw2 {

	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("TASK 1");
		System.out.println();
		//Task 1
		int[][] v1 = {{1,2,3},{4,5,6},{7,8,9}};
		int value = sumEvenValues(v1);
		System.out.println(value);
				
		System.out.println();
		System.out.println();
		System.out.println("TASK 2");
		System.out.println();
		//Task 2
		int[][] v2 = {{11,2,36},{41,50,6},{7,18,9}};
		int count = countOddValues(v2);
		System.out.println(count);
		
		System.out.println();
		System.out.println("TASK 3");
		System.out.println();
		//Task 3
		int[][] v3 = {{1,2,3},{4,51,6},{7,8,9}};
		int[] minMax = arrayMinMax(v3);
		arrayPrinter(minMax);
		
		System.out.println();
		System.out.println("TASK 4");
		System.out.println();
		//Task 4
		int[][] v4 = {{1,2,3},{4,5,6},{7,8,9}};
		int[] cd = changeArrayDimensions(v4);
		arrayPrinter(cd);
		
		System.out.println();
		System.out.println("TASK 5");
		System.out.println();
		//Task 5
		int[][] v5 = mainDiagonal1();
		arrayPrinter(v5);
		
		System.out.println();
		System.out.println("TASK 6");
		System.out.println();
		//Task 6
		double[][] v6A = {{1000,2000,3000},{4000,5000,6000},{7000,8000,9000}};
		double[][] v6B = {{1000,2000,3000},{40,5000,6000},{7000,8000,9000}};
		String[][] A6A = formattedArray(v6A);
		String[][] A6B = formattedArray(v6B);
		arrayPrinter(A6A);
		arrayPrinter(A6B);
		
		System.out.println();
		System.out.println("TASK 7");
		System.out.println();
		//Task 7
		int a = sumProduct(1,2,3,4,5);
		int b = sumProduct(1,2,3,4,5,6,7,8,9);
		System.out.println(a);
		System.out.println(b);
		
		System.out.println();
		System.out.println("TASK 8");
		System.out.println();
		//Task 8
		int[][] v8A = {{11,12,13},{14,15,16},{17,18,19}};
		int[][] v8B = {{1,12,13},{14,15,16},{17,18,19}};
		double[][] c8A = not5Inverses(v8A);
		double[][] c8B = not5Inverses(v8B);
		arrayPrinter(c8A);
		arrayPrinter(c8B);
		


	} //brackets for main
	
	//these 6 methods are for Task 0
	//first method for integer 2D array
	public static void arrayPrinter(int[][] array) {
		int indexRow = 0;
		int indexCol = 0;
		System.out.println("");
		for (int[] row: array) {
			for (int value: row) {
				System.out.print(array[indexRow][indexCol] + " ");
				indexCol += 1;
				if (indexCol >= row.length) {
					indexCol = 0;
					indexRow +=1;
	}}}}
	//second method for double 2D array
	public static void arrayPrinter(double[][] array) {
		int indexRow = 0;
		int indexCol = 0;
		System.out.println("");
		for (double[] row: array) {
			for (double value: row) {
				System.out.print(array[indexRow][indexCol] + " ");
				indexCol += 1;
				if (indexCol >= row.length) {
					indexCol = 0;
					indexRow +=1;
	}}}}
	//third method for string 2D array
	public static void arrayPrinter(String[][] array) {
		int indexRow = 0;
		int indexCol = 0;
		System.out.println("");
		for (String[] row: array) {
			for (String value: row) {
				System.out.print(array[indexRow][indexCol] + " ");
				indexCol += 1;
				if (indexCol >= row.length) {
					indexCol = 0;
					indexRow +=1;
	}}}}
	//fourth method for integer 1D array
	public static void arrayPrinter(int[] array) {
		int index = 0;
		System.out.println("");
		for (int value: array) {
			System.out.print(array[index] + " ");
			index +=1;
	}}
	//fifth method for double 1D array
	public static void arrayPrinter(double[] array) {
		int index = 0;
		System.out.println("");
		for (double value: array) {
			System.out.print(array[index] + " ");
			index +=1;
	}}
	//sixth method for string 1D array
	public static void arrayPrinter(String[] array) {
		int index = 0;
		System.out.println("");
		for (String value: array) {
			System.out.print(array[index] + " ");
			index +=1;
	}}
	
	//task 1
	public static int sumEvenValues(int[][] array) {
		int indexRow = 0;
		int indexCol = 0;
		
		int evenSums = 0;
		for (int[] row: array) {
			for (int value: row) {
				//switch statement to see if even
				switch(array[indexRow][indexCol] % 2) {
				case 0: evenSums += array[indexRow][indexCol]; break;
				}
					
				indexCol +=1;
				if (indexCol >= row.length) {
					indexCol = 0;
					indexRow +=1;
				}}}
	return evenSums;
	}
	
	//task 2
	public static int countOddValues(int[][] array) {
		int indexRow = 0;
		int indexCol = 0;
		//row picked to compare to determine if square or not
		int rowLength = array[0].length;
		int oddCount = 0;
		for (int[] row: array) {
			for(int value: row) {
				//determines if it is square array or not
				if (rowLength != row.length ) {
					System.out.println("Input is not sqaure");
					return 0;
				}
				//increases oddCount
				if (array[indexRow][indexCol] % 2 == 1) {
					oddCount +=1;
				}
				//bumps up indexes
				indexCol +=1;
				if (indexCol >= row.length) {
					indexCol = 0;
					indexRow +=1;
				}}}
	return oddCount;
	}
	
	//task 3
	//two helper methods for min and max, reused and adapted from Extra Credit 3
	public static int min(int[] num) {
		int currentMin = num[0];
		for (int value: num) {
			if (value < currentMin) {
				currentMin = value;
			}
		}
		return currentMin;
	}
	public static int max(int[] num) {
		int currentMax = 0;
		for (int value: num) {
			if (value > currentMax) {
				currentMax = value;
			}
		}
		return currentMax;
	}
	public static int[] arrayMinMax(int[][] array) {
		int indexRow = 0;
		int indexCol = 0;
		int minVals[] = new int[array.length];
		int maxVals[] = new int[array.length];
		
		for (int[] row: array) {
			for (int value: row) {
				minVals[indexRow] = min(row);
				maxVals[indexRow] = max(row);
				indexCol +=1;
				if (indexCol >= row.length) {
					indexCol = 0;
					indexRow +=1;
				}
			}
		}
		int maxValue = max(maxVals);
		int minValue = min(minVals);
		int minmaxs[] = {minValue, maxValue};
		return minmaxs;
	}
	
	//task 4
	public static int[] changeArrayDimensions(int[][] array) {
		int indexRow = 0;
		int indexCol = 0;
		
		int arrayIndex = 0;
		//this is only valid if the array is square
		int newArray[] = new int[(array.length * array[0].length)];
		
		for (int[] row: array) {
			for (int value: row) {
				newArray[arrayIndex] = array[indexRow][indexCol];
				arrayIndex +=1;
				indexCol +=1;
				if (indexCol >= row.length ) {
					indexCol = 0;
					indexRow +=1;
				}
			}
		}
		return newArray;
	}
	
	//task 5
	public static int[][] mainDiagonal1() {
		int array[][] = new int[3][3];
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				switch(row) {
				case 0: if (col == 0) {
							array[row][col] = 1;
						}
						else {
							array[row][col] = 0;
						} break;
				case 1: if (col == 1) {
							array[row][col] = 1;
						}
						else {
							array[row][col] = 0;
				} break;
				case 2: if (col == 2) {
							array[row][col] = 1;
						}
						else {
							array[row][col] = 0;
						} break;
				}}}
		return array;
	}
	//task 6
	public static String[][] formattedArray(double[][] array) {
		String badInputArray[][] = {{"SW", "SW", "SW"}, {"SW", "SW", "SW"}, {"SW", "SW", "SW"}};
		//this only holds true if it a square array
		String goodInputArray[][] = new String[array.length][array[0].length];
		int indexRow = 0;
		int indexCol = 0;
		for (double row[]: array) {
			for(double value: row) {
				if (array[indexRow][indexCol] < 1000) {
					return badInputArray;
				}
				String tempVal = String.format("%,.2f", array[indexRow][indexCol]);
				goodInputArray[indexRow][indexCol] = tempVal;
				indexCol +=1;
				if (indexCol >= row.length) {
					indexCol = 0;
					indexRow +=1;
		}}}
		return goodInputArray;
	}
	//task 7
	public static int sumProduct(int... args) {
		int numberArgs = args.length;
		int sumOfInts = 0;
		int productOfInts = 1;
		int sumProductOfInts = sumOfInts * productOfInts;
		for (int value: args) {
			System.out.print(value + " ");
			sumOfInts += value;
			productOfInts *= value;
			sumProductOfInts = sumOfInts * productOfInts;
			
		}
		System.out.println("");
		return sumProductOfInts;
	}
	//task 8
	public static double[][] not5Inverses(int[][] array) {
		double badInputArray[][] = {{0,0,0},{0,0,0},{0,0,0}};
		//this only works if it is a square array
		double goodInputArray[][] = new double[array.length][array[0].length];
		int indexRow = 0;
		int indexCol = 0;
		for (int[] row: array) {
			for (int value: row) {
				if (array[indexRow][indexCol] < 5) {
					return badInputArray;
				}
				goodInputArray[indexRow][indexCol] = (double) 1/ ((double) array[indexRow][indexCol]);
				indexCol +=1;
				if (indexCol >= row.length) {
					indexCol = 0;
					indexRow +=1;
				}}}
		return goodInputArray;
	}

} //brackets for class
