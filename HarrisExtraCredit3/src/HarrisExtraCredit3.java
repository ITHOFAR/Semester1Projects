import java.util.Arrays;

public class HarrisExtraCredit3 {

	public static void main(String[] args) {
		int test2array[][] = {{1,3,2,7,4}, {4,7,5,3,9}, {3,3,6,8,2}, {1,5,7,2,2}, {3,9,9,2,3}};
		int test3array[][] = {{1,3,2,7,4}, {4,7,5,3,9}, {3,3,6,8,2}, {1,5,7,2,2}, {3, 9, 9, 2, 3}};
		
		int[][] test1array = properTask1();
		arrayPrinter(test1array);
		
		int[][] test2Array = properTask2(test2array);
		arrayPrinter(test2Array);
		
		double[][] test3Array = properTask3(test3array);
		arrayPrinter(test3Array);
		
	}
	public static void arrayPrinter(int array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
				if(j == 4) {
					System.out.println("");
		}}}
	}
	public static void arrayPrinter(double array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%.2f ", array[i][j]);
				if(j == 4) {
					System.out.println("");
		}}}
	}

	public static int[][] taskOneArray() {
		int myArray[][] = new int[5][5];
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				if (i == 0) {
					myArray[i][j] = 1;
					System.out.print(myArray[i][j] + " ");
					if (j >= 4) {
						System.out.println();
					}
				}
				if (i == 1) {
					myArray[i][j] = (int)(Math.random() * 9);
					System.out.print(myArray[i][j] + " ");
					if (j >= 4) {
						System.out.println();
					}
				}
				if (i == 2) {
					myArray[i][j] = (int)(Math.random() * 9);
					System.out.print(myArray[i][j] + " ");
					if (j >= 4) {
						System.out.println();
					}
				}
				if (i == 3) {
					myArray[i][j] = (myArray[i-1][j] + myArray[i-2][j]);
					System.out.print(myArray[i][j] + " ");
					if (j >= 4) {
						System.out.println();
					}
				}
				if (i == 4) {
					myArray[i][j] = (int)(Math.pow((myArray[i-2][j] - myArray[i-3][j]), 2));
					System.out.print(myArray[i][j] + " ");
					if (j >= 4) {
						System.out.println();
					}
				}
			
		}
	}
	return myArray;
	}
	public static int[][] taskTwoArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == 0 || i == 3) {
					if (array[i][j] % 2 == 1) {
						array[i][j] = array[i][j] * 3;
					}
				}
				if (i == 1 || i == 2) {
					if (array[i][j] % 2 == 0) {
						array[i][j] = array[i][j] * 2;
					}
				}
			}
		}
	return array;
	}
	public static int[][] properTask2(int[][] array) {
		int indexRow = 0;
		int indexCol = 0;
		for (int row[]: array) {
			for (int value: row) {
				if (indexRow == 0 || indexRow == 3) {
					if (array[indexRow][indexCol] % 2 == 1) {
						array[indexRow][indexCol] = array[indexRow][indexCol] * 3;
					}
					indexCol += 1;
					if (indexCol > 4) {
						indexRow += 1;
						indexCol = 0;
					}
				}
				if (indexRow == 1 || indexRow == 2) {
					if (array[indexRow][indexCol] % 2 == 0) {
						array[indexRow][indexCol] = array[indexRow][indexCol] * 2;
					}
					indexCol += 1;
						if (indexCol > 4) {
						indexRow += 1;
						indexCol = 0;
					}
				}
			}
		}
	return array;
	}
	
	public static int[][] properTask1() {
		int newArray[][] = new int[5][5];
		int indexRow = 0;
		int indexCol = 0;
		for (int row[]: newArray) {
			for (int value: row) {
				if (indexRow == 0) {
					newArray[indexRow][indexCol] = 1;
					indexCol += 1;
					if (indexCol > 4) {
						indexRow += 1;
						indexCol = 0;
					}
				}
				if (indexRow == 1 || indexRow == 2) {
					newArray[indexRow][indexCol] = (int)(Math.random() * 9);
					indexCol += 1;
					if (indexCol > 4) {
						indexRow += 1;
						indexCol = 0;
					}
				}
				if (indexRow == 3) {
					newArray[indexRow][indexCol] = newArray[indexRow-1][indexCol] + newArray[indexRow-2][indexCol];
					indexCol += 1;
					if (indexCol > 4) {
						indexRow += 1;
						indexCol = 0;
					}
				}
				if (indexRow == 4) {
					newArray[indexRow][indexCol] = (int)(Math.pow(newArray[indexRow-1][indexCol] - newArray[indexRow-2][indexCol], 2));
					indexCol += 1;
					if (indexCol > 4) {
						indexRow += 1;
						indexCol = 0;
					}
				}
			}
		}
		return newArray;
	}
	
	public static double min(int[] num) {
		double currentMin = num[0];
		for (int value: num) {
			if ((double)value < currentMin) {
				currentMin = (double) value;
			}
		}
		return currentMin;
	}
	public static double mean(int[] num) {
		double currentMean = 0;
		for (int value: num) {
			currentMean += (double) value;
		}
		currentMean = currentMean/((double)num.length);
		return currentMean;
	}
	public static double max(int[] num) {
		double currentMax = 0;
		for (int value: num) {
			if ((double)value > currentMax) {
				currentMax = (double) value;
			}
		}
		return currentMax;
	}
	public static double sum(int[] num) {
		double currentSum = 0;
		for (int value: num) {
			currentSum += (double) value;
		}
		return currentSum;
	}
	public static double sum(double[] num) {
		double currentSum = 0;
		for (double value: num) {
			currentSum += value;
		}
		return currentSum;
	}
	public static double variance(int[] num) {
		double currentVar = 0;
		double currentSum[] = new double[num.length];
		int index = 0;
		for (int value: num) {
			currentSum[index] = Math.pow((double)value - mean(num), 2);
			index +=1;
		}
		currentVar = sum(currentSum)/(num.length);
		return currentVar;
	}
	
	public static double[][] properTask3(int[][] array) {
		int indexRow = 0;
		int indexCol = 0;
		double newarray[][] = new double[array.length][array.length];
		for (int row[]: array) {
			for(int value: row) {
				if (indexCol == 0) {
					newarray[indexRow][indexCol] = min(array[indexRow]);
					indexRow += 1;
					if (indexRow > 4) {
						indexRow = 0;
						indexCol += 1;
					}
				}
				if (indexCol == 1) {
					newarray[indexRow][indexCol] = mean(array[indexRow]);
					indexRow += 1;
					if (indexRow > 4) {
						indexRow = 0;
						indexCol += 1;
					}
				}
				if (indexCol == 2) {
					newarray[indexRow][indexCol] = max(array[indexRow]);
					indexRow += 1;
					if (indexRow > 4) {
						indexRow = 0;
						indexCol += 1;
					}
				}
				if (indexCol == 3) {
					newarray[indexRow][indexCol] = sum(array[indexRow]);
					indexRow += 1;
					if (indexRow > 4) {
						indexRow = 0;
						indexCol += 1;
					}
				}
				if (indexCol == 4) {
					newarray[indexRow][indexCol] = variance(array[indexRow]);
					indexRow += 1;
					if (indexRow > 4) {
						indexRow = 0;
						indexCol += 1;
					}
				}
			}
		}
	return newarray;
	}
	

}
